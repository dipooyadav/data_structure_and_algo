package Functions_and_array;
import java.util.Scanner;
public class test{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        solution(x);
    }
    
    public static void solution(int x){
        while(x>0){
            int d = x%10;
            x = x/10;
            System.out.print(d);
        }        
    }
}