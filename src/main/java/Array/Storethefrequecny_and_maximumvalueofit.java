package Array;

public class Storethefrequecny_and_maximumvalueofit {
        // Method 1 ;
        public static int findLucky(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return -1;
            }
            int[] nums = new int[501];
            for (int a : arr) {
                nums[a]++;
            }
            for (int i = arr.length-1; i > 0; i--) {
                if (nums[i] == i)
                    return i;
            }
            return -1;
        }


        //Method 2

        public int findLucky2(int[] arr) {
        int res = -1;

        if (arr == null || arr.length == 0)
            return res;

        int[] store = new int[500+1]; // if we read the Constraints, the max length is 500

        for (int i = 0; i < arr.length; i++) {
            store[arr[i]]++; // increment each elements in the store arr
        }

        for (int i = store.length - 1; i >= 1; i--) { // iterate from the end
            if (store[i] == i) // find the max element from the end, which equals condtions of the lucky integer
                return store[i];
        }

        return res;
    }
}

