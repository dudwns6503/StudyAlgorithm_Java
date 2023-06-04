/*
 * BOJ 9935 문자열 폭발
 *
 * memory : 62248kb
 * time : 596ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9935 {

    private static String str, bomb;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        bomb = br.readLine();
    }

    private static void solve() {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));

            if (stack.size() >= bomb.length()) {
                boolean isTrue = true;

                for (int j = 0; j < bomb.length(); j++) {
                    if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
                        isTrue = false;
                        break;
                    }
                }

                if (isTrue) {
                    for (int j = 0; j < bomb.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }

        if (stack.size() == 0) {
            System.out.print("FRULA");
        } else {
            StringBuilder sb = new StringBuilder();

            for (Character ch : stack) {
                sb.append(ch);
            }

            System.out.print(sb);
        }
    }
}
