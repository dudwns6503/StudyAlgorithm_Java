/*
 * BOJ 1259 팰린드롬수
 *
 * memory : 14084kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1259 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();
    private static Stack<String> stack;

    public static void main(String[] args) throws Exception {
        while (true) {
            String num = br.readLine();

            if (num.equals("0")) break;

            solve(num);
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void solve(String num) {
        stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            stack.push(String.valueOf(num.charAt(i)));
        }

        String str = "";
        for (int i = 0; i < num.length(); i++) {
            str += stack.pop();
        }

        if (num.equals(str)) {
            sb.append("yes").append("\n");
        } else {
            sb.append("no").append("\n");
        }
    }
}
