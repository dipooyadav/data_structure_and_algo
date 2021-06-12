package Functions_and_array;
import java.util.Scanner;
public class anybasemultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt(), n1 = scn.nextInt(), n2 = scn.nextInt();
        System.out.println(getproduct(b, n1, n2));
    }

    public static int getproduct(int b, int n1, int n2){
        int pro = 0;
        for(int i=1;n2>0;i*=10){
            int d2 = n2%10;
            n2 = n2/10;
            pro = anysum(b, pro, i*productwithdigit(b, n1, d2));
        }
        return pro;


    }

    public static int productwithdigit(int b, int n1, int d2){
        int mul=0, c = 0;
        for(int i = 1; n1>0 || c >0; i*=10){
            int d1 = n1%10;
            n1 = n1/10;
            int d = d1*d2 + c;
            c = d/b;
            d = d%b;
            mul+= d*i;
        }
        return mul;
    }

    public static int anysum(int b, int n1, int n2){
        int sum =0, c = 0;
        for(int i=1; n1>0 || n2>0 || c>0; i*=10){
            int d1 = n1%10, d2 = n2%10, d;
            n1 = n1/10; n2 = n2/10;
            d = d1 + d2 + c;
            c = d/b;
            d = d%b;
            sum = sum + d*i;
        }

        return sum;
    }
}
