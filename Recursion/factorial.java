/**
 * factorial
 */
public class factorial {

    public static void main(String[] args) {
        int n = 5;
        int factorial = fact(n);
        System.out.println("Factorial of the number is "+ factorial);
    }
    static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
}