package Program2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;




public class TestStudentIO {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Program2/Data/Irving-Whitewood.csv");
        Scanner input = new Scanner(file);
        try {

            Student s1 = new Student("Irving","Whitewood");
            while (input.hasNext()) {

                String s = input.nextLine();
                //splits lines by spaces and creates a string value in array to compare with desired string value
                String[] str = s.split(",");
                if (str.length == 3) {
                    int x = str[1].charAt(0)-'0';
                    s1.addCourse(str[0],x,str[2].charAt(0));
                }
            }
            //Irving Whitewood  has a 3.29
            System.out.println(s1);

        } catch (NoSuchElementException ex) {
            System.out.println("something went wrong");

        }


    }
}
