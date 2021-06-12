package pepcoding;
import java.util.Scanner;
public class broken_economy{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int n = scn.nextInt();
        int h= arr.length-1;
        int low= 0;
        int ceil = 0;
        int floor=0;
        int mid = (low+h)/2;
        while(low<=h){
            mid = (low+h)/2;
            if(n<arr[mid]){
                h = mid-1;
                ceil = mid;
            }
            else if(n>arr[mid]){
                low = mid+1;
                floor = mid;
            }
            else{
                ceil = mid;
                floor = mid;
            }
        }
        System.out.println(arr[ceil]);
        System.out.println(arr[floor]);
    }
}
