package lesson18;

import java.util.logging.SocketHandler;

/**
 * AIT-TR, cohort 42.1, Java Basic, #18
 * @author Alexandru Postica
 * @version 23.Feb
 */
public class Lesson18 {
    public static void main(String[] args) {
        final int a;
        a = 10;
        ///a = 5 + 1; compile error

        System.out.println(Robot.COMPANY_NAME);

        Robot robot = new Robot(8);
        System.out.println(robot);
        System.out.println(Robot.getCount());
        System.out.println(robot.add(4 ,4));

        Robot r2d2 = new Robot(4);
        System.out.println(r2d2);
        System.out.println(Robot.getCount());
    }
}