package Array.Recurssion;

import java.util.ArrayList;

public class SubsetwithArraylist {
    public static void main(String args[]) {

        System.out.println(recurssion("", "abc"));

    }

    static ArrayList<String> recurssion(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list =  new ArrayList<>();
            if(p.isEmpty()){
                return list;
            }
            list.add(p);
            return list;
        }
        ArrayList<String> left = recurssion(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = recurssion(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
