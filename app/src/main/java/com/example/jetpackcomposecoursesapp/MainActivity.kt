package com.example.jetpackcomposecoursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                CourseListScreen(courses = getSampleCourses())
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CourseListScreen(courses: List<Course>) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Course Catalog",
                        style = MaterialTheme.typography.headlineMedium.copy(
                            fontWeight = FontWeight.Bold
                        )
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                ),
                modifier = Modifier.shadow(elevation = 4.dp)
            )
        }
    ) { paddingValues ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            color = MaterialTheme.colorScheme.background
        ) {
            if (courses.isEmpty()) {
                EmptyCoursesView()
            } else {
                CourseList(courses = courses)
            }
        }
    }
}

@Composable
fun CourseList(courses: List<Course>) {
    LazyColumn(
        contentPadding = PaddingValues(vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(courses) { course ->
            CourseCard(course = course)
        }
    }
}

@Composable
fun EmptyCoursesView() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "No Courses Available",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Check back later for upcoming courses",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(0.8f)
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

    JetpackComposeCoursesAppTheme {
        CourseCard(course = sampleCourse)
    }
}

@Preview(showBackground = true)
@Composable
fun CourseListPreview() {
    JetpackComposeCoursesAppTheme {
        CourseListScreen(courses = getSampleCourses())
    }
}

@Preview(showBackground = true)
@Composable
fun EmptyStatePreview() {
    JetpackComposeCoursesAppTheme {
        CourseListScreen(courses = emptyList())
    }
}