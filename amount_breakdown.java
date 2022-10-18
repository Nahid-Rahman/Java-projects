/* Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,200,100,50,20,10,5,2,1]
Input: 1256
Output:
1000 1
100 2
50 1
2 3
 */

package Function_and_Array;
import java.util.Scanner;

public class amount_breakdown
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int notes[]={ 1000 , 500 , 200 , 100 , 50 , 20 , 10 , 5 , 2 , 1 };

        System.out.println("Enter an Amount: ");
        int amount = sc.nextInt();

        for(int i=0; i<notes.length; i++)
        {
            while(amount >= notes[i]){
                int temp = amount / notes[i];
                amount = amount % notes[i];
                System.out.print("\nTotal Number Of " + notes[i] + "TK Notes :"+ temp) ;
            break ;
            }
        }
    }
}
