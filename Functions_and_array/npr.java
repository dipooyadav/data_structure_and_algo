package Functions_and_array;
import java.util.Scanner;
public class npr {
    public static int fact(int x){
        int rv =1;
        for(int i=1;i<=x;i++){
            rv *=i;
        }
        return rv;
    }
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n =scn.nextInt(), r = scn.nextInt(), npr = fact(n)/fact(n-r);
       System.out.println(n+"P"+r+" = "+npr);
    }
}
