//Write  a program to find the factorial of a given number

package If_Else_Loop;

import java.util.Scanner;

public class Factorial_of_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Input your number: ");
        int input = sc.nextInt();
        for(int i = 1; i<=input; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + input + " is: "+ factorial);
    }
}
