package patterns;
import java.util.Scanner;
public class pat18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt(), ns = 0,np=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=ns;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=np;j++){
                if(i!=1 && i<=n/2 && j!=1 && j!=np){
                    System.out.print("\t");
                }
                else{
                System.out.print("*\t");
                }
            }
            if(i<=n/2){
                ns++; np-=2;
            }
            else{
                ns--; np+=2;
            }
            System.out.println();
            System.out.println();
        }
    }
}
