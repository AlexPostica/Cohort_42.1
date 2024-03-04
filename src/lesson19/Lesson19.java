package lesson19;

/**
 * AIT-TR, cohort 42.1, Java Basic, #18
 * @author Alexandru Postica
 * @version 26.Feb
 */
public class Lesson19 {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();
        ra.add(10);
        ra.add(20);
        ra.add(31);
        ra.add(26);
        ra.add(-1);
        ra.add(33);
        System.out.println(ra);
        System.out.println(ra.get(2));
        ra.remove(2);
        System.out.println(ra);
    }
}
