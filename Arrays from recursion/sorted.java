import java.util.*;
public class sorted {
    public static void main(String[] args) {
        int[] arr = {2,1,4,6,8,9};
        boolean isArrSorted = isSorted(arr , 0);
        System.out.println(isArrSorted);
        
    }
    static boolean isSorted(int[] arr , int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        return ((arr[i] < arr[i+1]) && isSorted(arr, i+1));
        
    }
}
