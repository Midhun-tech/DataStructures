package Array.sorting;

import Array.Recurssion.arrays;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr  = {5,4,3,1,2,6};
        System.out.println(Arrays.toString(selectionsort(arr)));
    }

    private static int[] selectionsort(int[] arr) {

        for (int i = 0; i <arr.length-1; i++) {
                int min = i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[min] >arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min] = temp;
        }

        return arr;
    }

}
