package lesson18.homework18;

/**
 * AIT-TR, cohort 42.1, Java Basic, hw #18
 * @author Alexandru Postica
 * @version 24.Feb
 */
public class HomeWork18 {
    public static void main(String[] args) {

        System.out.println(Phone.COMPANY_NAME);

        Phone phone = new Phone();
        System.out.println(Phone.getCount());
        System.out.println(phone.isCharger(true));

        Phone phone1 = new Phone();
        System.out.println(Phone.getCount());
        System.out.println(phone1.isCharger(false));
    }
}
