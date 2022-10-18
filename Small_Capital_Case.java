// Write a program to check if inputted letter is small or capital

package If_Else_Loop;

import java.util.*;

public class Small_Capital_Case
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your letter: ");
        char input = sc.next().charAt(0);

        if (input>='A' && input<='Z')
        {
            System.out.println("The letter you inputted is a Capital letter");
        }
        else if (input>='a' && input<='z')
        {
            System.out.println("The letter you inputted is a Small letter");
        }
    }
}
