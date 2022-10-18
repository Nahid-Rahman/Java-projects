/* Suppose a software system excepts valid credentials from user to logged in to the system.
if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked".
Let the username: admin, password: admin@123
 */

package Function_and_Array;
import java.util.Scanner;

public class login
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String USERNAME = "admin";
        String PASSWORD = "admin@123";

        int flag=0;

        for(int i=0; i<3; i++)
        {
            System.out.println("Input Username: ");
            String username = sc.next();
            System.out.println("Input Password: ");
            String password = sc.next();
            if(username != USERNAME || password != PASSWORD)
            {
                flag++;
                if (flag <3)
                {
                    System.out.println("WRONG USERNAME OR PASSWORD. TRY AGAIN");
                }
                if(flag == 3)
                {
                    System.out.println("Your user has been temporary locked");
                }
            }
        }
    }
}