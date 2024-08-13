public class ProductsofDigits {
    public static void main(String[] args) {
        int n = 123321;
        int productofdig = prod(n);
        System.out.println(productofdig);

    }
    static int prod(int n){
     if(n%10 == n){//if one digit is remaining then return that digit
        return n;
     }
     return prod(n/10)*(n%10);

    }
    
    
}
