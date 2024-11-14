package loopingprogram;
public class LoopingProgram {
    public static void main(String[] args) {
        

        //For Loop
        System.out.println("For Loop: ");
        for(int count=1;count<=10;count++){
            System.out.println(count);}
        
        //While Loop
        System.out.println("\nWhile Loop: ");
        int wcount=1;
        while (wcount<=10){
            System.out.println(wcount++);
        }
        
        //Do While Loop
        System.out.println("\nDo While Loop: ");
        int dwcount=1;
        do{
            System.out.println(dwcount++);}
        while (dwcount<=10);
    }  
}
