package com.example.playground

import io.kotest.core.listeners.AfterContainerListener
import io.kotest.core.listeners.AfterEachListener
import io.kotest.core.listeners.AfterInvocationListener
import io.kotest.core.listeners.AfterProjectListener
import io.kotest.core.listeners.AfterSpecListener
import io.kotest.core.listeners.AfterTestListener
import io.kotest.core.listeners.BeforeContainerListener
import io.kotest.core.listeners.BeforeEachListener
import io.kotest.core.listeners.BeforeInvocationListener
import io.kotest.core.listeners.BeforeProjectListener
import io.kotest.core.listeners.BeforeSpecListener
import io.kotest.core.listeners.BeforeTestListener
import io.kotest.core.listeners.FinalizeSpecListener
import io.kotest.core.listeners.IgnoredSpecListener
import io.kotest.core.listeners.InstantiationErrorListener
import io.kotest.core.listeners.InstantiationListener
import io.kotest.core.listeners.PrepareSpecListener
import io.kotest.core.listeners.ProjectListener
import io.kotest.core.listeners.TestListener
import io.kotest.core.spec.Spec
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult
import kotlin.reflect.KClass

class AllLifeCycleListener :
    BeforeSpecListener, AfterSpecListener, AfterContainerListener, AfterEachListener,
    AfterInvocationListener, AfterProjectListener, AfterTestListener, BeforeContainerListener,
    BeforeEachListener, BeforeInvocationListener, BeforeProjectListener, BeforeTestListener, FinalizeSpecListener,
    IgnoredSpecListener, InstantiationListener, InstantiationErrorListener, PrepareSpecListener, ProjectListener,
    TestListener {

    override suspend fun beforeSpec(spec: Spec) {
        println("beforeSpec${spec}")
    }

    override suspend fun beforeContainer(testCase: TestCase) {
        println("beforeContainer${testCase.name}")
    }

    override suspend fun beforeEach(testCase: TestCase) {
        println("beforeEach${testCase.name}")
    }

    override suspend fun beforeAny(testCase: TestCase) {
        println("beforeAny${testCase.name}")
    }

    override suspend fun beforeTest(testCase: TestCase) {
        println("beforeTest${testCase.name}")
    }

    override suspend fun beforeInvocation(testCase: TestCase, iteration: Int) {
        println("beforeInvocation${testCase.name}")
    }

    override suspend fun afterInvocation(testCase: TestCase, iteration: Int) {
        println("afterInvocation${testCase.name}")
    }

    override suspend fun afterTest(testCase: TestCase, result: TestResult) {
        println("afterTest${testCase.name}")
    }
    override suspend fun afterAny(testCase: TestCase, result: TestResult) {
        println("afterAny${testCase.name}")
    }

    override suspend fun afterEach(testCase: TestCase, result: TestResult) {
        println("afterEach${testCase.name}")
    }

    override suspend fun afterContainer(testCase: TestCase, result: TestResult) {
        println("afterContainer${testCase.name}")
    }

    override suspend fun afterSpec(spec: Spec) {
        println("afterSpec${spec}")
    }


    //doesn't get called from here
    override suspend fun finalizeSpec(kclass: KClass<out Spec>, results: Map<TestCase, TestResult>) {
        println("finalizeSpec")
    }

    override suspend fun prepareSpec(kclass: KClass<out Spec>) {
        println("prepareSpec")
    }

    override suspend fun ignoredSpec(kclass: KClass<*>, reason: String?) {
        println("ignoredSpec")
    }

    override suspend fun instantiationError(kclass: KClass<*>, t: Throwable) {
        println("instantiationError")
    }

    override suspend fun specInstantiated(spec: Spec) {
        println("specInstantiated$spec")
    }

    override suspend fun afterProject() {
        println("afterProject")
    }


    override suspend fun beforeProject() {
        println("beforeProject")
    }



}