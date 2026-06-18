# Requirement Gathering

##  Introduction

Requirement gathering is the process of identifying and documenting the needs and expectations of stakeholders for the successful development of the project.

The project **"Let's Learn Constitution in an Institution Perspective"** aims to provide students with an interactive platform to learn constitutional concepts relevant to educational institutions.

---

##  Stakeholders

### Primary Stakeholders
- Students
- Teachers
- Educational Institutions

### Secondary Stakeholders
- Project Guide
- Administrators
- Academic Evaluators

---

##  Functional Requirements

### User Management
- User Registration
- User Login and Logout
- User Profile Management

### Learning Module Management
- View Constitution Topics
- Access Learning Materials
- Read Institution-Based Constitutional Scenarios

### Quiz Management
- Attempt Quizzes
- View Quiz Scores
- Receive Instant Feedback

### Progress Tracking
- Monitor Learning Progress
- View Completed Modules
- Track Quiz Performance

### Administration
- Add Learning Modules
- Update Learning Content
- Manage Quiz Questions
- View Student Progress Reports

---

##  Software Requirements

### Development Tools
- Visual Studio Code
- Git
- GitHub
- pgAdmin 4

### Frontend
- React.js
- HTML5
- CSS3
- JavaScript

### Backend
- Python
- Flask

### Database
- PostgreSQL

### Browser
- Google Chrome
- Microsoft Edge

---

##  Expected Output

- Interactive learning platform
- Constitution learning modules
- Quiz and assessment system
- Progress tracking dashboard
- Educational resource repository

---

##  Conclusion

The gathered requirements provide a clear understanding of the project's objectives, functionalities, and technical needs. These requirements serve as the foundation for designing and developing the Constitution Learning Platform.

# Objective Definition

## Primary Objective

The primary objective of the project **"Let's Learn Constitution in an Institution Perspective"** is to develop an interactive web-based learning platform that helps students understand the Constitution of India and its relevance within educational institutions through structured learning modules, quizzes, and progress tracking.

---

## Specific Objectives

### 1. Promote Constitutional Awareness
To increase students' understanding of constitutional principles, rights, duties, and values that influence educational institutions and society.

### 2. Simplify Constitutional Concepts
To present complex constitutional topics in a simple, understandable, and student-friendly manner.

### 3. Provide Interactive Learning
To enhance learning through engaging educational modules, quizzes, and practical institution-based examples.

### 4. Support Self-Learning
To enable students to learn constitutional concepts independently at their own pace using a digital platform.

### 5. Evaluate Learning Outcomes
To assess students' understanding through quizzes and performance tracking mechanisms.

### 6. Track Student Progress
To provide a dashboard that allows students to monitor their learning achievements and completed modules.

### 7. Improve Digital Accessibility
To make constitutional education accessible anytime and anywhere through a web-based application.

### 8. Encourage Responsible Citizenship
To foster civic responsibility and awareness of constitutional values among students.

---

## Project Goal

The project aims to bridge the gap between theoretical constitutional knowledge and its practical application within educational institutions by providing an engaging, accessible, and technology-driven learning environment.

---

# User and Module Identification

## 1. User Identification

The users of the **"Let's Learn Constitution in an Institution Perspective"** system are categorized based on their roles and responsibilities.

### 1.1 Student

Students are the primary users of the system.

#### Responsibilities
- Register and login to the platform.
- Access constitution learning modules.
- Read educational content.
- Attempt quizzes.
- View quiz scores.
- Track learning progress.

#### Benefits
- Easy access to constitutional knowledge.
- Interactive learning experience.
- Self-assessment through quizzes.

---

### 1.2 Administrator

Administrators manage and maintain the system.

#### Responsibilities
- Manage student accounts.
- Add and update learning modules.
- Add and manage quiz questions.
- Monitor student progress.
- Maintain educational content.

#### Benefits
- Efficient content management.
- Easy monitoring of student performance.
- Centralized administration.

---

## 2. Module Identification

The system is divided into several functional modules.

---

### Module 1: User Management Module

#### Description
Handles user registration, login, authentication, and profile management.

#### Functions
- User Registration
- User Login
- User Logout
- Profile Management

---

### Module 2: Constitution Learning Module

#### Description
Provides educational content related to the Constitution of India and its relevance in educational institutions.

#### Topics Covered
- Preamble
- Fundamental Rights
- Fundamental Duties
- Directive Principles of State Policy
- Right to Education
- Constitutional Values in Institutions

#### Functions
- View Learning Materials
- Read Topic Explanations
- Access Institution-Based Examples

---

### Module 3: Quiz and Assessment Module

#### Description
Allows students to evaluate their understanding of constitutional concepts.

#### Functions
- Attempt Quizzes
- Submit Answers
- Calculate Scores
- Display Results

---

### Module 4: Progress Tracking Module

#### Description
Tracks student learning activities and performance.

#### Functions
- View Completed Modules
- Monitor Quiz Scores
- Display Learning Progress

---

### Module 5: Content Management Module

#### Description
Allows administrators to manage learning materials and quizzes.

#### Functions
- Add Learning Content
- Edit Learning Content
- Delete Learning Content
- Manage Quiz Questions

---

## Module Interaction Flow

Student Registration/Login
        ↓
Constitution Learning Module
        ↓
Quiz and Assessment Module
        ↓
Progress Tracking Module

Administrator
        ↓
Content Management Module
        ↓
Learning Content & Quiz Database

---

# Use Case Diagram Preparation

## Purpose

A Use Case Diagram is used to identify the interactions between users and the system. It represents the functional requirements of the system and shows how different users interact with various features.

---

## Actors

### 1. Student
The primary user who accesses learning content, takes quizzes, and tracks progress.

### 2. Administrator
The user responsible for managing content, quizzes, and student records.

---

## Use Cases

### Student Use Cases
- Register Account
- Login
- View Constitution Modules
- Read Learning Content
- Attempt Quiz
- View Quiz Results
- Track Learning Progress
- Logout

### Administrator Use Cases
- Login
- Manage Learning Modules
- Add Quiz Questions
- Update Quiz Questions
- Delete Quiz Questions
- View Student Progress
- Manage Users
- Logout

---

### use case diagram
IMAGE:https://raw.githubusercontent.com/rithika-art/let-s_learn_constitution/refs/heads/main/docs/images/student%20use%20case%20diagram.jfif

# Database Requirement Analysis

## Purpose

The Constitution Learning System requires a database to store user information, learning modules, quiz questions, quiz results, and progress tracking data. The database ensures secure storage, efficient retrieval, and proper management of educational content.

---

## Data Requirements

The system must store the following information:

### 1. User Information

Stores details of students and administrators.

Attributes:
- User ID
- Full Name
- Email
- Password
- Role (Student/Admin)
- Registration Date

---

### 2. Constitution Modules

Stores educational content related to the Constitution.

Attributes:
- Module ID
- Module Title
- Description
- Content
- Created Date

---

### 3. Quiz Information

Stores quiz questions for each module.

Attributes:
- Quiz ID
- Module ID
- Question
- Option A
- Option B
- Option C
- Option D
- Correct Answer

---

### 4. Quiz Results

Stores student quiz performance.

Attributes:
- Result ID
- User ID
- Quiz ID
- Score
- Attempt Date

---

### 5. Progress Tracking

Tracks learning progress of students.

Attributes:
- Progress ID
- User ID
- Module ID
- Completion Status
- Last Accessed Date

---

## Database Tables

### Users Table

| Field Name | Data Type | Description |
|------------|-----------|-------------|
| user_id | SERIAL | Primary Key |
| name | VARCHAR(100) | User Name |
| email | VARCHAR(100) | Unique Email |
| password | VARCHAR(255) | Encrypted Password |
| role | VARCHAR(20) | Student/Admin |

---

### Modules Table

| Field Name | Data Type | Description |
|------------|-----------|-------------|
| module_id | SERIAL | Primary Key |
| title | VARCHAR(200) | Module Title |
| description | TEXT | Module Description |
| content | TEXT | Learning Content |

---

### Quiz Table

| Field Name | Data Type | Description |
|------------|-----------|-------------|
| quiz_id | SERIAL | Primary Key |
| module_id | INTEGER | Foreign Key |
| question | TEXT | Quiz Question |
| option_a | VARCHAR(255) | Option A |
| option_b | VARCHAR(255) | Option B |
| option_c | VARCHAR(255) | Option C |
| option_d | VARCHAR(255) | Option D |
| correct_answer | VARCHAR(255) | Correct Answer |

---

### Results Table

| Field Name | Data Type | Description |
|------------|-----------|-------------|
| result_id | SERIAL | Primary Key |
| user_id | INTEGER | Foreign Key |
| quiz_id | INTEGER | Foreign Key |
| score | INTEGER | Quiz Score |
| attempt_date | TIMESTAMP | Date of Attempt |

---

### Progress Table

| Field Name | Data Type | Description |
|------------|-----------|-------------|
| progress_id | SERIAL | Primary Key |
| user_id | INTEGER | Foreign Key |
| module_id | INTEGER | Foreign Key |
| completion_status | VARCHAR(20) | Completed/In Progress |
| last_accessed | TIMESTAMP | Last Accessed Date |

---

## Relationships

1. One User can attempt many Quizzes.
2. One Module can contain many Quiz Questions.
3. One User can have multiple Progress Records.
4. One Quiz Result belongs to one User.
5. One Progress Record belongs to one Module.

---
## UI WIREFRAME DESIGN
image:https://github.com/rithika-art/let-s_learn_constitution/blob/main/docs/images/UI-WIREFRAMES.png

## Login and dashboard UI design
image:https://github.com/rithika-art/let-s_learn_constitution/blob/main/docs/images/login%20and%20dashboard%20page.png

## ER DIAGRAM
IMAGE:https://github.com/rithika-art/let-s_learn_constitution/blob/main/docs/images/ER%20DIAGRAM.png

## databse schema creation

## Navigation and form design
image:https://github.com/rithika-art/let-s_learn_constitution/blob/main/docs/images/navigation%20and%20form%20design.png

# Design Review

## 1. Overview

The design of the **"Let's Learn Constitution in an Institution Perspective"** system was reviewed to ensure that it meets the project objectives, user requirements, and functional expectations. The review focused on user interface design, database structure, navigation flow, and overall system architecture.

---

## 2. User Interface Review

### Status

✅ Approved

---

## 3. Navigation Review

The navigation structure was reviewed to ensure smooth movement between system modules.

### Student Navigation Flow

Home → Login → Dashboard → Lessons → Quiz → Progress → Logout

### Admin Navigation Flow

Admin Login → Admin Dashboard → Manage Users → Manage Lessons → Reports → Logout

### Findings

- Navigation flow is logical and easy to understand.
- Users can access required modules with minimal clicks.
- Menu structure is organized and user-friendly.

### Status

✅ Approved

---

## 4. Database Design Review

The PostgreSQL database design was reviewed to ensure proper data management.

### Tables Reviewed

- Users
- Lessons
- Quizzes
- Questions
- Progress

### Findings

- Database is normalized.
- Relationships are properly maintained.
- Redundancy is minimized.
- Data integrity is ensured through primary and foreign keys.

### Status

✅ Approved

---

## 5. Security Review

The system security mechanisms were reviewed.

### Findings

- User authentication through Login module.
- Secure storage of user information.
- Controlled access to administrative functions.
- Backend validation of user inputs.

### Status

✅ Approved

---

## 6. Architecture Review

### Technology Stack

| Component | Technology |
|------------|------------|
| Frontend | HTML, CSS, JavaScript |
| Backend | Python Flask |
| Database | PostgreSQL |

### Findings

- Architecture supports scalability.
- Frontend, backend, and database are properly separated.
- Easy maintenance and future enhancements.

### Status

✅ Approved

---

## 7. Review Summary

| Review Area | Status |
|------------|--------|
| User Interface Design | Approved |
| Navigation Design | Approved |
| Database Design | Approved |
| Security Design | Approved |
| System Architecture | Approved |

---

## 8. Conclusion

The design review confirms that the proposed system architecture, database structure, navigation flow, and user interface satisfy the project requirements. The design is considered complete and ready for implementation and testing.

**Review Status:** ✅ Design Approved for Development

