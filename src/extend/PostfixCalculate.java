package extend;

import java.util.Stack;

/**
 * AIT-TR, cohort 42.1, Java Basic, #extend
 * @author Alexandru Postica
 * @version 24.Mar
 */

/*  Infix Notation
    A + B
    A + B - C
    A + B * C
    (A + B) * C
*/

/*  Prefix Notation
    A B +
    A B + C -
    C B * A +
    A B + C *
 */
public class PostfixCalculate {
    public static void main(String[] args) {
        String[] postfix = {"10", "5", "+"};
        Stack<String> stack = new Stack<>();
        int a, b, c;

        for (String str: postfix) {
            switch (str) {
                case "+":
                    a = Integer.valueOf(stack.pop());
                    b = Integer.valueOf(stack.pop());
                    c = a + b;
                    stack.push(String.valueOf(c));
                    break;
                case"-":
                    a = Integer.valueOf(stack.pop());
                    b = Integer.valueOf(stack.pop());
                    c = a - b;
                    stack.push(String.valueOf(c));
                    break;
                case "*":
                    a = Integer.valueOf(stack.pop());
                    b = Integer.valueOf(stack.pop());
                    c = a * b;
                    stack.push(String.valueOf(c));
                    break;
                case"/":
                    a = Integer.valueOf(stack.pop());
                    b = Integer.valueOf(stack.pop());
                    c = a / b;
                    stack.push(String.valueOf(c));
                    break;
                default:
                    stack.push(str);
            }
        }
    }
}

