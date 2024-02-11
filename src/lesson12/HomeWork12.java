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
        int[] arr = {3, 71 ,74, 83, 34, 66, 55, 12};
        int numSearch = 55;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numSearch){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
        System.out.println(Arrays.toString(arr));
    }
}
