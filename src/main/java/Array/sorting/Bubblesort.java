package Array.sorting;

public class Bubblesort {

    public static void main(String[] args) {
        int arr[] ={3,4,2,1,5,8,10};
        bubblesort(arr);
    }

    static void bubblesort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}