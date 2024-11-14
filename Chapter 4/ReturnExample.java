package returnexample;
public class ReturnExample {
    public static void main(String[] args) {
        int result;
        for (int i=1;i<=10;i++){
            //method square (i)
            result = square(i);
            System.out.println("The square of "+i+" is = "+result+"\n");
        }}
    //int y parameter, method - square(int y)
        public static int square(int y){
            return y*y;//return square of y
        }}
