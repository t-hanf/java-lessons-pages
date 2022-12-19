public class Student {
    String name;
    int yearOfBirth;
    String enrolNumber;
    String degree;
    float[] marks = new float[10];
    int currentMarkIndex = 0;

    float getAge(int year) {
        // returns the age of the student
        return year - yearOfBirth;
    }

    boolean addMark(float mark) {
        // iterates over the marks array and adds the mark to the first empty position

        if (currentMarkIndex >= marks.length)
            return false;

        marks[currentMarkIndex] = mark;
        currentMarkIndex++;
        return true;
    }

    float getAverageMark() {
        // returns the average mark of the student
        float sum = 0;
        int i = 0;
        // adds all the marks together
        for (; marks[i] != 0 && i < marks.length; i++) {
            sum += marks[i];
        }
        // if there are no marks, returns 6
        if (i == 0) {
            return 6;
        }
        // divides the sum by the number of marks and returns the result
        return sum / i;
    }
}