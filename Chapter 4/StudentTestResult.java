package studenttestresult;
//import library Scanner
import java.util.Scanner;
//class name StudentTestResult
public class StudentTestResult {
    public static void main(String[] args) {
        //object name scan
        Scanner scan=new Scanner(System.in);
        //initialize and declare variables
        int i=1;
        float stdnum, testresult, failed=0, passed=0;
        
        //ask user to input student number
        System.out.println("Please insert the number of students: ");
        stdnum=scan.nextInt();
        
        //loop until all student's mark is entered
        while (i<=stdnum){
            //ask user to input the result
            System.out.print("Insert student "+i+" test result: ");
            testresult=scan.nextFloat();
            //failed if under 60
            if(testresult<=60){
                failed++;
            //pass if over 60
            }else{
                passed++;
            }
            //increment
            i++;
        }
        System.out.println("\nPassing grade 60%");
        //print out the number of passed and failed student
        System.out.println("Number of student passed: "+String.format("%.0f",passed));
        System.out.println("Number of student failed: "+String.format("%.0f",failed));
        
        //display the bonus if more than half student passed
        if(passed>=stdnum/2){
            System.out.println("Bonus to instructor");
        }   
}}
