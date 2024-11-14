package methodaverage;
import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Display {
    
    double mark1,mark2,mark3;
    Scanner scan=new Scanner(System.in);
    
    public void highestAverage() {

        System.out.println("Enter marks for Student 1");
        double avg1 = inputMark();
        System.out.println("\nEnter marks for Student 2:");
        double avg2 = inputMark();
        System.out.println("\nEnter marks for Student 3:");
        double avg3 = inputMark();
        System.out.println("\nAverage for each student:");
        System.out.println("Student 1:"+String.format("%.2f",avg1));
        System.out.println("Student 2:"+String.format("%.2f",avg2));
        System.out.println("Student 3:"+String.format("%.2f",avg3));
        double highestAvg = Calculation.maximumCalc(avg1, avg2, avg3);
        System.out.println("\nHighest average: " + String.format("%.2f", highestAvg));
    }
    
    public double inputMark() {
        System.out.println("Enter mark 1:");
        mark1 = scan.nextDouble();
        System.out.println("Enter mark 2:");
        mark2 = scan.nextDouble();
        System.out.println("Enter mark 3:");
        mark3 = scan.nextDouble();
        return Calculation.average(mark1, mark2, mark3);
    }  
}
