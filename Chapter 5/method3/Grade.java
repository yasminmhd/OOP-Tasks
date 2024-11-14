package method3;
import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Grade {
    public static void identifyGrade() {
        
        
        //object name scan
        Scanner scan=new Scanner(System.in);
        //declare variable and data type
        char grade;
        int markscount=1;
        int g1=0,g2=0,g3=0,g4=0,g5=0;
        float marks;
        
        System.out.println("Please insert your marks: ");
        
        while(markscount<=10){
            
        System.out.print("Marks number "+markscount+" : ");
        //ask for users mark
        marks=scan.nextFloat();
        
        //if marks is between 90 and 100, grade is A
        if(marks >= 90 && marks <= 100){
            grade='A';
            g1++;
            markscount++;
        //if marks is between 75 and 89, grade is B
        }else if(marks>=75 && marks <= 89){
            grade='B';
            g2++;
            markscount++;
        //if marks is between 60 and 74, grade is C
        }else if(marks>=60 && marks <= 74){
            grade='C';
            g3++;
            markscount++;
        //if marks is between 40 and 59, grade is D
        }else if(marks>=40 && marks <= 59){
            grade='D';
            g4++;
            markscount++;
        //if marks is between 0 and 39, grade is F
        }else if(marks>=0 && marks <= 39){
            grade='F';
            g5++;
            markscount++;
        //if marks is no between 0 and 100, print invalid mark
        }else{
            System.out.println("Invalid mark. Please insert again between 0-100.");
            continue; 
        }}
        
        scan.close();
        
        //call the display class
        Display.displayGrade(g1, g2, g3, g4, g5);   
}}
   
