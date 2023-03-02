/*
 * BOJ 9506 약수들의 합
 *
 * memory : 14100kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9506 {

    private static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            n = Integer.parseInt(br.readLine());

            if (n == -1) break;

            solve();
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        sb.append(n);
        sb.append(" = ");

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
                sb.append(i).append(" + ");
            }
        }

        if (sum == n) {
            sb.delete(sb.length() - 3, sb.length());
        } else {
            sb = new StringBuilder();
            sb.append(n).append(" ").append("is NOT perfect.");
        }

        System.out.println(sb);
    }
}
