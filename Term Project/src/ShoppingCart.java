import java.io.*;
import java.util.*;

public class ShoppingCart {

    static ArrayList<Item> cartItems = new ArrayList<Item>();
    static float total = 0;
    static Scanner in = new Scanner(System.in);

    public static void AddToCart(Item i) throws IOException {
        cartItems.add(i);
        System.out.println("Do you want to continue or checkout? ");
        System.out.println("1.Continue Shopping\n2.Checkout");
        int schoice = in.nextInt();
        switch (schoice) {
            case 1:
                Item.main(null);
                break;
            case 2:
                ShoppingCart.PrintInvoice();
                break;
        }
    }

    public static void RemoveItem(int id) throws IOException {
        for (Item i : cartItems) {
            if (i.getItemid() == id) {
                cartItems.remove(i);
                float price = i.getItemPrice();
                total -= price;
            } else {
                System.out.println("No such item in cart");
                ShoppingCart.PrintInvoice();
            }
        }
        ShoppingCart.PrintInvoice();
    }

    public static float TotalPrice() {
        total = 0;
        for (Item i : cartItems) {
            float price = i.getItemPrice();
            total += price;
        }
        return total;
    }

    public static void PrintInvoice() throws IOException {
        System.out.println("*****************************************************************************************");
        System.out.println("!!!------------------------------Your order is success-------------------------------!!!");
        System.out.println("*****************************************************************************************");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Product Name    	   Product Code	    Price");
        System.out.println("=============    	   ============     ======");
        for (Item i : cartItems) {
            System.out.println(i.getItemName() +"                     "+ i.getItemid() + "          "+ i.getItemPrice()) ;

        }
        System.out.println();
        System.out.println(" Total bill of purchased items:  "+TotalPrice());


        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<---Thank For Shopping With Us--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("*****************************************************************************************");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Total Amount = " + TotalPrice());
        System.out.println("Do you want to continue to payment or remove items in cart?");
        System.out.println("1.Make Payment\n2.Edit Cart");
        int schoice2 = in.nextInt();
        switch (schoice2) {
            case 1:
                CheckOut.main(null);
                break;
            case 2:
                System.out.println("Enter id of the item to be removed");
                int idremove = in.nextInt();
                ShoppingCart.RemoveItem(idremove);
                break;
        }
    }
}

