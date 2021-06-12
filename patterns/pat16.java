package patterns;
import java.util.Scanner;
public class pat16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), np=1, ns=2*n-3;
        for(int i=1;i<=n;i++){
            int val = 1;
            for(int j = 1;j<=np;j++){
                System.out.print(val + "\t");
                val++;
            }
            for(int j=1;j<=ns;j++){
                System.out.print("\t");
            }
            if(i==n){
                np--;
                val--;
            }
            for(int j=1;j<=np;j++){
                val--;
                System.out.print(val+"\t");
            }
            np++; ns-=2; System.out.println();
        }
    }
}
