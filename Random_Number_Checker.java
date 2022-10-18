//Write a program to generate 2 random numbers which will not be shown to the user.
// Take a user input and match it with any of the random numbers.
// If correct give it 1 point and if incorrect, do not give it any point.
// Finally, repeat this for 10 times and count the point user achieved.

package If_Else_Loop;

import java.util.Scanner;

public class Random_Number_Checker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = Math.random();
        double num2 = Math.random();
        int count = 0;
        for(int i=0; i<10; i++){
            System.out.println("Guess A Number: ");
            double userInput = sc.nextDouble();
            if(userInput==num1 || userInput == num2){
                count++;
            }
        }
        System.out.println("You achieved "+ count + " points");
    }
}
