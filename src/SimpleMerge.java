/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int arr3[];
        arr3 = new int[len1 + len2];
        int j = 0;
        while (j<len1+len2) {
            for (int i = 0; i<len1; i++)
            {
                arr3[j] = arr1[i];
                j++;
            }
            for (int k = 0; k<len1; k++)
            {
                arr3[j] = arr2[k];
                j++;
            }
        }
        for (int index = 0; index < arr3.length ; index ++)
        {
            for (int p = index; p > 0; j-- )
            {
                if (arr3[p]<arr3[p-1])
                {
                    swap(arr3, p,p-1);
                }
            }
        }
        return arr3;
    }

    public static void swap (int[]arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
