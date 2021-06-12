package Functions_and_array;
import java.util.Scanner;
public class spanarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(span(arr));
    }

    public static int span(int[] arr){
        int max = 0, min = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return (max-min);

    }
}
