package Array;

import java.util.Arrays;

public class TwoPointerApproach {

    public static void main(String[] args) {
        int[] arr ={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twopointerapproach(arr,target)));
    }

    static int[] twopointerapproach(int[] arr , int target)
    {
        int left =0;
        int right = arr.length-1;
        while(left < right){

            int sum = arr[left] + arr [right];

            if(sum == target)
                return new int[] {left+1, right+1};
            else if(sum>target)
                right--;
            else
                left++;
        }
        return new int[]{-1,-1};
    }
}

