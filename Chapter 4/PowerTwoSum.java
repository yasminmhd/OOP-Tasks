package powertwosum;
//class name PowerTwoSum
public class PowerTwoSum {
    public static void main(String[] args) {
        
        //declare and initialize variables
        int power, sum=0;
        //loop iniliatize, condition, increament
        for(int count=1;count<=10;count++){
            //formula for power
            power=count*count;
            //print out the power
            System.out.println(count+"^2= "+power);
            //add the power to the sum
            sum+=power;
        }
        //display the sum
        System.out.println("Sum of power of twos= "+sum);
        
    }}
