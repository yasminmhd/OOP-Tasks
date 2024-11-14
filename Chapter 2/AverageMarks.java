package averagemarks;
import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String name,studentid,subject;
        float test1,test2,avrgmark;
        
        //ask for users information
        System.out.println("Please insert your name: ");
        name=scan.nextLine();
        
        System.out.println("Please insert your Student ID: ");
        studentid=scan.nextLine();
        
        System.out.println("Please insert subject: ");
        subject=scan.nextLine();
        
        System.out.println("Please insert Test 1 score(/100): ");
        test1=scan.nextFloat();
        
        System.out.println("Please insert Test 2 score(/100): ");
        test2=scan.nextFloat();
        scan.close();
        
        //calculate the average score
        avrgmark=(test1+test2)/2;
        
        //print all user input and calculated marks
        
        System.out.println("\nName: "+name);
        System.out.println("ID: "+studentid);
        System.out.println("Subject: "+subject);
        System.out.println("Average mark: "+String.format("%.2f",avrgmark));
}}