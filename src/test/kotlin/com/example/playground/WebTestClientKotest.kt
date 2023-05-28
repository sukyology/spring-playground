package com.example.playground

import io.kotest.core.spec.style.WordSpec
import io.kotest.extensions.spring.SpringExtension
import io.kotest.matchers.shouldBe
import org.springframework.test.web.servlet.client.MockMvcWebTestClient

class WebTestClientKotest (
) : WordSpec({

    extensions(SpringExtension)

    val client = MockMvcWebTestClient.bindToController(PocController())
        .build()


    "with pocController in MockMvcWebTestClient" When {
        "call test" should {
            "return Hello Spring Test" {
                client.get().uri("/poc/test").exchange()
                    .expectStatus().isOk
                    .expectBody(String::class.java).returnResult().responseBody shouldBe "Hello Spring Test"
            }
        }
    }
})