---
title: School
number: 4
lesson: 4
status: reviewed
authors: thanf
---

![Class diagram](/images/student_teacher_lesson.png){:class="img-center"}

### Description
Finish implementing the given diagram. Some code was already written during the lesson. This should be your basis. You can use your own code or use the code from [here](https://github.com/t-hanf/java-lessons-code/tree/main/lessons/Lesson_4). Three classes are missing: `Teacher`, `Student` and `Lesson`. Implement them and test your implementation.


### Exercise

#### Teacher
* should have a max of **3** subjects
* the subjects should only be set via the **Constructor**
* you can be creative with the `teach` method but check if the teacher can teach this subject

#### Student
* should have a max of **10** lessons
* the lessons should only be set via the `addLesson` method
* keep track of how many lessons were already added

#### Lesson
* the `date` and `teacher` attributes can change (**setter**)
* you can use `String` as the data type for `date` or try using [LocalDateTime](https://www.w3schools.com/java/java_date.asp)

#### Extra (only if you want to do more)
* create a class `Class` which has a `Teacher` and a number of `Student`s
* add a method `printTimeTable()` to `Student` which prints the time table for the student (lessons with dates).

### Hints
- create **getter** and **setter** methods as you want/need
- **Constructors** are **not** always given in the diagram
- an **array** has to be initialized before using it