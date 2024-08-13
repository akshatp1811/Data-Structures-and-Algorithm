// package BitManipulation;
// //Find the nth magic number using Bit Manipulation
public class magicnumber {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;
        while (n>0) {
            int dig = n&1;
            n = n >> 1;
            ans += dig*base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
