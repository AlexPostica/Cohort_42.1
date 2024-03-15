package lesson23;

/**
 * AIT-TR, cohort 42.1, Java Basic, #22
 * @author Alexandru Postica
 * @version 6.Mar
 */
public class Lesson23 {
    public static void main(String[] args) {
        Lesson23 lesson23 = new Lesson23();
        System.out.println(lesson23);
        System.out.println(lesson23.hashCode());
        System.out.println(Integer.toHexString(lesson23.hashCode()));
    }

    //TODO

    @Override
    public String toString() {
        return "Lesson23{}";
    }
}
