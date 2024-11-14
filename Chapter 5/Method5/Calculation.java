package method5;
/**
 *
 * @author Yasmin
 */
public class Calculation {
    
    
    public static double average(double mark1,double mark2,double mark3){
        return (mark1+mark2+mark3)/3.0;
    }
    
    
    public static double maximumCalc(double avg1, double avg2, double avg3) {
        return Math.max(avg1, Math.max(avg2, avg3));
    }    
    

        
}
