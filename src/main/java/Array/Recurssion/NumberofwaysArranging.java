package Array.Recurssion;

public class NumberofwaysArranging {
    public static void main(String args[]) {

        recurssion("", "abc");

    }

    static void recurssion(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int count = 0;
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            recurssion(f + up.charAt(0) + s, up.substring(1));
        }

    }
}
