package lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm #5
 * @author Alexandru Postica
 * @version 23.Jan
 */
public class HomeWork5 {
    public static void main(String[] args) {
        // task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scanner.nextInt();
        boolean a = n % 2 == 0;
        boolean b = n % 3 == 0;
        boolean c = a && b;
        System.out.println("Number: " + a);
        System.out.println("Even: " + b);
        System.out.println("Multiple: " + c);

        // task 2
        System.out.println("Enter number: 1, 2, 3.");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num == 3) {
            System.out.println("Three");
        } else {
            System.out.println("False");
        }

        // task 3
        Random random = new Random();
        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);
        System.out.println("Generated Numbers: "  + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ".");

        // Determining the Maximum Number
        int maxNum = Math.max(Math.max(num1, num2), Math.max(num3, num4));;
        System.out.println("Maximum Number: " + maxNum);

        // task 3 #1
        Random random1 = new Random();
        int n1 = random.nextInt(101);
        int n2 = random.nextInt(101);
        int n3 = random.nextInt(101);
        int n4 = random.nextInt(101);

        int n12 = n1 < n2? n2 : n1;
        int n34 = n3 < n4? n4 : n3;
        int max = Math.max(n12, n34);
        System.out.println("Generated Numbers: "  + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", max: " + max);

        // task 4
        String str = "4231";
        if (str.length() == 4) {
            num1 = str.charAt(0) - '0';
            num2 = str.charAt(0) - '0';
            num3 = str.charAt(0) - '0';
            num4 = str.charAt(0) - '0';
            System.out.println(num1 + num2 == num3 + num4? "Lucky number" : "Unlucky number:");
        } else {
            System.out.println("Wrong input: " + str);
        }
    }
}
