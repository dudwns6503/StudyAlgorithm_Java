/*
 * BOJ 9184 신나는 함수 실행
 *
 * memory : 23868kb
 * time : 524ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P9184 {

    static FastReader fr = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int[][][] dp;
    static int a, b, c, ans;

    static void input() {

        dp = new int[21][21][21];

        for(int i=0; i<=20; i++) {
            for(int j=0; j<=20; j++) {
                for(int k=0; k<=20; k++) {
                    if(i == 0 || j == 0 || k == 0) {
                        dp[i][j][k] = 1;
                        continue;
                    }
                    if(i < j && j < k) {
                        dp[i][j][k] = dp[i][j][k-1] + dp[i][j-1][k-1] - dp[i][j-1][k];
                    }
                    else {
                        dp[i][j][k] = dp[i-1][j][k] + dp[i-1][j-1][k] + dp[i-1][j][k-1] - dp[i-1][j-1][k-1];
                    }
                }
            }
        }

        while(true) {
            a = fr.nextInt(); b = fr.nextInt(); c = fr.nextInt();
            if(a == -1 && b == -1 && c == -1) break;

            pro();
        }
    }

    static int rec_func(int a, int b, int c) {

       if(a <= 0 || b <= 0 || c <= 0) return 1;
       else if(a > 20 || b > 20 || c > 20) return dp[20][20][20];
       else {
           return dp[a][b][c];
       }
    }

    static void pro() {

        ans = rec_func(a, b, c);
        sb.append("w(").append(a).append(", ").append(b).append(", ")
                .append(c).append(") = ").append(ans);

        System.out.println(sb);
        sb.setLength(0);
    }

    public static void main(String[] args) {

        input();
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
