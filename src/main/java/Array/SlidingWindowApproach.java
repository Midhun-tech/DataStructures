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


    //https://www.youtube.com/watch?v=nCcSwjFmfMM

    // O(n^2)

    static int minimumsubarrayBruteforce(int[] nums,int intvalue){

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length ; i++) {
            int sum =0;
            for (int j = i; j < nums.length ; j++) {
                sum = sum +nums[j];
                if(sum >= intvalue){
                    ans = Math.min(ans,j-i+1);
                    break;
                }
            }
        }
        return ans;
    }


    static int minimumsubarray(int[] nums,int intvalue){
        int ans = Integer.MAX_VALUE;
        int currentsum = 0;
        int left = 0;
        for (int right = 0; right < nums.length ; right++) {
            currentsum = currentsum + nums[right];
            while(currentsum>= intvalue){
                ans = Math.min(ans,right-left+1);
                currentsum = currentsum-nums[left];
                left++;
            }
        }
        return ans;
    }
}

/*Problems :

static int lengthOfLongestSubstring(String s){

        int ans=0;

        HashSet<Character> hash_set=new HashSet<>();

        int left=0,i=0;

        while(i<s.length()){

            if(!hash_set.contains(s.charAt(i))){

                hash_set.add(s.charAt(i));
                ans=Math.max(hash_set.size(),ans);
                i++;

            }
            else{
                hash_set.remove(s.charAt(left));
                left++;
                }
        }
        return ans;
2. Longest Repeating Character Replacement
Input: s = "AABABBA", k = 1
Output: 4


static int characterReplacement(String s, int k) {

        int[] char_count = new int[26];

        int window_start = 0 , max_length =0 , max_count = 0;

        for (int window_end = 0; window_end <s.length() ; window_end++){

            char_count[s.charAt(window_end) - 'A']++;
            int current_char_count = char_count[s.charAt(window_end) - 'A'];
            max_count = Math.max(max_count,current_char_count);

            while((window_end-window_start)-max_count +1 >k){
                char_count[s.charAt(window_start) - 'A']--;
                window_start++;
            }
            max_length = Math.max(max_length, window_end-window_start +1);
        }
        return max_length;
    }

 */
