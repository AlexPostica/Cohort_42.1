package lesson4;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm #4
 * @author Alexandru
 * @version 22.Jan
 */
public class HomeWork4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter your city:");
        String city = scanner.nextLine();
        System.out.println("Enter how many years you have:");
        String age = scanner.nextLine();
        System.out.println("Enter your height (meters):");
        String height = scanner.nextLine();
        System.out.println("My name " + name + ", i have " + age + " years," + " my city is " + city + ", my height " + height);
    }
}
