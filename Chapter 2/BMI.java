package bmi;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        float weight,height,BMI;
        
        //ask for user to input weight and height in kg and m respectively
        System.out.println("Enter weight(kg): ");
        weight=scan.nextFloat();
        
        System.out.println("Enter height(m): ");
        height=scan.nextFloat();
                   
        scan.close();
        
        //calculate the BMI
        BMI=weight/(height*height);
        
        //print BMI value in 2 decimal places
        System.out.println("BMI: "+String.format("%.2f",BMI));
}}
