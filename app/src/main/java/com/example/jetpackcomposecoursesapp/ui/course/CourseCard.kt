package com.example.jetpackcomposecoursesapp.ui.course

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecoursesapp.data.models.Course

@Composable
fun CourseCard(course : Course, modifier: Modifier = Modifier) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }

    Card (modifier = modifier
        .fillMaxWidth()
        .padding(8.dp)
        .clickable {isExpanded = !isExpanded}
        .animateContentSize(),
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(contentColor = MaterialTheme.colorScheme.surfaceVariant),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ){

        Column ( modifier = Modifier.padding(16.dp)){

            Text(
                text = course.title,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
                ){
                Text(text = "Code: ${course.code}", style = MaterialTheme.typography.bodyMedium)
                Text(text = "Credits: ${course.creditHours}", style = MaterialTheme.typography.bodyMedium)
            }

            if(isExpanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text("Description", style = MaterialTheme.typography.labelLarge)
                Text(course.description, style = MaterialTheme.typography.bodySmall)

                Spacer(modifier = Modifier.height(8.dp))
                Text("Prerequisites:", style = MaterialTheme.typography.labelLarge)
                if (course.prerequisites.isEmpty()) {
                    Text("None", style = MaterialTheme.typography.labelLarge)
                } else {
                    Column {
                        course.prerequisites.forEach {
                            Text(". $it", style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }

                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            imageVector = if (isExpanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                            contentDescription = if (isExpanded) "Collapse" else "Expand",
                            tint = MaterialTheme.colorScheme.secondary
                        )

                }
            }
        }
    }

}