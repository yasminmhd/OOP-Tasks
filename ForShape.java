package forshape;
public class ForShape {
public static void main(String[] args) {
    //flag
    for(int i=1; i<=6; i++){
        for(int l=1; l<=13; l++){
            System.out.print(" ");  
        }
        for(int j=1; j<=i; j++){  
            System.out.print("* ");  
        }
        System.out.println();  
    }
    //flag holder
    for(int k=1; k<=4; k++){
        for(int l=1; l<=13; l++){
            System.out.print(" ");  
        }
        for(int m=1; m<=2; m++){
            System.out.print("* ");  
        }
        System.out.println();  
    }  
    //boat lower part
    for (int v= 1; v<=4; v++){  
        for (int w=0; w<=v; w++){  
            System.out.print(" ");  
        }  
        for (int x=1; x<=20; x++){ 
            x=20-1-v;
            System.out.print("* ");  
        }  
        System.out.println();  
        }
    }}
