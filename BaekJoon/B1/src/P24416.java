/*
 * BOJ 24416 알고리즘 수업 - 피보나치 수 1
 *
 * memory : 14192kb
 * time : 432ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P24416 {

    static FastReader fr = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int[] dp;
    static int n, ans;

    static int fibo(int n) {
        if(n == 1 || n == 2) return 1;
        else return fibo(n-1) + fibo(n-2);
    }

    static int fibonacci(int n) {

        dp = new int[41];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            ans++;
        }

        return ans;
    }

    static void pro() {

        ans = 0;

        sb.append(fibo(n)).append(" ");
        sb.append(fibonacci(n));

        System.out.print(sb);
    }
    public static void main(String[] args) {

        n = fr.nextInt();
        pro();
    }

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
