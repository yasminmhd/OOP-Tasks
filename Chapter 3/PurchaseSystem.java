package purchasesystem;
//import library Scanner
import java.util.Scanner;
//class name PurchaseSystem
public class PurchaseSystem {

    public static void main(String[] args) {
        
        //object name scan
        Scanner scan=new Scanner(System.in);
        //declare variable and data type
        String cake;
        int order,quantity,itemprice=0,total;
        
        //ask user to choose an order
        System.out.println("1. Carrot Cake     : RM 7.00");
        System.out.println("2. Red Velvet Cake : RM 8.00");
        System.out.println("3. Cheese Cake     : RM 6.00");
        System.out.println("4. Strawberry Cake : RM 7.00");
        System.out.println("5. Tiramisu Cake   : RM 10.00");        
        System.out.println("Please choose a cake: ");
        order=scan.nextInt();
                

        //the order switch
        switch(order){
            case 1:
                System.out.println("\nChosen Item: Carrot Cake");
                itemprice=7;
                System.out.println("Insert quantity :");
                quantity = scan.nextInt();

                break;
            case 2:
                System.out.println("\nChosen Item: Red Velvet Cake");
                itemprice=8;
                System.out.println("Insert quantity :");
                quantity = scan.nextInt();
                break;
            case 3:
                System.out.println("\nChosen Item: Cheese Cake");
                itemprice=6;
                System.out.println("Insert quantity :");
                quantity = scan.nextInt();
                break;
            case 4:
                System.out.println("\nChosen Item: Strawberry Cake");
                itemprice=7;
                System.out.println("Insert quantity :");
                quantity = scan.nextInt();
                break;
            case 5:
                System.out.println("\nChosen Item: Tiramisu Cake");
                itemprice=10;
                System.out.println("Insert quantity :");
                quantity = scan.nextInt();
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }
        
        //calculate the total price
        total=itemprice*quantity;
        
        scan.close();
        
        //display important information
        System.out.println("\nItem Price: RM"+ itemprice);
        System.out.println("Quantity: "+ quantity);
        System.out.println("Total Price : RM "+ total);
    }
    
}
