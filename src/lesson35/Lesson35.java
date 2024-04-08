package lesson35;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * AIT-TR, cohort 42.1, Java Basic, #35
 * @author Alexandru Postica
 * @version 8.Apr
 */
public class Lesson35 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("i", "love", "Java"));
        stringList.add("too");
        stringList.add("Java");
        System.out.printf("stringList");

        Set<String> stringSet = new HashSet<>(List.of("i", "love", "Java", "very"));
        stringSet.add("too");
        stringSet.add("Java");
        System.out.printf("stringSet");
    }
}
