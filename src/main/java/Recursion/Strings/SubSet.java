package Recursion.Strings;

import java.util.ArrayList;

public class SubSet {

    public static void main(String[] args) {

        SubSetofString("","abc");
        //System.out.println(Subsets("","abc"));
    }

    //Subsets of string "abc"
    static void SubSetofString(String p, String s){

        if(s.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        //Added character to processed string
        SubSetofString(p + s.charAt(0), s.substring(1));

        // Skip character
        SubSetofString(p, s.substring(1));
    }


    // Adding subset elements in to arraylist without passing arraylist as a parameter


    static ArrayList<String> Subsets(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> leftcall = Subsets(p + up.charAt(0), up.substring(1));
        ArrayList<String> rightcall = Subsets(p , up.substring(1));
        leftcall.addAll(rightcall);
        return leftcall;
    }

}
