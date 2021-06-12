package patterns;
import java.util.Scanner;
public class pat17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt(), ns=n/2, np=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=ns;j++){
                if(i!=n/2+1){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            for(int j=1;j<=np;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                np++;
            }
            else{
                np--;
            }
            System.out.println();
            System.out.println();
        }
    }
}
