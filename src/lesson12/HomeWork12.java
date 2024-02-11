package lesson12;

import java.util.Arrays;

/**
 * AIT-TR, cohort 42.1, Java Basic, hw #12
 * @author Alexandru
 * @version 9.Feb
 */
public class HomeWork12 {
    public static void main(String[] args) {
        // task1
        int[] arr = {3, 71, 74, 83, 34, 66, 55, 12};
        int numSearch = 55;
        int idx = -1;
        int i = 0;
        int minIndex = i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == numSearch) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // task2
    public static void selectionSort(int[] arr) {
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
