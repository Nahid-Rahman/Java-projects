/* Write a program to check balance and withdraw money from ATM booth using if else or switch case */

package If_Else_Loop;

import java.util.Scanner;

public class Atm_booth
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("To check Your Balance press 1");
        System.out.println("To Withdraw money from Your account press 2");
        System.out.println("Input your Choice: ");
        int input = sc.nextInt();

        Double rand = Math.random();
        Double money = rand * 100000;

        if(input==1)
        {
            System.out.println("Your account balance is: " + money);
        }
        else if (input==2)
        {
            System.out.println("Enter the amount you would like to withdraw: ");
            double amount = sc.nextDouble();
            System.out.println("Amount " + amount + " Withdraw Successful");
            System.out.println("Current Balance: " + money);
        }
    }
}
