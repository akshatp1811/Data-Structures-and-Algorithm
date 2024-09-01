import java.util.ArrayList;

public class multipleelemtnts {
    public static void main(String[] args) {
        int[] arr = {2,6,8,6,1,9,1,3};
        int target = 1;
        findIndex( arr , 0 , target);
        
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();//
    static void findIndex(int[] arr , int i , int target)
    {
        if(i == arr.length)
        {
            return ;
        }
        if(arr[i]==target)
        {
            list.add(i);
        }
        findIndex(arr, i+1, target);

    }
    
}
