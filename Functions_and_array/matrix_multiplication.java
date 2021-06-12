package pepcoding;
import java.util.Scanner;
public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt(), c1 = scn.nextInt();
        int [][] arr1 = new int[r1][c1];
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr1[i].length;j++){
                arr1[i][j]=scn.nextInt();
            }
        }

        int r2 = scn.nextInt(), c2 = scn.nextInt();
        int[][] arr2 = new int[r2][c2];
        for(int i = 0;i<arr2.length;i++){
            for(int j= 0;j<arr2[i].length;j++){
                arr2[i][j]=scn.nextInt();
            }
        }

        if (c1 != r2){
            System.out.println("Invalid input");
            return;
        }

        int [][] prod = new int[r1][c2];
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c2;j++){
                int sum = 0;
                for(int k=0;k<c1;k++){
                    sum+=arr1[i][k]*arr2[k][j];
                }
                prod[i][j]=sum;
            }
        }

        for(int i=0;i<prod.length;i++){
            for(int j=0;j<prod[i].length;j++){
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }

    }
}
