public class UniversityResourcePlanner {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        // Fill the students array with students of my choosing
        for (int i = 0; i < students.length; i++) {
            Student tmp = new Student();
            tmp.yearOfBirth = 1998 + i;
            if (i % 2 == 0) {
                tmp.degree = "Computer Science";
            } else {
                tmp.degree = "Physics";
            }
            tmp.enrolNumber = "1234567" + i;
            tmp.name = "Student " + (i + 1);
            students[i] = tmp;
        }

        // Experimenting with getAge
        System.out.println("The age of the second student is: " + students[1].getAge(2022));

        // Adding marks to the second student
        for (int i = 0; i < 3; i++) {
            students[1].addMark(1 + i);
        }

        // Experimenting with getAverageMark
        System.out.println("Average mark for the second student is: " + students[1].getAverageMark());

        // Calling printStudentsByDegree
        printStudentsByDegree(students, "Computer Science");

        // Calling findBestStudent and print the name of the best student
        int index = findBestStudent(students);
        //
        if (index != -1) {
            System.out.println("The best student is: " + students[index].name);
        } else {
            System.out.println("No students found");
        }

        // Calling findYoungestStudent and print the name of the worst student
        index = findYoungestStudent(students);
        // if the index is -1, no students were found
        if (index != -1) {
            System.out.println("The youngest student is: " + students[index].name);
        } else {
            System.out.println("No students found");
        }

    }

    static void printStudentsByDegree(Student[] students, String degree) {
        // prints all the students with a specific degree
        System.out.println("Students with degree " + degree + ":");
        for (int i = 0; i < students.length && students[i] != null; i++) {
            // if the student has the degree, print the name
            if (students[i].degree == degree) {
                System.out.println(students[i].name);
            }
        }
    }

    static int findBestStudent(Student[] students) {
        // finds the student with the highest average mark
        // the lowest average mark is set to the maximum value of a float
        float lowestAverage = Float.MAX_VALUE;
        int lowestAverageIndex = -1;
        for (int i = 0; i < students.length && students[i] != null; i++) {
            // if the average mark is lower than the current lowest average, update the
            // lowest average
            if (students[i].getAverageMark() < lowestAverage) {
                lowestAverage = students[i].getAverageMark();
                lowestAverageIndex = i;
            }
        }

        return lowestAverageIndex;
    }

    static int findYoungestStudent(Student[] students) {
        // finds the youngest student
        // the youngest student is set to the minimum value of an int
        int youngest = 0;
        int youngestIndex = -1;
        for (int i = 0; i < students.length && students[i] != null; i++) {
            // if the year of birth is higher than the current youngest, update the youngest
            if (students[i].yearOfBirth > youngest) {
                youngest = students[i].yearOfBirth;
                youngestIndex = i;
            }
        }

        return youngestIndex;
    }
}
