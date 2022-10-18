//Write a program to sum of numbers which only divisible by 5 from 1 to 100

package If_Else_Loop;

public class Summation
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i = 0; i<=100; i++)
        {
            if(i%5 == 0)
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
