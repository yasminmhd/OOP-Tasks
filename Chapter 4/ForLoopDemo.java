/*package forloopdemo;
public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println("Printing Numbers from 10 to 1");
        //initialization;loop condition;increament/decreament
        for(int count =10;count>=1;count--){
            System.out.println(count);}
    }}*/

/*For in a while structure
package forloopdemo;
public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println("Printing Numbers from 1 to 10");
        int count =1;
        while(count<=10){
            System.out.println(count);
            count++;}
    }}*/

/*package forloopdemo;
public class ForLoopDemo {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
}
}*/

public class ForLoopDemo {
    public static void main(String[] args) {
        for(int i =1;i<=15;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=15;k>=1+1+i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
}
}
