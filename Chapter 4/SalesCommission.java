package salescommission;
//import Scanner library
import java.util.Scanner;
//class name SalesCommission
public class SalesCommission {
    public static void main(String[] args) {
        //object name scan
        Scanner scan=new Scanner(System.in);
        //declare the variables
        double earning,commission,grosssale,solditem;
        
        //intitialize the loop to yes
        String exit="yes";

        while(!exit.equalsIgnoreCase("no")){
        
            System.out.println("1. Carrot Cake     : RM 7.00");
            System.out.println("2. Red Velvet Cake : RM 9.00");
            System.out.println("3. Cheese Cake     : RM 6.00");
            System.out.println("4. Strawberry Cake : RM 8.00");
        
            //ask the user to input the number of amount sold
            System.out.println("\nPlease insert the amount sold for each item: ");
            System.out.print("Carrot Cake: ");
            solditem=scan.nextInt();
            grosssale=7*solditem;
            System.out.print("Red Velvet Cake: ");
            solditem=scan.nextInt();
            grosssale=grosssale+(9*solditem);
            System.out.print("Cheese Cake: ");
            solditem=scan.nextInt();
            grosssale=grosssale+(6*solditem);
            System.out.print("Strawberry Cake: ");
            solditem=scan.nextInt();
            grosssale=grosssale+(8*solditem);
        
            //calculate the commission and earning
            commission=grosssale*0.05;
            earning=600+commission;
        
            //display all the information
            System.out.println("\nGross sale: RM"+String.format("%.2f",grosssale));
            System.out.println("Sales Commission (5%): RM"+String.format("%.2f",commission));
            System.out.println("Your earning for this week : RM"+String.format("%.2f",earning));
            
            scan.nextLine(); 
            //ask the user if they want to continue or exit
            System.out.println("\nDo you want to continue? (yes/no)");
            exit=scan.nextLine();
        }
        //close the scanner
        scan.close();
}}
