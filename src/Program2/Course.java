package Program2;


public class Course {

    private final  String courseName;
    private final int creditHours;
    private final char letterGrade;

    public Course(String courseName, int creditHours, char letterGrade) {
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.letterGrade = letterGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public int getQualityPoints() {
        switch (letterGrade) {
            case 'A': return 4;
            case 'B': return 3;
            case 'C': return 2;
            case 'D': return 1;
            default: return 0;
        }
    }

}
