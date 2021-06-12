package patterns;
import java.util.Scanner;
public class pat12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt(), cnt1=0,cnt2=1;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i-j>=0){
                    System.out.print(cnt1+ "\t");
                    int cnt3 = cnt2 + cnt1;
                    cnt1 = cnt2; cnt2 = cnt3;
                }
            }
            System.out.println();
        }
    }
}
