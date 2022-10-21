/* Create your todays bazar list/pocket expenditure which includes the item name and price.
Then create a function named searchItem(String item) which will be used to search any item from your HashMap
and return the price. If found no item, then print message as "No item found" and another function
named totalSum() which will return total price of items.
 */

package Function_and_Array;

import java.util.HashMap;
import java.util.Scanner;

public class bazar_list
{

    public static void main(String[] args)
    {
        bazar_list bazar_list1 = new bazar_list();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a product name: ");
        String product = sc.nextLine();

        String message = bazar_list1.searchItem(product);
        int totalPrice = bazar_list1.Sum();

        if( message == "Item not found" )
        {
            System.out.println(message);
        }
        else
        {
            System.out.println("Price of " + product + " is " + message);
        }
        System.out.println("Total price is : " + totalPrice);
    }

    public HashMap list()
    {
        HashMap list = new HashMap();
        list.put("monitor", 10000);
        list.put("mouse",2000);
        list.put("keyboard",4000);
        list.put("cpu",40000);
        list.put("gpu",35000);
        return list;
    }

    public String searchItem(String product)
    {
        HashMap list = list();

        if( list.containsKey(product)){
            String price = list.get(product).toString();
            return price;
        }
        else
        {
            return "Item not found";
        }
    }

    public int Sum()
    {
        HashMap list = list();
        int total = 0;

        Object priceArray [] = list.values().toArray();

        for (int i=0; i<priceArray.length; i++)
        {
            total = Integer.parseInt(priceArray[i].toString());
        }
        return total;
    }

}
