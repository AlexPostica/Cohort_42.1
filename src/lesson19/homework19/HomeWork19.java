package lesson19.homework19;

public class HomeWork19 {
    public static void main(String[] args) {
        RubberArray rb = new RubberArray();
        rb.add(8);
        rb.add(4);
        rb.add(3);
        rb.add(2);
        rb.add(1);
        System.out.println(rb);
        System.out.println(rb.contains(11));
        System.out.println(rb.indexOf(11));
        System.out.println(rb.indexOf(9));
        rb.add(-3 , 3);
        System.out.println(rb);
    }
}
