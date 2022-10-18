//Write a program to calculate GPA and find grade

package If_Else_Loop;

import java.util.Scanner;

public class Gpa {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double gradePoint = 0.0;
        System.out.println("How many courses you took? ");
        int courses = sc.nextInt();

        for (int i = 1; i <= courses; i++)
        {
            System.out.println("What is your grade point on course " + i + "? :");
            gradePoint += sc.nextDouble();
        }

        double gpa = gradePoint / courses;

        if (gpa == 5.0)
        {
            System.out.println("Your grade is A+");
        }
        else if ((gpa < 5.0 && gpa >= 4.0))
        {
            System.out.println("Your grade is A");
        }
        else if ((gpa < 4.0 && gpa >= 3.5))
        {
            System.out.println("Your grade is A-");
        }
        else if ((gpa < 3.5 && gpa >= 3.0))
        {
            System.out.println("Your grade is B");
        }
        else if ((gpa < 3.0 && gpa >= 2.5))
        {
            System.out.println("Your grade is B-");
        }
        else if ((gpa < 2.5 && gpa >= 2.0))
        {
            System.out.println("Your grade is C");
        }
        else if ((gpa < 2.0))
        {
            System.out.println("Your grade is F");
        }
    }
}
