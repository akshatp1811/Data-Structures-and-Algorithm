import java.util.Arrays;

/**
 * selectionsort
 */
public class selectionsort {

    public static void main(String[] args) {
        int[] arr = { 56 ,23 , 19, -19 , -46 , 1 ,34 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
        // int[] ans = sort(arr);
    }

   public static void sort(int [] arr){
        // we will be using functions for all the steps
        // find the max item in the remaining array and swap with correct index
        for(int i=0;i<arr.length; i++)
        {
        int last = arr.length - i - 1;
        //this helps to traverse through the remaining unsorted array
        int maxIndex = getMaxindex(arr , 0 , last);
        swap(arr , maxIndex ,last);
    }

}
static void swap(int[] arr , int first , int second)
{
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
} 

    public static int getMaxindex(int[] arr , int start , int end)
     {
        int max = start;
            for(int i = start; i< end ; i++)
            {
                if (arr[max] < arr[i]) {
                    max = i;
                }
            }
            return max;
    }

    
}
