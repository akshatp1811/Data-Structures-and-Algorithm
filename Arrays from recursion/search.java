public class search {
    public static void main(String[] args) {
        int[] arr = {2,6,8,1,6,9,3};
        int target = 1;
        boolean result = linsearch(arr, 0, target);
        System.out.println(result);
        int atIndex = findIndex( arr , 0 , target);
        System.out.println("The Element is present at " + atIndex + " index");
        
    }
    public static boolean linsearch(int[] arr , int i , int target){
        if(i == arr.length)
        {
            return false;
        }
        return ((arr[i]==target)||linsearch(arr, i+1, target));
    }
    static int findIndex(int[] arr , int i , int target)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i]==target)
        {
            return i;
        }
        else
        {
        return findIndex(arr, i+1, target);
        }

    }
    
}
