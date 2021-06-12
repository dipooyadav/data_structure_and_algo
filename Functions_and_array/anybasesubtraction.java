package Functions_and_array;
import java.util.Scanner;
public class anybasesubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt(), n1 = scn.nextInt(), n2 = scn.nextInt();
        System.out.println(decitoany((anytodeci(n2, b)-anytodeci(n1, b)), b));
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
