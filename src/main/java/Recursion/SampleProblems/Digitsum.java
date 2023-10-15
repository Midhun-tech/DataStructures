package Recursion.SampleProblems;

public class Digitsum {

    public static void main(String[] args) {
        int num = 12121;
        System.out.println(palindrome(num));

    }

    static int digitsum(int n){

        if(n == 0){
            return n;
        }

        int remainder = n % 10;  // 123 % 10 = 3
        int remainingnum = n / 10 ; // 123 / 10 =12
        return remainder + digitsum(remainingnum);
    }

    // Reverse the digit

    static int reversedigit(int n){

        int digits = (int)(Math.log10(n))+1;
        return helperfunction(n,digits);
    }

    private static int helperfunction(int n, int digits) {
        if(n == 0){
            return n;
        }
        int remainder = n%10;

        return  remainder * (int)(Math.pow(10,digits-1)) + helperfunction(n/10,digits-1);
    }

    // check the given number is palindrome or busy using above functions
    static boolean palindrome(int n){

        int reverse_digit = reversedigit(n);

        if(n == reverse_digit){
            return true;
        }
        return false;
    }



}
