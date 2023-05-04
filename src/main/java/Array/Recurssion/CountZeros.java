package Array.Recurssion;

public class CountZeros {
    public static void main(String args[])
    {

        System.out.println(recurssion(3010));
    }

    static int recurssion(int n) {
        int c;
        return  helper(n, c = 0);
    }
    static int helper(int n , int c ) {

        if (n == 0) {
            return c;
        }
        if (n % 10 == 0)
            return helper(n / 10, c+1);
        else
            return helper(n/10,c);
    }

}
