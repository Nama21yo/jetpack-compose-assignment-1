package com.example.jetpackcomposecoursesapp.data

import com.example.jetpackcomposecoursesapp.data.models.Course

fun getSampleCourses(): List<Course> {
    return listOf(
        Course(
            title = "Introduction to Programming",
            code = "CS101",
            creditHours = 3,
            description = "A foundational course on programming principles using Python. Covers variables, control flow, functions, and basic data structures.",
            prerequisites = listOf()
        ),
        Course(
            title = "Data Structures and Algorithms",
            code = "CS201",
            creditHours = 4,
            description = "In-depth study of common data structures (lists, trees, graphs, hash tables) and algorithmic techniques for solving computational problems.",
            prerequisites = listOf("CS101")
        ),
        Course(
            title = "Calculus I",
            code = "MA105",
            creditHours = 4,
            description = "Introduction to differential and integral calculus. Limits, derivatives, and integrals of single-variable functions.",
            prerequisites = listOf("High School Algebra", "Trigonometry")
        ),
        Course(
            title = "Linear Algebra",
            code = "MA210",
            creditHours = 3,
            description = "Study of vector spaces, linear transformations, matrices, determinants, and systems of linear equations.",
            prerequisites = listOf("MA105")
        ),
        Course(
            title = "Introduction to Jetpack Compose",
            code = "AND303",
            creditHours = 3,
            description = "Learn to build modern Android UIs declaratively with Jetpack Compose. Covers composables, state management, layouts, and theming.",
            prerequisites = listOf("Basic Kotlin", "Android Fundamentals")
        )
    )
}
