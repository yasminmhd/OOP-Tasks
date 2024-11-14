package method1;
import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Input {
    public static void inputInteger() {
        
        //object scanner
        Scanner scan=new Scanner(System.in);
        int num1,num2,num3;
        String exit="yes";
        
        //loop until user says no
        while(!exit.equalsIgnoreCase("no")){
        
        System.out.print("Insert 1st integer: ");
        num1=scan.nextInt();
        System.out.print("Insert 2nd integer: ");
        num2=scan.nextInt();
        System.out.print("Insert 3rd integer: ");
        num3=scan.nextInt();
        
        int max = Maximum.maximumCount(num1, num2, num3);
        System.out.println("The maximum number is = "+max);
        
        int min = Minimum.minimumCount(num1, num2, num3);
        System.out.println("The minimum number is = "+min);
        
        scan.nextLine();
        System.out.println("\nDo you want to continue? (yes/no)");
        exit=scan.nextLine();
        }
        scan.close();
    }
}
