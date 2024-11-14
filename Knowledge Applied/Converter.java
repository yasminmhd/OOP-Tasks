package converter;
//import library Scanner
import java.util.Scanner;
//class name NewClass
public class Converter {
    public static void main (String[] args){
        //declare variable name and data type
        int conv;
        double quantity,result;
        //object name scan
        Scanner scan=new Scanner(System.in);
        //display the choices
        System.out.println("Converter available :");
        System.out.println("1. Temperature (C - F)");
        System.out.println("2. Mass (kg - pound)");
        System.out.println("3. Distance (km - miles)");
        //ask user to input choice
        System.out.println("Choose your converter : ");
        conv=scan.nextInt();
        //ask user to input amount
        System.out.println("Insert Amount/Quantity : ");
        quantity=scan.nextInt();
        scan.close();
        //switch for chosen converter
        switch(conv){
            //calculate and display the result for temperature converter
            case 1:
                result=(quantity*9/5)+32;
                System.out.println("\n"+quantity+" C = "+String.format("%.2f", result)+" F");
                break;
            //calculate and display the result for mass converter
            case 2:
                result=quantity*2.2046;
                System.out.println("\n"+quantity+" kg = "+String.format("%.2f", result)+" pound");
                break;
            //calculate and display the result for distance converter
            case 3:
                result=quantity*0.621371;
                System.out.println("\n"+quantity+" km = "+String.format("%.2f", result)+" miles");
                break;
            //codes if user choose other than stated case
            default:
                System.out.println("No such converter exist");
                break;
    } }}
