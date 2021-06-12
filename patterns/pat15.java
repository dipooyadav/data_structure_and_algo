package patterns;
import java.util.Scanner;
public class pat15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), ns = n/2, np = 1, oval = 1;
        for(int i =1; i<=n;i++){
            for(int j=1;j<=ns;j++){
                System.out.print("\t");
            }
            int val = oval;
            for(int j=1;j<=np;j++){
                System.out.print(val+"\t");
                if(j<=np/2){
                    val++;
                }
                else{
                    val--;
                }
            }
            if(i<=n/2){
                ns--; np+=2; oval++;
            }
            else{
                ns++; np-=2; oval--;
            }
            System.out.println();
        }
    }
}
