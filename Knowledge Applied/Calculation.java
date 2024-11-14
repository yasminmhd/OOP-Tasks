package calculation;
//class name NewClass1
public class Calculation {
    public static void main (String[]args){
        
        //declare variable name and data type
        int cal1, cal2, cal3, cal4;
        
        //formula to calculate the result
        cal1=-5+8*6;
        cal2=(55 + 9) % 9;
        cal3=20 + -3 * 5 / 8;
        cal4=5 + 15 / 3 * 2 - 8 % 3;
        
        //display the result
        System.out.println("Here are some Calculations");
        System.out.println("\n-5 + 8 * 6             : "+cal1);
        System.out.println("(55 + 9) % 9           : "+cal2);
        System.out.println("20 + -3 * 5 / 8        : "+cal3);
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 : "+cal4);
}
}


