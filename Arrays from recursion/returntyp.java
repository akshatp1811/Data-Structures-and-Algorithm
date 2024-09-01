    import java.util.ArrayList;
    public class returntyp {
    public static void main(String[] args) {
        int[] arr = {2,6,8,6,1,9,1,3};
        int target = 1;
        findIndex( arr , 0 , target);
        
        System.out.println(findIndex(arr, target, target));
    }
    
    static ArrayList<Integer> findIndex(int[] arr , int i , int target)
    {
        //Will create new arraylist for all function calls
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length)
        {
            return list ;
        }
        if(arr[i]==target)
        {
            list.add(i);
        }
        findIndex(arr, i+1, target);

        ArrayList<Integer> ansfrombelowcalls = findIndex(arr , i+1 , target);//this recursive call will add the 
        //answer from the previous call in the list by this method at the end will get answers of all the calls in our
        //arraylist.


        list.addAll(ansfrombelowcalls);

        //This step adds the current answer to the Answer from below calls.

        return list;

    }
    
}
