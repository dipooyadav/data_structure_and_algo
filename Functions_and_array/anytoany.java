package Functions_and_array;
import java.util.Scanner;
public class anytoany {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), b1 = scn.nextInt(), b2 = scn.nextInt();
        System.out.println(decitoany(anytodeci(n, b1), b2));
    }

    public static int anytodeci(int n, int b){
        int rem, new_value = 0;
        for(int i =1;n>0;i*=b){
            rem = n%10;
            n = n/10;
            new_value = new_value + rem*i;
        }
        
        return new_value;
    }

    public static int decitoany(int n, int b){
        int rem, new_value = 0;
        for(int i=1;n>0;i*=10){
            rem = n%b;
            n = n/b;
            new_value = new_value + rem*i;
        }
        return new_value;
    }
}
