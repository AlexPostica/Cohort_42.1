package lesson3;
/**
 * AIT-TR, cohort 42.1, Java Basic, hm #3
 * @author Alexandru Postica
 * @version 19.Jan
 */
public class HomeWork3 {
    public static void main(String[] args) {
        // task #1
        int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5, num6 = 6, num7 = 7, num8 = 8, num9 = 9;
        int sum = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num7 + num8 + num9);
        System.out.println(sum / 10f);

        // task #2
        int priceA = 1000;
        int priceB = 500;
        int p = priceA + priceB;
        System.out.println(p);
        System.out.println(p * 10/100);

        // task #3
        int mon = 7;
        int tue = 7;
        int wed = 12;
        int thu = 7;
        int fri = 9;
        int sat = 4;
        int sun = 7;
        int sumday = ( mon + tue + wed + thu + fri + sat + sun) / 7;
        System.out.println(sumday);

        // task #4
        int a = 9 % 2;
        int b = 10 % 2;
        int c = 11 % 2;
        System.out.println(a + ", " + b + ", " + c);
        System.out.println((9 % 3) + ", " + (10 % 3) + ", " + (11 % 3) + ", " + (12 % 3));

        // task #5
        int x = 3;
        x += x++;
        System.out.println(x);
    }
}
