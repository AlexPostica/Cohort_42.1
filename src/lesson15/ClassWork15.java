package lesson15;
/**
 * AIT-TR, cohort 42.1, Java Basic, #14
 * @author Alexandru
 * @version 16.Feb
 */
public class ClassWork15 {
    public static void main(String[] args) {
        Cat cat = new Cat(); //"Murzik","White", 3
        cat.voice();
        System.out.println(cat.name +  ", " + cat.color + ", " + cat.age);

        Cat cat1 = new Cat("Barsik", "Black", 5, 10);
        cat1.voice();
        cat1.eat(6);
        System.out.println(cat1.name +  ", " + cat1.color + ", " + cat1.age);
        System.out.println();
    }
}
