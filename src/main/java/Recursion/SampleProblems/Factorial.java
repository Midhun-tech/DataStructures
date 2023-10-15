package Recursion.SampleProblems;

public class Factorial {

    public static void main(String[] args) {
        int num  = 3;
        System.out.println(factorial(num));
    }

    static int factorial (int n){
        //Base condition
        if(n <=1){
            return 1;
        }
        int answer = n * factorial(n-1);
        return answer;
    }

}
