/*
 * BOJ 7595 Triangles
 *
 * memory : 16604kb
 * time : 208ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P7595 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            solve(n);
        }
    }

    private static void solve(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
