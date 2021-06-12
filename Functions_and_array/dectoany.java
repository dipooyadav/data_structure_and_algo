package Functions_and_array;
import java.util.Scanner;
public class dectoany {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), b = scn.nextInt();
        System.out.println(getnewbase(n, b));
    }

    public static int getnewbase(int n, int b){
        int rem, new_value = 0;
        for(int i=1;n>0;i*=10){
            rem = n%b;
            n = n/b;
            new_value = new_value + rem*i;
        }
        return new_value;
    }
}
