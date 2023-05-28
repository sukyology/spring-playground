package com.example.playground

import io.kotest.core.spec.style.WordSpec
import io.kotest.extensions.spring.SpringExtension
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.context.SpringBootTestContextBootstrapper
import org.springframework.test.context.BootstrapWith

@BootstrapWith(SpringBootTestContextBootstrapper::class)
class SpringKotest(
    private val pocController: PocController
) : WordSpec({

    extensions(SpringExtension)

    "with pocController" When {
        "call test" should {
            "return Hello Spring Test" {
                pocController.test() shouldBe "Hello Spring Test"
            }
        }
    }
})