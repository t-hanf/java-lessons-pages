public class UniversityResourcePlanner {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        // Fill the students array with students of my choosing
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setYearOfBirth(1998 + i);
            if (i % 2 == 0) {
                students[i].setDegree("Computer Science");
            } else {
                students[i].setDegree("Physics");
            }
            students[i].setEnrolNumber("1234567" + i);
            students[i].setName("Student " + (i + 1));
        }

        // Experimenting with getAge
        System.out.println("The age of the second student is: " + students[1].getAge(2022));

        // Adding marks to the second student
        for (int i = 0; i < 3; i++) {
            students[1].addMark(1 + i);
        }

        // Experimenting with getAverageMark
        System.out.println("Average mark for the second student is: " + students[1].getAverageMark());

        // Calling printstudentsByDegree
        System.out.println("Students in Computer Science:");
        currentDegree(students, "Computer Science");

        // Calling findBestStudent and print the name of the best student
        Student bestStudent = getBestStudent(students);
        if (bestStudent != null) {
            System.out.println("The best student is: " + bestStudent.getName());
        } else {
            System.out.println("No students found");
        }

        // Calling findYoungestStudent and print the name of the worst student
        int index = findYoungestStudent(students);
        // if the index is -1, no students were found
        if (index != -1) {
            System.out.println("The youngest student is: " + students[index].getName());
        } else {
            System.out.println("No students found");
        }

    }

    public static void currentDegree(Student[] students, String degree) {
        // prints the degree of all students
        int h = 0;
        while (h < students.length) {
            if (students[h].getDegree() == degree) {
                System.out.println(students[h].getName());
            }
            h++;
        }
    }

    public static Student getBestStudent(Student[] students) {
        // finds the best student
        // initialises currentBestAvgMark to the maximum value of a float,
        // for each student with a lower
        // mark than the current best, update the current best
        Student currentBestStudent = null;
        float currentBestAvgMark = Float.MAX_VALUE;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getAverageMark() < currentBestAvgMark) {
                currentBestAvgMark = students[i].getAverageMark();
                currentBestStudent = students[i];
            }
        }

        return currentBestStudent;
    }

    public static int findYoungestStudent(Student[] students) {
        // finds the youngest student
        float youngest = Float.MAX_VALUE;
        int youngestIndex = -1;
        for (int i = 0; i < students.length && students[i] != null; i++) {
            // if the year of birth is higher than the current youngest, update the youngest
            if (students[i] != null && students[i].getAge(2022) < youngest) {
                youngest = students[i].getAge(2022);
                youngestIndex = i;
            }
        }

        return youngestIndex;
    }
}
