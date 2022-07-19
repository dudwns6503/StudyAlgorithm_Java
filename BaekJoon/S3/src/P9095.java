/*
 * BOJ 9095 1, 2, 3 더하기
 *
 * memory : 14144kb
 * time : 120ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P9095 {

    static FastReader fr = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int[] dp;

    static void preprocess() {

        dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        // 점화식을 찾아서 dp 테이블에 저장하기.
        for(int i=4; i<11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
    }

    static void pro() {
        int T = fr.nextInt();

        for(int test_case=1; test_case<=T; test_case++) {
            int N = fr.nextInt();
            sb.append(dp[N]).append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String[] args) {

        preprocess();
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