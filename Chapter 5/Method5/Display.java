package method5;
import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Display {
    public static void inputMarks(){
    
        double avg1,avg2,avg3,mark1Std1, mark2Std1,mark3Std1,mark1Std2, mark2Std2,mark3Std2,mark1Std3, mark2Std3,mark3Std3;
        Scanner scan = new Scanner(System.in);
    
        System.out.println("\nEnter marks for Student 1:");
        System.out.println("Enter mark 1:");
        mark1Std1 = scan.nextDouble();
        System.out.println("Enter mark 2:");
        mark2Std1 = scan.nextDouble();
        System.out.println("Enter mark 3:");
        mark3Std1 = scan.nextDouble();
        avg1 = Calculation.average(mark1Std1, mark2Std1, mark3Std1);

        System.out.println("\nEnter marks for Student 2:");
        System.out.println("Enter mark 1:");
        mark1Std2 = scan.nextDouble();
        System.out.println("Enter mark 2:");
        mark2Std2 = scan.nextDouble();
        System.out.println("Enter mark 3:");
        mark3Std2 = scan.nextDouble();
        avg2 = Calculation.average(mark1Std2, mark2Std2, mark3Std2);

        System.out.println("\nEnter marks for Student 3:");
        System.out.println("Enter mark 1:");
        mark1Std3 = scan.nextDouble();
        System.out.println("Enter mark 2:");
        mark2Std3 = scan.nextDouble();
        System.out.println("Enter mark 3:");
        mark3Std3 = scan.nextDouble();
        avg3 = Calculation.average(mark1Std3, mark2Std3, mark3Std3);
        
        double highestAvg = Calculation.maximumCalc(avg1, avg2, avg3);

        System.out.println("Highest average: "+highestAvg);
        
    }        
}