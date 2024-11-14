package option2;
//import library Scanner
import java.util.Scanner;
//classs name Option2
public class Option2 {
    public static void main(String[] args) { 
        //object name scan
        Scanner scan=new Scanner(System.in);
        //declare variable and data type
        char grade;
        float marks;
        //intitialize the loop to yes
        String exit="yes";

        while(!exit.equalsIgnoreCase("no")){
            //reset variable each loop
            marks=0;       
        
            //ask for users mark
            System.out.print("Please insert your test mark: ");
            marks=scan.nextFloat();
        
            //if marks is between 90 and 100, grade is A
            if(marks >= 90 && marks <= 100)
                grade='A';
            //if marks is between 85 and 90, grade is B
            else if(marks>=85 && marks <= 90)
                grade='B';
            //if marks is between 75 and 85, grade is C
            else if(marks>=75 && marks <= 85)
                grade='C';
            //if marks is between 65 and 75, grade is D
            else if(marks>=65 && marks <= 75)
                grade='D';
            //if marks is between 0 and 50, grade is F
            else if(marks>=0 && marks <= 50)
                grade='F';
            //if marks is no between 0 and 100, print invalid mark
            else {
                System.out.println("Invalid mark");
                return; 
            }
            //print out the grade
            System.out.println("Your grade is: "+grade);
            scan.nextLine(); 
            //ask the user if they want to continue or exit
            System.out.println("\nDo you want to continue? (yes/no)");
            exit=scan.nextLine();
            System.out.println();
        }
        //close the scanner
        scan.close();
}}
   
