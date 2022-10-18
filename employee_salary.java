/*  Suppose, in a company , here are some employee salaries in an array
[35000, 25000, 28000, 32500, 44000, 32800]
Find out the 3rd highest salary
 */

/*  I WROTE A GENERAL PROGRAM WHERE IT CAN FIND ANY HIGHEST SALARY ACCORDING TO
NUMBER OF EMPLOYEES AND THEIR SALARY INPUTTED BY USER   */

package Function_and_Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class employee_salary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees do you have? ");
        int employees = sc.nextInt();
        int employee[] = new int [employees];
        for(int i = 1; i<=employee.length; i++)
        {
            System.out.println("Enter salary of your employee "+ i +":");
            int salary = sc.nextInt();
            employee[i-1]= salary;
        }
        Arrays.sort(employee);
        System.out.println("Which highest serial salary you want us to show? ");
        int serial = sc.nextInt();
        System.out.println(employee[serial-1]);
    }
}
