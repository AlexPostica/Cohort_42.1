package lesson15;
/**
 * AIT-TR, cohort 42.1, Java Basic, #14
 * @author Alexandru
 * @version 16.Feb
 */
public class ClassWork15 {
    public static void main(String[] args) {
        Cat cat = new Cat("Mursik", "White", 3, 100);
        cat.voice();
        System.out.println(cat.name +  ", " + cat.color + ", " + cat.age);
        cat.eat(50);
        System.out.println(cat.satieted());
        Cat cat1 = new Cat("Barsik", "Black", 5, 100);
        cat1.voice();
        System.out.println(cat1.name +  ", " + cat1.color + ", " + "age " + cat1.age);
        cat1.eat(80);
        System.out.println(cat1.satieted());
        System.out.println(cat.walk());
        System.out.println(cat1.run());
    }
}
