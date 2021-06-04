package Program3;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;


    public class ProcessingDataSheet {
        public static void main(String[] args) throws Exception {
            File processedData = new File("salary.txt");
            Scanner input = new Scanner(new File("src/Program3/salary.txt"));
            int countAssistant = 0;
            double salAssistant = 0;
            int countFull = 0;
            double salFull = 0;
            int countAssociate = 0;
            double salAssociate = 0;
            try {


                while (input.hasNext()) {
                    String token = input.next();
                    //checks for assistant data
                    if (token.equals("assistant")) {
                        countAssistant++;
                        salAssistant += input.nextDouble();
                    }
                    //checks for associate data
                    if (token.equals("associate")) {
                        countAssociate++;
                        salAssociate += input.nextDouble();
                    }
                    //checks for full time professor data
                    if (token.equals("full")) {
                        countFull++;
                        salFull += input.nextDouble();
                    }
                }
            } catch (NoSuchElementException ex) {

            }
            double averageFull = salFull / countFull;
            double averageAssociate = salAssociate / countAssociate;
            double averageAssistant = salAssistant / countAssistant;
            double totalSalary = salAssistant + salAssociate + salFull;
            double averageTotal = (averageAssistant + averageAssociate + averageFull) / 3;
            System.out.printf("%-8s", "The total of the salaries for Full Professors is: ");
            System.out.printf("%-8.2f", salFull);
            System.out.printf("%-8s", " The average salary for Full Professors is: ");
            System.out.printf("%-8.2f", averageFull);
            System.out.println();
            System.out.printf("%-8s", "The total of the salaries for Assistant Professors is: ");
            System.out.printf("%-8.2f", salAssistant);
            System.out.printf("%-8s", " The average salary for Assistant Professors is: ");
            System.out.printf("%-8.2f", averageAssistant);
            System.out.println();
            System.out.printf("%-8s", "The total of the salaries for Associate Professors is: ");
            System.out.printf("%-8.2f", salAssociate);
            System.out.printf("%-8s", " The average salary for Associate Professors is: ");
            System.out.printf("%-8.2f", averageAssociate);
            System.out.println();
            System.out.printf("%-8s", "The total of the salaries for the faculty is: ");
            System.out.printf("%-8.2f", totalSalary);
            System.out.printf("%-8s", " The average salary for faculty is: ");
            System.out.printf("%-8.2f", averageTotal);
            System.out.println();
            /*The total of the salaries for Full Professors is: 35678051.41 The average salary for Full Professors is: 102229.37
            The total of the salaries for Assistant Professors is: 20246511.91 The average salary for Assistant Professors is: 65949.55
            The total of the salaries for Associate Professors is: 28844146.58 The average salary for Associate Professors is: 83849.26
            The total of the salaries for the faculty is: 84768709.90 The average salary for faculty is: 84009.40*/
        }
    }

