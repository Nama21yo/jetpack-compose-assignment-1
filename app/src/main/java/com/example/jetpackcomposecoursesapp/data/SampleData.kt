package com.example.jetpackcomposecoursesapp.data

import com.example.jetpackcomposecoursesapp.data.models.Course

fun getSampleCourses(): List<Course> {
    return listOf(
        // Original courses
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
        ),

        // Additional Software Engineering courses
        Course(
            title = "Software Engineering Fundamentals",
            code = "SE300",
            creditHours = 4,
            description = "Introduction to software engineering principles, methodologies, and practices. Covers the software development lifecycle, requirements analysis, design patterns, testing strategies, and project management.",
            prerequisites = listOf("CS201")
        ),
        Course(
            title = "Database Systems",
            code = "CS330",
            creditHours = 3,
            description = "Design and implementation of database systems. Topics include data modeling, relational algebra, SQL, normalization, transaction processing, and database design principles.",
            prerequisites = listOf("CS201")
        ),
        Course(
            title = "Web Development",
            code = "SE310",
            creditHours = 3,
            description = "Comprehensive introduction to full-stack web development. Covers HTML, CSS, JavaScript, RESTful APIs, and modern web frameworks. Includes hands-on projects to build responsive and interactive web applications.",
            prerequisites = listOf("CS101")
        ),
        Course(
            title = "Mobile App Development",
            code = "SE320",
            creditHours = 3,
            description = "Design and development of mobile applications for Android and iOS platforms. Covers UI design principles, platform-specific guidelines, data persistence, and integration with backend services.",
            prerequisites = listOf("CS201", "SE310")
        ),
        Course(
            title = "Agile Software Development",
            code = "SE340",
            creditHours = 3,
            description = "Exploration of agile methodologies including Scrum, XP, and Kanban. Focuses on iterative development, continuous integration, test-driven development, and team collaboration. Includes real-world project experience.",
            prerequisites = listOf("SE300")
        ),
        Course(
            title = "Cloud Computing",
            code = "SE410",
            creditHours = 3,
            description = "Introduction to cloud computing architectures, services, and deployment models. Covers IaaS, PaaS, SaaS, containerization, microservices, serverless computing, and cloud security considerations.",
            prerequisites = listOf("CS330", "SE300")
        ),
        Course(
            title = "DevOps Practices",
            code = "SE430",
            creditHours = 3,
            description = "Principles and practices of DevOps. Covers continuous integration/continuous delivery (CI/CD), infrastructure as code, containerization with Docker, orchestration with Kubernetes, and monitoring tools.",
            prerequisites = listOf("SE300", "SE410")
        ),
        Course(
            title = "Software Testing and Quality Assurance",
            code = "SE350",
            creditHours = 3,
            description = "Comprehensive overview of software testing techniques and quality assurance practices. Covers unit testing, integration testing, system testing, test automation, and quality metrics.",
            prerequisites = listOf("SE300")
        ),
        Course(
            title = "Software Architecture",
            code = "SE420",
            creditHours = 4,
            description = "Study of software architecture principles, patterns, and practices. Examines architectural styles, component-based design, service-oriented architecture, and architecture evaluation methods.",
            prerequisites = listOf("SE300", "CS330")
        ),
        Course(
            title = "Machine Learning for Software Engineers",
            code = "SE450",
            creditHours = 4,
            description = "Application of machine learning techniques in software development. Covers supervised and unsupervised learning, neural networks, natural language processing, and integration of ML models into software applications.",
            prerequisites = listOf("CS201", "MA210", "SE300")
        ),
        Course(
            title = "Cybersecurity Fundamentals",
            code = "SE360",
            creditHours = 3,
            description = "Introduction to cybersecurity principles and practices. Covers threat modeling, secure coding practices, common vulnerabilities, encryption, authentication, and security testing methodologies.",
            prerequisites = listOf("CS201", "SE300")
        ),
        Course(
            title = "Software Project Management",
            code = "SE400",
            creditHours = 3,
            description = "Principles and practices of software project management. Covers project planning, estimation, risk management, team dynamics, resource allocation, and project tracking using both traditional and agile methodologies.",
            prerequisites = listOf("SE300", "SE340")
        ),
        Course(
            title = "UI/UX Design for Developers",
            code = "SE370",
            creditHours = 3,
            description = "User interface and user experience design principles for software developers. Covers user research, wireframing, prototyping, usability testing, accessibility, and implementation of effective user interfaces.",
            prerequisites = listOf("SE310")
        )
    )
}