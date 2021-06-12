package Functions_and_array;
import java.util.Scanner;
public class findnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int d = scn.nextInt();
        System.out.println(findnum(arr, d));
    }
    public static int findnum(int [] arr, int d) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                return i;
            }
            else{
                count++;
            }
        }
        if(count==arr.length){
            return -1;
        }

        return 0;
        
    }
}
