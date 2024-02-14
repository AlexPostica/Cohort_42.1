package lesson13;

import lesson12.HomeWork12;
import lesson9.HomeWork9;

/**
 * AIT-TR, cohort 42.1, Java Basic, #12
 * @author Alexandru
 * @version 9.Feb
 */
public class Lesson13 {
    public static void main(String[] args) {
        int[] array = HomeWork9.createRandomArray(100_000_000, 100);

        long startTime = System.currentTimeMillis();
        System.out.println(HomeWork12.linearSearch(array, 88));
        System.out.println((System.currentTimeMillis() - startTime) + "ms");

        HomeWork12.selectionSort(array);

        startTime = System.currentTimeMillis();
        System.out.println(HomeWork12.binarySearch(array, 88));
        System.out.println((System.currentTimeMillis() - startTime) + "ms");
    }
}