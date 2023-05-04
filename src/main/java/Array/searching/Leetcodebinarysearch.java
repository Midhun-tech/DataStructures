package Array.searching;


// return the starting and ending indexes of the same elements in the array

import java.util.Arrays;

// Ex : arr [] =  { 1,2,2,2,2,2,3,4,6};  o/p =  [ 1,5 ]
public class Leetcodebinarysearch {

    public static void main(String[] args) {

        int arr[] =  {1,2,2,2,2,2,4,6,7};
        int target = 2 ;
        System.out.println(Arrays.toString(binarysearch(arr,target)));
    }

    static int[] binarysearch(int[] arr , int target){

        int[] nums =  {-1,-1};

        int start = helperfunction(arr, target, true);
        int end =  helperfunction(arr, target, false);
        nums[0] = start;
        nums[1] = end;
        return nums;

    }

    static int helperfunction(int[] arr , int target, boolean firstindex){

        int arrr = -1;

        int start = 0;
        int end = arr.length-1;

        while(start<= end){

            int mid = start + (end - start)/2 ;

            if (target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                arrr = mid;
                if(firstindex){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }

        }
        return arrr;
    }
}
