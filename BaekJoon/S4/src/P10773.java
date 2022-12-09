/*
 * BOJ 10773 제로
 *
 * memory : 28808kb
 * time : 292ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P10773 {

    public static void main(String[] args) throws IOException {
        inputAndSolve();
    }

    private static void inputAndSolve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int n = 0;

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());

            if (n == 0) stack.pop();
            else stack.push(n);
        }

        n = 0;

        while (!stack.isEmpty()) {
            n += stack.pop();
        }

        System.out.print(n);
    }
}
