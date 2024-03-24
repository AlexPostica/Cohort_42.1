package extend;

/**
 * AIT-TR, cohort 42.1, Java Basic, #extend
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
        // return value
        return values[idx];
    }

    public void setValues(String varName, String varValue) {
        // check variable name
        if (!validateVarName(varName)) {
            return;
        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // transform "123" -> 123
        int value;
        try {
            value = Integer.valueOf(varValue);
        }catch (NumberFormatException e) {
            System.out.println("Error: invalid value");
            return;
        }
        // asign value
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
