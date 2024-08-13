public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        //A boolean array upto index n which stores true =  false =
        boolean[] primes = new boolean[n+1];
        sieve(n , primes);
    }
    static void sieve(int n , boolean[] primes)
    {
        //start checking from index 2 i.e first prime i*i <= n old logic
        for(int i = 2 ; i*i <= n ; i++){
            //False means a number is prime and then we make all the multiples of that number not prime
            //we will make all the multiples of i(i.e prime) to true i.e not prime i.e all j = j+i
            if (!primes[i]) {
                      for(int j = i*2 ; j <= n ; j=j+i){
                    primes[j] = true;
            }
        }
        for(int k = 2;k <= n ; k++){
            if(!primes[k]){
                System.out.println(k + " ");
            }
        }
    }
}
}
    
            
      

