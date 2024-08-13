public class print {
    public static void main(String[] args) {
        int n = 5;
        func(n);
    }
    static void func(int n){
        if(n == 0)
        {
            return;
        }
        //func(n-1) will print 12345
        System.out.println(n);
        func(n-1);
    }
    

}
