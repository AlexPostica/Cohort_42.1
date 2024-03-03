package extend;

/**
 * AIT-TR, cohort 42.1, Java Basic, #20 ext
 * @Alexandru Postica
 * @version 1-Mar
 */
public class Variables {
    private int[] values = new int[26];

    public Integer getValue(String varName) {
        // check variable name
        if (!validateVarName(varName)) {
            return null;
        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        return values[idx];
    }
    public void assignValue(String line) {
        String[] tokens = line.split("=");
        String varName = tokens[0].trim();
        // if right side from '=' is not empty
        if (tokens.length == 1) {
            System.out.println("Error: Invalid command");
            return;
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

    private boolean validateVarName(String varName) {
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
