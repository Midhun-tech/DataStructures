import java.util.*;

public class test {
    public static void main(String args[]) {
        /*String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // System.out.println(groupAnagrams(s));.
        String[] s1 = new String[]{"", ""};
        int[] nums = {0,3,7,2,5,8,4,6,0,1};*/
        // String s = "abca";
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(containsDuplicate(nums,6)));
     //   System.out.println(isPalindrome(s));
    }


    public static int[] containsDuplicate(int[] nums, int target){
        int left =0;
        int right = nums.length-1;
        while(left < right){
 int a;
            int sum = nums[left] + nums [right];

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