package sequenceinput;
//import Scanner library
import java.util.Scanner;
//class name SequenceInput
public class SequenceInput {
    public static void main(String[] args) {
        //object name scan
        Scanner scan=new Scanner(System.in);
        //declare and intialize variables
        int sequence, integer, oddnum=0,evennum=0;
        String exit="yes";
        
        //loop until the user input no
        while(!exit.equalsIgnoreCase("no")){
            //reset variable each time
            oddnum=0;
            evennum=0;
            
            //ask user to input number of integers
            System.out.print("Insert total number of integers in the sequence: ");
            sequence=scan.nextInt();

            for(int i=1;i<=sequence;i++){
                //ask the user for the integer
                System.out.print("Insert number "+i+" : ");
                integer=scan.nextInt();
                
                //the condition if the integer is an odd number
                if(integer%2!=0){
                //add to the number of odd numbers
                oddnum++;
                //the condition if the integer is an even number
                } else {
                //add to the number of even numbers
                evennum++;
                }
            }
            //display the number of odd and even numbers
            System.out.println("\nThe number of Odd Integers: "+oddnum);
            System.out.println("The number of Even Integers: "+evennum);
        
            //ask the user if they want to continue or exit
            System.out.println("\nDo you want to continue? (yes/no)");
            scan.nextLine();
            exit=scan.nextLine();
        }
        scan.close();
}}
