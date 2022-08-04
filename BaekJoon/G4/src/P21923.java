/*
 * BOJ 21923 곡예 비행
 *
 * memory : 104788kb
 * time : 712ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P21923 {

    static FastReader fr = new FastReader();

    static long[][] dp_first = new long[1000][1000];
    static long[][] dp_second = new long[1000][1000];
    static int[][] arr;
    static int N, M;

    static void input() {
        N = fr.nextInt();
        M = fr.nextInt();

        arr = new int[N][M];

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                arr[i][j] = fr.nextInt();
            }
        }
    }

    static void pro() {
        dp_first[N-1][0] = arr[N-1][0];

        for(int i=N-2; i>=0; i--) {
            dp_first[i][0] = arr[i][0] + dp_first[i+1][0];
        }
        for(int j=1; j<M; j++) {
            dp_first[N-1][j] = arr[N-1][j] + dp_first[N-1][j-1];
        }

        for(int i=N-2; i>=0; i--) {
            for(int j=1; j<M; j++) {
                dp_first[i][j] = arr[i][j];
                dp_first[i][j] += Math.max(dp_first[i][j-1], dp_first[i+1][j]);
            }
        }

        // 두 번째 DP
        dp_second[N-1][M-1] = arr[N-1][M-1];

        for(int i=N-2; i>=0; i--) {
            dp_second[i][M-1] = arr[i][M-1] + dp_second[i+1][M-1];
        }
        for(int j=M-2; j>=0; j--) {
            dp_second[N-1][j] = arr[N-1][j] + dp_second[N-1][j+1];
        }

        for(int i=N-2; i>=0; i--) {
            for(int j=M-2; j>=0; j--) {
                dp_second[i][j] = arr[i][j];
                dp_second[i][j] += Math.max(dp_second[i][j+1], dp_second[i+1][j]);
            }
        }

        long answer = dp_first[0][0] + dp_second[0][0];
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                answer = Math.max(answer, dp_first[i][j] + dp_second[i][j]);
            }
        }

        System.out.print(answer);
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
