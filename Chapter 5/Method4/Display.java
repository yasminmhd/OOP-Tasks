package method4;
import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Display {
    int conv;
    double result, quantity;
    Scanner scan=new Scanner(System.in);
    
    
    public void displayMenu(){
        // Display the choices
        System.out.println("Converter available:");
        System.out.println("1. Temperature (C - F)");
        System.out.println("2. Mass (kg - pound)");
        System.out.println("3. Distance (km - miles)");
        System.out.print("Choose your converter: ");
        conv=scan.nextInt();
    }
    
    public void userInput(){
        switch(conv){
            case 1:
                System.out.print("Insert quantity: ");
                quantity=scan.nextDouble();
                result = Formula.temperatureFormula(quantity);
                System.out.println("\n" + quantity + " C = " + String.format("%.2f", result) + " F");
                break;
            
            case 2:
                System.out.print("Insert quantity: ");
                quantity=scan.nextDouble();
                result = Formula.massFormula(quantity);
                System.out.println("\n" + quantity + " kg = " + String.format("%.2f", result) + " pounds");
                break;
            
            case 3:
                System.out.print("Insert quantity: ");
                quantity=scan.nextDouble();
                result = Formula.distanceFormula(quantity);
                System.out.println("\n" + quantity + " km = " + String.format("%.2f", result) + " miles");
                break;
            
            // Codes if the user chooses other than stated
            default:
                System.out.println("No such converter exists");
                break;
                
        }
    }
}
