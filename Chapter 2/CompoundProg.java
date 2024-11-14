package compoundprog;
import java.util.Scanner;
public class CompoundProg {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        int num,inc1,inc2,dec1,dec2;
        
        System.out.println("Enter number: ");
        num=scan.nextInt();
        
        scan.close();
        
        //prefix increment, output will be the original number +1
        inc1=num;
        inc1=++inc1;
        
        //postfix increment, output will be the original number
        inc2=num;
        inc2=inc2++;
        
        //prefix decrement, output will be the original number -1
        dec1=num;
        dec1=--dec1;
        
        //postfix decrement, output will be the original number
        dec2=num;
        dec2=dec2--;
        
        System.out.println("Prefix Increment: "+inc1);
        System.out.println("Postfix Increment: "+inc2);
        System.out.println("Prefix Decrement: "+dec1);
        System.out.println("Postfix Decrement: "+dec2);
    } }
