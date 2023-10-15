package Recursion.SampleProblems;

public class Binarysearch {


    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8};
        int target =8;
        System.out.println(binarysearch(arr,0, arr.length-1,target));
     }

    static int binarysearch(int arr[] , int start , int end, int target){
        //base condition
        if(start > end){
            return -1;
        }

        int middle = start+ (end - start)/2;

        if(arr[middle] == target)
        {
            return middle;
        }
        if(target < arr[middle])
        {
            return binarysearch(arr,start,middle-1,target);
        }
        return binarysearch(arr,middle+1,end,target);
    }
}
