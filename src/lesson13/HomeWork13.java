package lesson13;

import lesson12.HomeWork12;
import lesson9.HomeWork9;

/**
 * AIT-TR, cohort 42.1, Java Basic, hw #13
 * @author Alexandru
 * @version 13.Feb
 */
public class HomeWork13 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] array = HomeWork9.createRandomArray(100_000, 100);
        System.out.println((System.currentTimeMillis() - startTime) + "ms - create array");

        startTime = System.currentTimeMillis();
        HomeWork12.linearSearch(array, 50);
        System.out.println((System.currentTimeMillis() - startTime) + "ms - linear search");

        startTime = System.currentTimeMillis();
        HomeWork12.selectionSort(array);
        System.out.println((System.currentTimeMillis() - startTime) + "ms - selection sort");

        startTime = System.currentTimeMillis();
        HomeWork12.binarySearch(array, 50);
        System.out.println((System.currentTimeMillis() - startTime) + "ms - binary search");
    }
}
