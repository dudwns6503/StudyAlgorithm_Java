/*
 * BOJ 9613 GCD 합
 *
 * memory : 14280kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P9613 {

    private static StringBuilder sb = new StringBuilder();
    private static int[] num;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        print();
    }

    private static void solve() {
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += gcd(num[i], num[j]);
            }
        }

        sb.append(sum).append("\n");
    }

    private static int gcd(int a, int b) {
        if (a % b == 0)
            return b;

        return gcd(b, a % b);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());

            num = new int[n];
            for (int j = 0; j < n; j++) {
                num[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(num);
            solve();
        }
    }

    private static void print() {
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
