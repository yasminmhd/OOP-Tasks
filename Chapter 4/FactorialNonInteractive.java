package factorialnoninteractive;
//import Scanner library
import java.util.Scanner;
//class name FactorialNonInteractive
public class FactorialNonInteractive {
    public static void main(String[] args) {
        
        //object name scan
        Scanner scan=new Scanner(System.in);
        //set the factorial number in advance
        int num=5, factorial=1;
                
        //loop until the factorial is done
        for(int i=1;i<=num;i++){
            //calculate the factorial
            factorial*=i;
        }
        
        //display the result
        System.out.println(num+"!= "+factorial); 
}}

