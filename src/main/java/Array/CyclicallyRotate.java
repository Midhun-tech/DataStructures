package Array;

import java.util.Arrays;

public class CyclicallyRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n = arr.length;
        int temp = 0 ;

        for (int i = 0 ; i < 3 ; i ++){
            temp = arr[i];
            arr[i] =arr[n-i-1];
            arr[n-i-1]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
