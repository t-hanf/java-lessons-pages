public class Student {
    private String name;
    private int yearOfBirth;
    private String enrolNumber;
    private String degree;
    private float[] marks = new float[10];
    private int currentMarkIndex = 0;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setEnrolNumber(String enrolNumber) {
        this.enrolNumber = enrolNumber;
    }

    public String getEnrolNumber() {
        return enrolNumber;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public float getAge(int year) {
        // returns the age of the student
        return year - yearOfBirth;
    }

    public boolean addMark(float mark) {
        // iterates over the marks array and adds the mark to the first empty position

        if (currentMarkIndex >= marks.length)
            return false;

        marks[currentMarkIndex] = mark;
        currentMarkIndex++;
        return true;
    }

    public float getMark(int index) {
        // returns the mark at the given index
        if(index < 0 || index >= currentMarkIndex)
            return -1;
        else
            return marks[index];
    }

    public float getAverageMark() {

        float sum = 0;
        if (currentMarkIndex == 0)
            return 6.0f;

        for (int i = 0; i < currentMarkIndex; i++) {
            sum += marks[i];
        }

        return sum / currentMarkIndex;
    }
}