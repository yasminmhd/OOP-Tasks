package method2;
import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Menu {
    public static void cakemenu(){
        
        //object name scan
        Scanner scan = new Scanner(System.in);
        int total=0;
        int price=0;
        //intitialize the loop to yes
        String exit="yes";

            System.out.println("--------------------------------------");
            System.out.println("|         Welcome to The Cake        |");
            System.out.println("--------------------------------------");
            System.out.println("|            List of cakes           |");
            System.out.println("|     A. Carrot Cake     : RM 5.00   |");
            System.out.println("|     B. Red Velvet Cake : RM 6.00   |");
            System.out.println("|     C. Cheese Cake     : RM 3.00   |");
            System.out.println("______________________________________");
            
        while(!exit.equalsIgnoreCase("no")){
            System.out.println("\nInsert code of your desired cake :");
            char cakecode = scan.next(".").charAt(0);
            
            System.out.println("\nInsert quantity :");
            int quantity = scan.nextInt();
            
            switch (cakecode){
                case 'A':
                    System.out.println("\nCarrot Cake : RM 5");
                    price=5;
                    break;
                case 'B':
                    System.out.println("\nRed Velvet Cake : RM 6.00");
                    price=6;
                    break;
                case 'C':
                    System.out.println("\nCheese Cake : RM 3");
                    price=3;
                    break;
                default:
                    System.out.println("\nInvalid code");
                    break;
                }
            total = Total.totalCount(quantity,price);
            System.out.println("\nTotal Price : RM "+ total);
            scan.nextLine();
            //ask the user if they want to continue or exit
            System.out.println("\nDo you want to continue? (yes/no)");
            exit=scan.nextLine();
            System.out.println();        
        }
        //close the scanner
        scan.close();
    }
}
