/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int arr1Index = 0;
        int arr2Index = 0;
        int arr3Index = 0;

        while (arr1Index < arr1.length && arr2Index < arr2.length) {
            if (arr1[arr1Index] < arr2[arr2Index]) {
                arr3[arr3Index] = arr1[arr1Index];
                arr3Index++;
                arr1Index++;
            } else {
                arr3[arr3Index] = arr2[arr2Index];
                arr3Index++;
                arr2Index++;
            }

        }
        while (arr1Index < arr1.length) {
            arr3[arr3Index] = arr1[arr1Index];
            arr3Index++;
            arr1Index++;
        }
        while (arr2Index < arr2.length) {
            arr3[arr3Index] = arr2[arr2Index];
            arr3Index++;
            arr2Index++;
        }
        return arr3;
    }

}

