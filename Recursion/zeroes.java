public class zeroes {
    public static void main(String[] args) {
        int n =103030;
        // int c = 0;
        int zero = nzro(n, 0);
        System.out.println("Number of Zeroes = " +zero);

        
    }
    static int nzro(int n,int c){
        if(n == 0){
            return c; //terminating case
        }
        //there will be to main parts of this recursive function 1st that will be the one that will give the remainder and next that will decrease the length of the function recursivery
        int rem = n%10;
        if(rem == 0){
            return nzro(n/10, c+1);
        }
        else{
            return nzro(n/10, c);
        }
    }
}
