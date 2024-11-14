package continuedemo;
public class ContinueDemo {
    public static void main(String[] args) {
        String searchMe = "she sells sea shells by the sea shore";
        int max = searchMe.length();
        int numSs = 0;
        int numEs = 0;
        for(int i=0;i<max;i++){//interested only in s's
            if(searchMe.charAt(i)!='s')
                continue;
            //process s's
            numSs++;}
        for(int i=0;i<max;i++){//interested only in e's
            if(searchMe.charAt(i)!='e')
                continue;
            //process e's
            numEs++;}
        System.out.println("Number of characters: "+max);
        System.out.println("Found "+numSs+" s's in the string.");
        System.out.println("Found "+numEs+" e's in the string.");
    }}
