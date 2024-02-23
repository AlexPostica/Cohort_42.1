package extend;
/**
 * AIT-TR, cohort 42.1, Java Basic, hw #10
 * @Alexandru Postica
 * @version 8-Feb
 */
import java.util.Scanner;

public class Interpreter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.print("#");
            line = scanner.nextLine();
            String[] tokens = line.split(" ");
            //System.out.println(Arrays.toString(words));
            switch (tokens[0]){
                case "print":
                    printValue(line);
                    break;
                case "exit":
                    System.out.println("exit from Interpreter");
                    break;
                default:
                    assigValue(line);
            }
        } while (!line.equals("exit"));
    }
    static void assigValue(String line) {
        String[] tokens = line.split("=");
        String varName = tokens[0].trim();
        String varValue = tokens[1].trim();
    }
    static void printValue(String line) {
    }
}
