package pricediscount;
import java.util.Scanner;
public class PriceDiscount {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String itemname;
        float itemprice,quantity,discountrate,totalprice,discountedprice;
        
        //ask user input for needed information
        System.out.println("Enter item name: ");
        itemname=scan.nextLine();
        
        System.out.println("Enter price: ");
        itemprice=scan.nextFloat();
   
        System.out.println("Enter quantity: ");
        quantity=scan.nextFloat();
        
        System.out.println("Enter discount rate(%): ");
        discountrate=scan.nextFloat();
        scan.close();
        //change discount rate from % to decimal places
        discountrate=discountrate/100;
        //calculate total price & discounted price
        totalprice=itemprice*quantity;
        discountedprice=totalprice-(totalprice*discountrate);
        //print the details 
        System.out.println("\nItem Name: " + itemname);
        System.out.println("Price: " + String.format("%.2f", itemprice));
        System.out.println("Quantity: " + String.format("%.2f", quantity));
        System.out.println("Total Price: " + String.format("%.2f", totalprice));
        System.out.println("Discount rate: " + String.format("%.2f", discountrate * 100) + "%");
        System.out.println("Price after discount: " + String.format("%.2f", discountedprice));
}}
