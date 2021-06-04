package Program2;

import Program1.Course;

import java.util.ArrayList;

public class Student {
    private String fname;
    private String lname;
    private ArrayList<Course> courseList;

    public Student() {
    }
// constructor that creates first and last name and the course arrayList
    public Student(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        courseList = new ArrayList<Course>();
    }

    public double computeGpa(ArrayList<Course>courseList) {
        double gpa;
        double pointValue = 0;
        double totalCredit = 0;
        double qualityPointValue = 0;
        //this loop gets to the total amount of credits to use in the equation for evaluating GPA
        for (int i = 0; i < courseList.size(); i++) {
            totalCredit += courseList.get(i).getCreditHours();
        }

        for (int i = 0; i < courseList.size(); i++) {
            pointValue=courseList.get(i).getQualityPoints();

            //quality point value is a temporary variable used to get the point value of a grade
            // and the credit hour of the course to multiply them together
            qualityPointValue += pointValue * courseList.get(i).getCreditHours();
        }

        // the temporary variable then divides by credit hours to give the gpa
        gpa = qualityPointValue / totalCredit;
        //these two lines just give a rounded up version of the GPA by using the rounding of Math.round
        //for some reason decimal formater was not working
        gpa = Math.round(gpa * 100);
        gpa = gpa / 100;

        return gpa;
    }
    //method takes in course name credit ours and grade to create new course for the students course arrayList
    public void addCourse(String courseName, int creditHours, char letterGrade) {
            courseList.add(new Course(courseName, creditHours, letterGrade));

    }

    public String toString() {
        return fname + " " + lname + " " + " has a " + computeGpa(courseList);
    }
}


