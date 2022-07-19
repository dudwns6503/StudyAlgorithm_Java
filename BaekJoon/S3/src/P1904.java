/*
 * BOJ 1904 01타일
 *
 * memory : 18112kb
 * time : 140ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P1904 {

    static FastReader fr = new FastReader();

    static int[] dp;
    static int N;

    static void input() {

        N = fr.nextInt();

        dp = new int[N+1];
    }

    static void pro() {

        dp[1] = 1;
        if(N > 1) dp[2] = 2;

        for(int i=3; i<=N; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }

        System.out.print(dp[N]);
    }

    public static void main(String[] args) {

        input();
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
