package option1;
//import Scanner library
import java.util.Scanner;
//class name Option1
public class Option1 {
    public static void main(String[] args) {
        //object name scan
        Scanner scan=new Scanner(System.in);
        //set the initialize username ans password
        String xusername="admin", xpassword="pass123";
        //declare usermame and password variable
        String username,password;
        //inilialize attempt
        int attempt=0,maxattempt=3;
        //intitialize the loop to yes
        String exit="yes";

        while(!exit.equalsIgnoreCase("no")){
            //reset variable each loop
            attempt=0;
            //loop until the user reached maximum attempt
            while(attempt<=maxattempt){
                //ask user to insert username and password
                System.out.println("Insert Username: ");
                username=scan.nextLine();
                System.out.println("Insert Password: ");
                password=scan.nextLine();
                //check if the username is correct
                if(username.equals(xusername)){
                    //if it's correct the user successfully logged in
                    if(password.equals(xpassword)){
                        System.out.println("Successfully Logged In.");
                        break;
                    //if incorrect the user is given a chance again until maximum attempt reached
                    }else{
                        System.out.println("Incorrect Password. Please try again.\n");
                        attempt++;
                    }
                //if the username is incorrect the user can attempt again doesn't matter the password is correct
                }else{
                    System.out.println("Incorrect Username or Password. Please try again.\n");
                }
                //if maximum attempt reached, user is locked adn cannot log in anymore
                if (attempt==maxattempt) {
                System.out.println("Your account has been locked");
                return;
                }
            }
            //ask the user if they want to continue or exit
            System.out.println("\nDo you want to log out? (yes/no)");
            exit=scan.nextLine();
            System.out.println();
        }
        //close the scanner
        scan.close();
}}
