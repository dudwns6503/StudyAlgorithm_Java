/*
 * BOJ 30143 Cookie Piles
 *
 * memory : 14008kb
 * time : 92ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30143 {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            solve(n, a, d);
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    // 등차수열의 합 : n * (2a + (n - 1) * d / 2
    private static void solve(int n, int a, int d) {
        sb.append(n * (2 * a + (n - 1) * d) / 2).append("\n");
    }
}
