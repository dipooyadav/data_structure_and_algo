package Functions_and_array;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int j =size-1;
        for(int i=0; i<j;i++){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            j--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
