package Array;// https://www.youtube.com/watch?v=pzQvKGcze3A

import java.util.HashMap;
import java.util.Map;

public class hasshmap {
    public static void main(String args[]) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(getmaxvalueinhashmap(nums));
    }

    static int getmaxvalueinhashmap(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int maxfreq = 1;
        int maxkey = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
                map.put(nums[i],1);

            if(maxfreq<map.get(nums[i])){
                maxfreq++;
                maxkey = nums[i];
            }

        }
        return maxkey;

    }

    // Reading hasmap key and value

  /*  for(Map.Entry entry:map.entrySet()){
        System.out.println(entry.getKey()+""+entry.getValue());
    }*/
}
