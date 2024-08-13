import java.util.*;
/**
 * prime
 */
public class prime {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = x.nextInt();
        System.out.println(num + " " + isPrime(num));
    }
}
boolean isPrime(int num){
    int c = 2;
while (c*c <= num)
{
    if(num % c == 0)
    {
        return false;
    }
}
return true;
}