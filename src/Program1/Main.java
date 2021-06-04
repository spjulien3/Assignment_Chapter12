package Program1;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        while(x == 1) {
            Student s1 = new Student("Jane", "Doe");
            Student s2 = new Student("John", "Smith");
            Student s3 = new Student("David", "Hill");

            s1.addCourse("Math", 4, 'A');
            s1.addCourse("English", 3, 'A');
            s1.addCourse("CS", 4, 'A');
            s1.addCourse("Chemistry", 3, 'B');
            s1.addCourse("Health", 2, 'B');

            s2.addCourse("Math", 4, 'B');
            s2.addCourse("English", 3, 'B');
            s2.addCourse("CS", 4, 'C');
            s2.addCourse("Chemistry", 3, 'C');
            s2.addCourse("Health", 2, 'B');

            s3.addCourse("Math", 4, 'C');
            s3.addCourse("English", 3, 'A');
            s3.addCourse("Health", 2, 'A');
            //Jane Doe  has a 3.69
            System.out.println(s1.toString());
            //John Smith  has a 2.56
            System.out.println(s2.toString());
            //David Hill  has a 3.11
            System.out.println(s3.toString());
            System.out.println("Do you wish to run the program again? (yes(1)/no(0)");
            x = input.nextInt();
        }
    }
}
