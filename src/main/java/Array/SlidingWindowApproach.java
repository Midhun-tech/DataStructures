package Array;

public class SlidingWindowApproach {
    public static void main(String[] args) {
        int[] nums = {4,2,2,7,8,1,2,8,10};
         System.out.println(maximumsumofsubarray(nums,3));

        // System.out.println(minimumsubarray(nums,8));
    }
    // Constant window size function
    static int maximumsumofsubarray(int[] nums,int k){
        int maximumvalue =Integer.MIN_VALUE;
        int currentsum = 0;
        for (int i = 0; i < nums.length ; i++) {

            currentsum = currentsum+nums[i];
            if(i>=k-1){
                maximumvalue = Math.max(maximumvalue,currentsum);
                currentsum = currentsum-nums[i-(k-1)];
            }

        }
        return maximumvalue;

    }
    // Dynamic window size (To get the min window subarray to get a target ex 7)

    static int minimumsubarray(int[] nums,int target){
        int minwindowsize = Integer.MAX_VALUE;
        int currentsum = 0;
        int windowstart = 0;
        for (int windowend = 0; windowend < nums.length ; windowend++) {
            currentsum = currentsum + nums[windowend];
            while(currentsum>=target){
                minwindowsize = Math.min(minwindowsize,windowend-windowstart+1);
                currentsum = currentsum-nums[windowstart];
                windowstart++;
            }
        }
        return minwindowsize;
    }
}
