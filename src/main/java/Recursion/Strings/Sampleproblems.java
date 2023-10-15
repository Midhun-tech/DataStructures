package Recursion.Strings;

public class Sampleproblems {

    public static void main(String[] args) {

        System.out.println(SkipString("bappleb"));  // output : bccb

    }

    // skip the desired character

    static void skipchar(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(up.charAt(0) == 'a'){
            skipchar(p, up.substring(1));
        }
        else{
            skipchar(p+ up.charAt(0), up.substring(1));
        }
    }

    // Skip the desire character and return the string
    static String skipchar(String up){

        if(up.isEmpty()){
            return "";
        }
        if(up.charAt(0) == 'a'){
            return skipchar(up.substring(1));
        }
        else{
           return up.charAt(0) + skipchar(up.substring(1));
        }
    }

    // Skip the desire string and return the string

    static String SkipString(String up){

        if(up.isEmpty()){

            return "";
        }

        if(up.startsWith("apple")){
            return SkipString(up.substring(5));
        }
        else{
            return up.charAt(0) + SkipString(up.substring(1));
        }

    }

}
