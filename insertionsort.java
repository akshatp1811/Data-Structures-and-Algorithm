import java.util.Arrays;

public class insertionsort  {
    public static void main(String[] args) {
        int[] arr = { 56 ,23 , 19, -19 , -46 , 1 ,34 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int first , int second)
{
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
} 
    public static void sort(int[] arr)
    {
        for(int i = 0; i<arr.length - 1; i++){
            for (int j = i+1 ; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1);
                }
                else{
                    break;
                }

                
            }
        }
    }
    
        
    
    
}

