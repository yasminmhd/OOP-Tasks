package helloname;
//import library Scanner
import java.util.Scanner;
//class name NewClass
public class HelloName {
    public static void main (String[] args){
        
        //declare variable name and data type
        String fname, lname;
        //object name scan
        Scanner scan=new Scanner(System.in);
        
        //ask user to input first name
        System.out.println("Input your first name: ");
        fname=scan.nextLine();
        
        //ask user to input last name
        System.out.println("Input your last name: ");
        lname=scan.nextLine();
        
        scan.close();
        
        //display user input
        System.out.println("\nHello");
        System.out.println(fname+ " "+lname);
}
}


