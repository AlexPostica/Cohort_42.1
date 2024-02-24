package lesson17;

/**
 * AIT-TR, cohort 42.1, Java Basic, #17
 * @author Alexandru Postica
 * @version 21.Feb
 */
public class Lesson17 {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik,", "White,", 3);
        cat.setName(null);
        System.out.println("Name: " + cat.getName() + "Color: " + cat.color + "Age: " + cat.age);
        cat.voice();
    }
}