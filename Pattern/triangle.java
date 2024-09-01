// ****
// ***
// **
// *

public class triangle {
    public static void main(String[] args) {
        star(4, 1);
        
    }
    static void star(int r , int c)
    {
        if(c == r)
        {   
            System.out.println("*");
            star(r-1, 1);
            
        }

        

        if (c<r) {
            System.out.print("*");
            star(r, c+1);
            }
        }

    
}
