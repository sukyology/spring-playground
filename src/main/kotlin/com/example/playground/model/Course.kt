package com.example.playground.model

data class Course(
    var courseId: Int,
    var title: String,
    var description: String,
    var link: String
)

interface CrudService<T>{

    fun list() : List<T>
    fun create(t: T): T
    fun get(id: Int): T?
    fun update(id: Int, t: T)
    fun delete(id: Int)
}

class CourseService : CrudService<Course> {
    private val courses = mutableListOf<Course>(
        Course(
            courseId = 1, title = "스프링 강의", description = "스프링 강의는 구글입니다.", link = "https://google.com"
        )
    )

    override fun list(): List<Course> {
        return courses
    }

    override fun create(t: Course): Course {
        courses.add(t)
        return t
    }

    override fun get(id: Int): Course? {
        return courses.find { it.courseId == id }
    }

    override fun update(id: Int, t: Course) {
        val course = get(id)
        course?.title = t.title
        course?.description = t.description
        course?.link = t.link
    }

    override fun delete(id: Int) {
        val course = get(id)
        courses.remove(course)
    }
}