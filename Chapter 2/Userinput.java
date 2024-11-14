package userinput;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        String name,hobby,favfood;
        int age;
        
        //ask for user input
        System.out.println("Please insert your name: ");
        name=scan.nextLine();
        
        System.out.println("Please insert your age: ");
        age=scan.nextInt();
        
        scan.nextLine();
        System.out.println("Please insert your hobby: ");
        hobby=scan.nextLine();
        
        System.out.println("Please insert your fav food: ");
        favfood=scan.nextLine();

        scan.close();
        
        //print user input
        System.out.println("\nName: "+name);
        System.out.println("Age: "+age);
        System.out.println("Hobby: "+hobby);
        System.out.println("Fav Food: "+favfood);

}}
