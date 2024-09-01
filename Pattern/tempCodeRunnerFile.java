
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,3,7,9,1,2};
        star(5, 0 , arr);
        printarr(arr , 6);
        
    }
    static void star(int r , int c , int[] arr)
    {
        if(r == 0)
        {   
            return ;
            
        }
        if (c<=r) {
            if (arr[c] > arr[c + 1]) {
                // Swap the elements
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
                
            }
            star(r, c+1 , arr);
            
            }
        
        else{
            star(r-1, 0 , arr);
            
        }

    }
    static void printarr(int[] arr , int size){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
}
}

    