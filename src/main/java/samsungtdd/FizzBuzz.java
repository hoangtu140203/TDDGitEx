package samsungtdd;


public class FizzBuzz {
    public static String[] solve(int n) {
        if(n>=1){
            String[] result = new String[n];
            for (int i = 1; i <= n; i++) {
                result[i-1] = change(i);
            }
            return result;
        }else {
            throw new IllegalArgumentException("is invalid input");
        }
    }


    public static String change(int n){
        if(n%3==0 && n%5==0){
            return "FizzBuzz";
        }else if(n%3==0){
            return "Fizz";
        }else if (n%5==0){
            return "Buzz";
        }else{
            return String.valueOf(n);
        }
    }
}










