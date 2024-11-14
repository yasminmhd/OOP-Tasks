package discountprogram;
//import library Scanner
import java.util.Scanner;
//class name DiscountProgram
public class DiscountProgram {

    public static void main(String[] args) {
        
        //object name scan
        Scanner scan=new Scanner(System.in);
        
        //declare variable and data type, initialize discountrate
        String itemname;
        int colorcode;
        float discountrate=0,itemprice,quantity,totalprice,discountedprice;
        
         //ask user to choose a color code
        System.out.println("1. Red\n2. Yellow\n3. Green\n4. Blue\n5. Purple");
        System.out.println("Please choose a color code: ");
        colorcode=scan.nextInt();

        //the discount rate based on color code
        switch(colorcode){
            //set discount rate for red 5%
            case 1:
                discountrate=5;
                break;
            //set discount rate for yellow 15%
            case 2:
                discountrate=15;
                break;
            //set discount rate for green 30%
            case 3:
                discountrate=30;
                break;
            //set discount rate for blue 50%
            case 4:
                discountrate=50;
                break;
            //set discount rate for purple 75%
            case 5:
                discountrate=75;
                break;
        }
        //ask user input for needed information (item name, price, quanitity)
        scan.nextLine();
        System.out.println("Enter item name: ");
        itemname=scan.nextLine();
        
        System.out.println("Enter price: ");
        itemprice=scan.nextFloat();
   
        System.out.println("Enter quantity: ");
        quantity=scan.nextFloat();
        
        scan.close();
        
        //change discount rate from % to decimal places
        discountrate=discountrate/100;
        
        //formula for total price and discounted price
        totalprice=itemprice*quantity;
        discountedprice=totalprice-(totalprice*discountrate);
        
        //display the information (item name, price, quantity, total price, discount rate, price)
        System.out.println("\nItem Name: " + itemname);
        System.out.println("Price: " + String.format("RM%.2f", itemprice));
        System.out.println("Quantity: " + String.format("%.0f", quantity));
        System.out.println("Total Price: " + String.format("RM%.2f", totalprice));
        System.out.println("Discount rate: " + String.format("%.0f", discountrate * 100) + "%");
        System.out.println("Price after discount: " + String.format("RM%.2f", discountedprice));
        
}  
}
