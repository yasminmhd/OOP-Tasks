package method;
public class Method {
    public static void main(String[] args){
        init();
    }
    
    public static void init() {
        double number1=7, number2=5, number3=3;
        double max = maximum(number1, number2, number3);
        System.out.println("THE MAXIMUM NUMBER IS = "+max);
    }
    
    public static double maximum(double x, double y, double z){
        return Math.max(x, Math.max(y,z));
    }
}
