package dowhileloopdemo;
public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int count =5;
        System.out.println("Printing Numbers from 5 to 100");
        do{
            System.out.println(count++);}
        while (count<=100);
    }}