package extend;

import java.util.Arrays;

/**
 * AIT-TR, cohort 42.1, Java Basic, #8 ext
 * @Alexandru Postica
 * @version 1-Feb
 */
public class HomeWorkExt8 {
    public static void main(String[] args) {

        // hw #8 task #5 ext
        String exp = "16 + 23 - 123 + 8";

        String[] tokens = new String[10];
        int idx = 0;
        String number = " ";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            switch (ch) {
                case '+', '-', '*', '/':
                    tokens[idx] = number;
                    tokens[idx + 1] = String.valueOf(ch);
                    idx += 2;
                    number = " ";
                    break;
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    number += ch;
                    break;
            }
        }
        if (!number.isEmpty()) {
            tokens[idx] = number;
            idx++;
        }
        System.out.println(Arrays.toString(tokens));
        System.out.println(idx);
    }
}
