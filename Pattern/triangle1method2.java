public class triangle1method2 {
    // *
    // **
    // ***
    // ****
        public static void main(String[] args) {
            star(4, 1);
            
        }
        static void star(int r , int c)
        {
            if(r == 0)
            {   
                return;
                
            }
            if (c<=r) {
                System.out.print("*");
                star(r, c+1);
                
                }
            
            else{
                System.out.println();
                star(r-1, 1);
                
            }
    
        }
    }
    
        