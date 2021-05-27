/**
 * @author harrison
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length / 2 + 1];
        int current = 0;

        for (String s: tokens) {
            int d;
            switch (s) {
                case "+" -> {
                    int a = stack[current--];
                    int b = stack[current--];
                    d = a + b;
                }
                case "-" -> {
                    int a = stack[current--];
                    int b = stack[current--];
                    d = a - b;
                }
                case "*" -> {
                    int a = stack[current--];
                    int b = stack[current--];
                    d = a * b;
                }
                case "/" -> {
                    int a = stack[current--];
                    int b = stack[current--];
                    d = a / b;
                }
                default -> d = Integer.parseInt(s);
            }
            stack[current++] = d;
        }

        return stack[0];
    }
}
