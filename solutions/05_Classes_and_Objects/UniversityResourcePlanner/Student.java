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

        float sum = 0;
        if (currentMarkIndex == 0)
            return 6.0f;

        for (int i = 0; i < currentMarkIndex; i++) {
            sum += marks[i];
        }

        return sum / currentMarkIndex;
    }
}