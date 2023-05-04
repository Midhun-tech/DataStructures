package Array.sorting;

public class InsertionSorting {

    public static void main(String args[])
    {
        int arr[] = { 5,3,4,1,2 };

        InsertionSorting ob = new InsertionSorting();
        ob.sort(arr);

        printArray(arr);
    }

    void sort(int arr[])
    {
        int temp =0;
        for (int i=0 ;i<arr.length-1;i++){
            for (int j= i+1 ;j>0; j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]= temp;
                }
                else{break;}
            }
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
