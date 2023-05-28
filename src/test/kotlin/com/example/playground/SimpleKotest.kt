package com.example.playground

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class SimpleKotest : WordSpec({
    extensions(AllLifeCycleListener())

    "Hello" When {
        "asked for length" should {
            "return 5" {
                "Hello".length shouldBe 5
            }
        }
        "appended to Bob" should {
            "return Hello Bob" {
                "Hello " + "Bob" shouldBe "Hello Bob"
            }
        }
    }
})

