package Array.Recurssion;

public class strings {
    public static void main(String args[]) {

        // System.out.println(skip("abcd apple fgd"));
        skip2("", "abbcde");

    }

    static String skip(String up) {

        if (up.isEmpty()) {
            return up;
        }
        if (up.startsWith("apple")) {
            return skip(up.substring(6));
        }
        return up.charAt(0) + skip(up.substring(1));
    }

    // method 2

    static void skip2(String empty, String up1) {

        if (up1.isEmpty()) {
            return ;
        }
        char ch = up1.charAt(0);
        if (ch == 'a') {
            skip2(empty,up1.substring(1));
        }
        else {
            skip2(empty + ch, up1.substring(1));
        }
    }
}
