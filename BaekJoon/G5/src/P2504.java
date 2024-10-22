/*
 * BOJ 2504 괄호의 값
 *
 * memory : 14328kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P2504 {

    private static String str;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        Stack<Character> stack = new Stack<>();

        int ans = 0;
        int temp = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                stack.push(c);
                temp *= 2;
            } else if (c == '[') {
                stack.push(c);
                temp *= 3;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    ans = 0;
                    break;
                }

                if (str.charAt(i - 1) == '(') {
                    ans += temp;
                }

                stack.pop();
                temp /= 2;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    ans = 0;
                    break;
                }

                if (str.charAt(i - 1) == '[') {
                    ans += temp;
                }
                stack.pop();
                temp /= 3;
            }
        }

        if (!stack.isEmpty()) {
            ans = 0;
        }

        System.out.print(ans);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
    }
}
