import java.util.*;

public class test {
    public static void main(String args[]) {

        String  s1 = "ab" ;
        String  s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));

        /*String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // System.out.println(groupAnagrams(s));.
        String[] s1 = new String[]{"", ""};
        int[] nums = {0,3,7,2,5,8,4,6,0,1};*/
        // String s = "abca";
        // String[] str = {"eat","tea","tan","ate","nat","bat"};

        //System.out.println(Arrays.toString(containsDuplicate(str)));
        //   System.out.println(isPalindrome(s));
    }

    static boolean checkInclusion(String s1, String s2) {

        int[] char_count = new int[26];

        HashMap<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < s1.length() ; i++) {

            if(map1.containsKey(s1.charAt(i))){

                map1.put(s1.charAt(i) , map1.get(i)+1);
            }
            else
            {
                map1.put(s1.charAt(i),1);
            }

        }

        HashMap<Character,Integer> map2 = new HashMap<>();

        int right = 0 , left =0;
        while(right < s2.length()){


            if(map1.containsKey(s2.charAt(right))){

                map2.put(s2.charAt(right),map2.get(right)+1);
            }
            else
            {
                map2.put(s2.charAt(right),1);
            }

            if(map1.equals(map2)){
                return true;
            }

            if(!map1.equals(map2)){

                map1.remove(s1.charAt(left));
                left++;
            }
            right++;

        }
        return false;
    }
}



