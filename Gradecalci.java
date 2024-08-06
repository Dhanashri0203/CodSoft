import java.util.Scanner;

public class GradeCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter total number of Subject of their marks
        System.out.println("N of subject:");
        int numSub = sc.nextInt();
        int totalmarks = 0;

        for(int i = 1; i <=numSub; i++) {
            System.out.println("Enter Marks of Subject :" + i + "out of 100.");
            int marks = sc.nextInt();

            //input validationS
            while(marks < 0 || marks > 100) {
                System.out.println("Invalid Marks,Please enter marks inside 100 .");
                System.out.println("Enter Marks of Subject : "+ i + " out of 100 .");

            }
            totalMarks +=marks;
        }
        System.out.println("Result");
        System.out.println("Total Marks = " + totalMarks);
        int averagePercentage = totalMarks / numSub;
        System.out.println("Average percentage = " + averagePercentag);
        if (averagePercentage = 90) {
            System.out.println("Grade is : A+");
        } else if (averagePercentag >= 85) {
            System.out.println("Grade is : A");
        } else if (averagePercentag >= 65) {
            System.out.println("Grade is : B");
        }  

        else if (averagePercentag >= 55)  {
            System.out.println("Grade is : C");
        }else if (averagePercentag >= 50) {
            System.out,println("Grade is : D");
        }else {
            System.out.println("Grade is : F");
        }
    }
}
