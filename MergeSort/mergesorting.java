import java.util.Arrays;

public class mergesorting {
    public static void main(String[] args) {
        int[] arr = {5, 3, 12, 4, 8, 6};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        // Create a new array of size first.length + second.length
        int[] merg = new int[first.length + second.length];
        int i = 0; // pointer for first array
        int j = 0; // pointer for second array
        int k = 0; // pointer for merged array

        // Merge the two arrays
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                merg[k] = first[i];
                i++;
            } else {
                merg[k] = second[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of the first array, if any
        while (i < first.length) {
            merg[k] = first[i];
            i++;
            k++;
        }

        // Copy remaining elements of the second array, if any
        while (j < second.length) {
            merg[k] = second[j];
            j++; // Corrected increment
            k++;
        }

        return merg;
    }
}
