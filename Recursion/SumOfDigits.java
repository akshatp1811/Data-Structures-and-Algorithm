public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123;
        int sumofdig = sum(n);
        System.out.println(sumofdig);

    }
    static int sum(int n){
     if(n<1){
        return 0;
     }
     return sum(n/10) + n%10;

    }
    
    
}
