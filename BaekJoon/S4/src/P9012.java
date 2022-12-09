/*
 * BOJ 9012 괄호
 *
 * memory : 14296kb
 * time : 136ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012 {

    static String[] brackets;

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        brackets = new String[t];

        for (int i = 0; i < t; i++) {
            brackets[i] = br.readLine();
        }
    }

    private static void solve() {
        Stack<Character> stack;
        char[] bracket;
        char current;

        for (int i = 0; i < brackets.length; i++) {
            stack = new Stack<>();
            bracket = brackets[i].toCharArray();

            for (int j = 0; j < bracket.length; j++) {
                current = bracket[j];

                if (current == ')') {
                    if (stack.isEmpty()) {
                        stack.add(current);
                        break;
                    }
                    else if (stack.peek() == '('){
                        stack.pop();
                        continue;
                    }
                }
                stack.add(current);
            }

            if (stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
