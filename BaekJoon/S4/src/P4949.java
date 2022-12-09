/*
 * BOJ 4949 균형잡힌 세상
 *
 * memory : 19392kb
 * time : 216ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;

        while (true) {
            str = br.readLine();

            if (str.equals(".")) break;

            sb.append(solve(str)).append("\n");
        }

        System.out.println(sb);
    }

    private static String solve(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[') stack.push(ch);
            else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
            else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) return "yes";
        else return "no";
    }

}
