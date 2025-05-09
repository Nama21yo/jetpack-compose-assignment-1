package com.example.jetpackcomposecoursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecoursesapp.data.getSampleCourses
import com.example.jetpackcomposecoursesapp.data.models.Course
import com.example.jetpackcomposecoursesapp.ui.course.CourseCard
import com.example.jetpackcomposecoursesapp.ui.theme.JetpackComposeCoursesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeCoursesAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    CourseList(courses = getSampleCourses())
                }
            }
        }
    }
}

@Composable
fun CourseList(courses: List<Course>) {
    LazyColumn {
        items(courses) { course ->
            CourseCard(
                course = course
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CourseCardPreview() {
    val sampleCourse = Course(
        title = "Introduction to Programming",
        code = "CS101",
        creditHours = 3,
        description = "A foundational course on programming principles using Python. Covers variables, control flow, functions, and basic data structures.",
        prerequisites = listOf()
    )

    CourseListAppTheme {
        CourseCard(course = sampleCourse)
    }
}

@Composable
fun CourseListAppTheme(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun CourseListPreview() {
    val courses = getSampleCourses()
    CourseListAppTheme {
        CourseList(courses = courses)
    }
}
