public class triangle2 {
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
            
            star(r, c+1);
            System.out.print("*");
            }
        
        else{
            
            star(r-1, 1);
            System.out.println();
        }

    }
}

    