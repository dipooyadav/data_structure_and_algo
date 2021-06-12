package pepcoding;
import java.util.Scanner;
public class firstIndex_lastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int [] arr = new int[size];
        for(int i = 0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int n = scn.nextInt();
        int low = 0;
        int high = arr.length-1;
        int fi = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(n<arr[mid]){
                high = mid-1;
            }
            else if(n>arr[mid]){
                low = mid+1;
            }
            else{
                fi = mid;
                high= mid-1;
            }
        }
        low =0;
        high = arr.length-1;
        int last= -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(n<arr[mid]){
                high = mid-1;
            }
            else if(n>arr[mid]){
                low = mid+1;
            }
            else{
                last=mid;
                low = mid+1;
            }
        }
        System.out.println(fi);
        System.out.println(last);
    }
}
