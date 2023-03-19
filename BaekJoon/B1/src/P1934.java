/*
 * BOJ 1934 최소공배수
 *
 * memory : 14520kb
 * time : 144ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1934 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int ans = solve(Math.max(a, b), Math.min(a, b));
            sb.append(ans).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static int solve(int a, int b) {
        int gcd = get_gcd(a, b);
        return a * b / gcd;
    }

    private static int get_gcd(int a, int b) {
        if (b == 0) return a;
        else return get_gcd(b, a % b);
    }
}
