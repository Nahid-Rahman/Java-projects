//Input 2 decimal numbers and check if they are both same or different up to two decimal places.
// E.g 120.546 & 120.241

package If_Else_Loop;

import java.util.Scanner;

public class Comparison_on_Decimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the First number: ");
        double number1 = sc.nextDouble();
        String num1 = String.format("%.2f", number1);
        System.out.println("Input the Second number: ");
        double number2 = sc.nextDouble();
        String num2 = String.format("%.2f", number2);

        if(num1.equals(num2))
        {
            System.out.println("They are both same up to two decimal places");
        }
        else{
            System.out.println("They are different up to two decimal places");
        }
    }
}
