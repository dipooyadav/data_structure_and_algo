package patterns;
import java.util.Scanner;
public class pat13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0 ;i<n; i++){
            int val =1;
            for(int j = 0;j<=i;j++){
                System.out.print(val + "\t");
                val = val*(i-j)/(1+j);
            }
            System.out.println();
        }
    }
}
