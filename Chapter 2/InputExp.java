package inputexp;

import java.util.Scanner;
        
public class InputExp{
    public static void main(String[] args){
        
        String name,stdid;
        int age;
        Scanner scan=new Scanner(System.in);
        
        //Reads a single line from the console
        //and stores into name variable
        System.out.println("Please insert your name: ");
        name=scan.nextLine();
        
        
        //Reads a integer from the console
        //and stores into age variable
        System.out.println("Please insert your age: ");
        age=scan.nextInt();
        
        scan.nextLine();
        System.out.println("Please insert your student ID: ");
        stdid=scan.nextLine();

        scan.close();
        
        //Prints name and age to the console
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Student ID: "+stdid);
    }}