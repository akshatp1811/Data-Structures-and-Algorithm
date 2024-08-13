public class reverse {
    public static void main(String[] args) {
        int n = 123;
        int dig = (int)(Math.log10(n))+1;
        int rever = rev(n, dig);
        System.out.println(rever);


    }
    static int rev(int n ,int dig){
     if(n<1){
        return 0;
     }
     return   n%10*(int)(Math.pow(10, dig-1)) + rev(n/10,dig-1);
    //  return rev(n/10,dig-1)*10^(dig-1) + n%10*10;

    }
    
    
}
