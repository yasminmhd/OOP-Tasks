package thestall;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TheStall{
        public static void main(String[] args){
            
            Scanner scanner = new Scanner(System.in);
            float total=0;
            
            try{
            System.out.println("--------------------------------------");
            System.out.println("|         Welcome to The Cake        |");
            System.out.println("--------------------------------------");
            System.out.println("|            List of cakes           |");
            System.out.println("|     1. Carrot Cake     : RM 5.00   |");
            System.out.println("|     2. Red Velvet Cake : RM 6.50   |");
            System.out.println("|     3. Cheese Cake     : RM 3.00   |");
            System.out.println("______________________________________");
            
            System.out.println("\nInsert code of your desired cake :");
            int cakecode = scanner.nextInt();
            
            System.out.println("\nInsert quantity :");
            int quantity = scanner.nextInt();
            
            switch (cakecode){
                case 1:
                    System.out.println("\nCarrot Cake : RM 5");
                    total=quantity*5;
                    break;
                case 2:
                    System.out.println("\nRed Velvet Cake : RM 6.50");
                    total=(int) (quantity*6.5);
                    break;
                case 3:
                    System.out.println("\nCheese Cake : RM 3");
                    total=quantity*3;
                    break;
                default:
                    System.out.println("\nInvalid code");
                    break;
                }
            
            System.out.println("\nTotal Price : RM "+ total);
            
            scanner.close();
            }
            
        catch (InputMismatchException ime){
            System.out.println("Input is not an integer.");}
        System.out.println("After catch");
        }
}

