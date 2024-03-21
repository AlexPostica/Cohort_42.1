package lesson29;
/**
 * AIT-TR, cohort 42.1, Java Basic, #29
 * @author Alexandru Postica
 * @version 20.Mar
 */
public class Lesson29 {
    public static void main(String[] args) {
        RubberList rubberList = new RubberList();
        System.out.println(rubberList);
        rubberList.add(3);
        rubberList.add(20);
        rubberList.add(-5);
        rubberList.add(2024);
        rubberList.add(2);
        rubberList.add(-45);
        System.out.println(rubberList);

        // get
        System.out.println(rubberList.get(2));
        System.out.println(rubberList.get(3));

        // remove
        rubberList.remove(0);
        System.out.println(rubberList);
        rubberList.remove(2);
        System.out.println(rubberList);
    }
}
