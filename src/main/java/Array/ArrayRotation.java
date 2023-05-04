package Array;

public class ArrayRotation {
    static void Rotate(int arr[], int d, int n)
    {
        int k = n-d;
        int temp[] = new int[n];
        for (int i = 0 ; i <d; i++)
        {
            temp[i] = arr[i];

        }
        for (int j = 0 ; j <n ; j++){
            if(d+j == n) {
                break;
            }
            else{
                arr[j] = arr[d + j];
            }
        }
        for (int x=0;x<d;x++){
            arr[k+x]= temp[x];
        }

    }

    static void PrintTheArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        int d = 2;
        Rotate(arr, d, N);
        PrintTheArray(arr, N);
    }
}
