package fibonacciseries;
//import Scanner library
import java.util.Scanner;
//class name FibonacciSeries
public class FibonacciSeries {
    public static void main(String[] args) {
        
        //object name scan
        Scanner scan=new Scanner(System.in);
        //declare and intialize variables
        int series, fibonacci1=0, fibonacci2=1,fibonacci3 = 0;
        
        //ask user to input number of integers to display the fibonacci series to
        System.out.print("Insert an integer: ");
        series=scan.nextInt();
        
        System.out.println("Fibonacci Series: ");
        
        //print the fibonacci series up to the entered integer
        for(int i=1;fibonacci3<=series;i++){
            System.out.print(fibonacci1+" ");
            //calculate the next integer
            fibonacci3=fibonacci1+fibonacci2;
            fibonacci1=fibonacci2;
            fibonacci2=fibonacci3;
        }
        System.out.println();
        scan.close();
}}
