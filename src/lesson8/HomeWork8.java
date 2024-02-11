package lesson8;

import java.util.Arrays;
import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, hw #8
 * @author Alexandru
 * @version 31.Jan
 */
public class HomeWork8 {
    public static void main(String[] args) {
        // task1
        for (int i = 1; i < 11; i++) {
            System.out.println("Task" + i);
        }

        // task2
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i : a) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        // task3
        String[] s = {"Java", "C++", "C#", "go"};
        String strMaxLength = "";
        for (String str : s) {
            if (str.length() > strMaxLength.length()) {
                strMaxLength = str;
            }
        }
        for (char chr : strMaxLength.toCharArray()) {
            System.out.println(chr);
        }

        // task4
        Random random = new Random();
        int[] n = new int[100];
        int sum = 0;
        // fill array with random int numbers
        for (int i = 0; i < n.length; i++) {
            n[i] = random.nextInt(100);
        }
        int max = n[0];
        int min = n[0];
        // execute array
        for (int i : n) {
            sum += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Max = " + max + ", min = " + min + ", average = " + (sum / (double) n.length) + " " + (sum / n.length));

        // task4 #1
        int arrayLength = 10;
        int[] arrays = new int[arrayLength];
        random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            arrays[i] = random.nextInt(10) + 1;
        }

        System.out.print("Arrays:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(arrays[i]);
            if (i < arrayLength - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        int minValue = arrays[0];
        int maxValue = arrays[0];
        sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (arrays[i] < minValue) {
                minValue = arrays[i];
            }
            if (arrays[i] > maxValue) {
                maxValue = arrays[i];
            }
            sum += arrays[i];
        }

        int average = (int) sum / arrayLength;
        System.out.println("Minimum: " + minValue);
        System.out.println("Maximum: " + maxValue);
        System.out.println("Average: " + average);

        // task5
        String exp = "16+23-8+8";

        String[] tokens = new String[10];
        int idx = 0;
        String number = "";
        for (int i = 0; i < exp.length(); i++ ) {
            char ch = exp.charAt(i);
            switch (ch){
                case '+', '-', '*', '/':
                    tokens[idx] = number;
                    tokens[idx + 1] = String.valueOf(ch);
                    idx += 2;
                    number = "";
                    break;
                case '0','1','2','3','4','5','6','7','8','9':
                    number += ch;
                    break;
            }
        }
        if (!number.isEmpty()) {
            tokens[idx] = number;
            idx++;
        }
        System.out.println(Arrays.toString(tokens));
        System.out.println(idx);
    }
}
