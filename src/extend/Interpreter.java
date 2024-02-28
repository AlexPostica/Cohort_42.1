package extend;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hw #10
 * @author Alexandru Postica
 * @ version 8,23,26-Feb
 */
public class Interpreter {

    static int[] values = new int[26];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.print("# ");
            line = scanner.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "print":
                    printValue(tokens[1]);
                    break;
                case "exit":
                    System.out.println("Exit from interpreter.");
                    break;
                default:
                    assignValue(line);
            }
        } while (!line.equals("exit"));
    }

    static void assignValue(String line) {
        String[] tokens = line.split("=");
        // TODO izmenenia na uroke!
        String varName = tokens[0].trim();
        if (tokens.length == 1) {
            System.out.println("Error: Invalid command");
        }
        String varValue = tokens[1].trim();
        // check variable name
        if (!validateVarName(varName)) {
            return;
        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // transform "123" -> 123
        int value = Integer.valueOf(varValue);
        // assign value
        values[idx] = value;
    }

    static void printValue(String varName) {
        // check variable name
        if (!validateVarName(varName)) {
            return;
        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // print value of variable
        System.out.println(values[idx]);
    }

    static boolean validateVarName(String varName) {
        // check variable name length
        if (varName.length() > 1) {
            System.out.println("Error: variable name is too long");
            return true;
        }
        if (varName.isEmpty()) {
            System.out.println("Error: variable name is empty");
            return true;
        }
        // check if variable name in 'a'..'z'
        char nameChar = varName.charAt(0);
        if ((nameChar < 'a') || (nameChar > 'z')) {
            System.out.println("Error: variable name is invalid");
            return false;
        }
        return true;
    }
}
