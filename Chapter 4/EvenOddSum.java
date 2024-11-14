package evenoddsum;
//class name EvenOddSum
public class EvenOddSum {
    public static void main(String[] args) {
        
        //declare and intialize variables
        int evensum=0, oddsum=0,oddnum=1,evennum=1;
        
        //Even Numbers
        System.out.println("Even Numbers:");
        //loop condition until 10
        while(evennum<=10){
        //formula for finding even numbers
        if(evennum%2==0){
            //List out even numbers
            System.out.println(evennum);
            //Add all even numbers
            evensum+=evennum;
        }evennum++;//increament
        }
        
        //Odd Numbers
        System.out.println("Odd Numbers:");
        //loop condition until 10
        while(oddnum<=10){
        //formula for finding odd numbers
        if(oddnum%2!=0){
            //List out odd numbers
            System.out.println(oddnum);
            //add up the odd numbers
            oddsum+=oddnum;
        }oddnum++;
        }
        
        //print out the sum of even and odd numbers
        System.out.println("The sum of even numbers= "+evensum);
        System.out.println("The sum of odd numbers= "+oddsum);
    
    }}
        
