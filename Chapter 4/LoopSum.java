package loopsum;
public class LoopSum {
    public static void main(String[] args) {
        
        //declare and iniliatize sums
        int forsum=0, whilesum=0, dowhilesum=0;

        //For Loop
        System.out.println("For Loop: ");
        //initialization count=1, coundition count<=10,increment
        for(int count=1;count<=10;count++){
            forsum+=count;//add count to sum
        }
        //Display sum
        System.out.println("The sum of 1 to 10 is: "+forsum);
        
        //While Loop
        System.out.println("\nWhile Loop: ");
        //initialize whilecount
        int whilecount=1;
        //condition whilecount<=10
        while (whilecount<=10){
            whilesum+=whilecount;
            //increment
            whilecount++;}
        //Display sum
        System.out.println("The sum of 1 to 10 is: "+whilesum);
        
        //Do While Loop
        System.out.println("\nDo While Loop: ");
        //initialize dowhilecount
        int dowcount=1;
        do{
            dowhilesum+=dowcount;
            //increment
            dowcount++;}
        //condition dowcount<=10
        while (dowcount<=10);
        //Display sum
        System.out.println("The sum of 1 to 10 is: "+dowhilesum);
       
    }  
}
