package calculateage;

import java.util.Scanner;

public class CalculateAge {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        int currentyear,birthyear,age;
        
        //set value of current year
        currentyear=2024;
        
        //ask for users birth year
        System.out.println("Enter your birth year: ");
        birthyear=scan.nextInt();
        
        scan.close();
        
        //calculate the age by subtrating current year with birth year
        age=currentyear-birthyear;
        
        //print user's age
        System.out.println("Current Year: 2024");
        System.out.println("Your age: "+age);

    }
}
