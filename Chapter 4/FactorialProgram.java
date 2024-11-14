package factorialprogram;
//import Scanner library
import java.util.Scanner;
//class name FactorialProgram
public class FactorialProgram {
    public static void main(String[] args) {
        
        //object name scan
        Scanner scan=new Scanner(System.in);
        //declare and intialize variables
        int num, factorial=1;
        
        //ask user to input number of integers
        System.out.print("Insert an integer for factorial: ");
        num=scan.nextInt();
        
        //loop until the factorial is done
        for(int i=1;i<=num;i++){
            //calculate the factorial
            factorial*=i;
        }
        
        //display the result
        System.out.println(num+"!= "+factorial);
        
        scan.close();
}}

