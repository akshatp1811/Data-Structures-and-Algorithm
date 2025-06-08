public class binarysearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int s = 0;
        int e = arr.length;
        int target = 9;
        
        System.out.println(search( arr , target , s , e));
        
    }
    static int search(int[] arr , int target , int s , int e)
    {
        int mid = (s + e)/2;
        if(s>e)
        {
            return -1;
        }
        
         if(arr[mid] == target)
        {
            return mid;
        }
         if(arr[mid] > target)
        {
            return search(arr ,target , s , mid -1);
        }
         if(arr[mid] < target)
        {
            return search(arr,target , mid +1, e);
        }
return mid;
    }
    
}
