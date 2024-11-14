/*package ifdemo;
import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        //declare & inilialize variable & data type
        int latenumber;
        double deductmarks=0.3;
        double totalKISmarks=0;
        double KISmarks=10;
        double balanceKIS;
        
        //ask user to input late number
        System.out.println("Please Insert Late Number: ");
        latenumber=scan.nextInt();
        scan.close();
        
        //execute if statement if late number is more than 3
        if(latenumber>3)
            //formula to calculate KIS marks and blance KIS
            totalKISmarks=latenumber*deductmarks;
            balanceKIS = KISmarks - totalKISmarks;
            
            //print out the KIS Mark
            System.out.println("Total KIS Mark:"+totalKISmarks);   
            System.out.println("Balance KIS Mark:"+balanceKIS);   
    }
    
}*/

package ifdemo;
import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        //declare variable grade & the data type
        int grade;
        
        //ask user to input marks
        System.out.println("Please enter marks: ");
        grade=scan.nextInt();
        scan.close();        
        
        //if marks is more or equal to 60 print "Passed" if not "Failed" comes out
        if(grade>=60)
            System.out.println("Passed");
        else
            System.out.println("Failed");

    }
}




