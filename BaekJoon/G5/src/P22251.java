/*
 * BOJ 22251 빌런 호석
 *
 * memory : 14680kb
 * time : 236ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P22251 {

    static FastReader fr = new FastReader();

    static int[][] num_flag = {
            {1, 1, 1, 0, 1, 1, 1},
            {0, 0, 1, 0, 0, 1, 0},
            {1, 0, 1, 1, 1, 0, 1},
            {1, 0, 1, 1, 0, 1, 1},
            {0, 1, 1, 1, 0, 1, 0},
            {1, 1, 0, 1, 0, 1, 1},
            {1, 1, 0, 1, 1, 1, 1},
            {1, 0, 1, 0, 0, 1, 0},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 1, 1}
    };

    /**
     * @params
     * N: 1~N층
     * K: K자리의 수
     * P: 반전시킬 수 있는 LED의 수
     * X: 현재 엘리베이터 층
     */
    static int N, K, P, X;

    static void input() {

        N = fr.nextInt();
        K = fr.nextInt();
        P = fr.nextInt();
        X = fr.nextInt();
    }

    // 숫자 x와 숫자 y의 LED 차이 개수
    static int diff_one(int x, int y) {
        int res = 0;

        for(int i=0; i<=6; i++) {
            if(num_flag[x][i] != num_flag[y][i]) res++;
        }

        return res;
    }

    // 수 x와 수 y의 LED 차이 개수
    static int diff(int x, int y) {
        int res = 0;

        for(int i=1; i<=K; i++) {
            res += diff_one(x % 10, y % 10);
            x /= 10;
            y /= 10;
        }
        return res;
    }

    static void pro() {
        int ans = 0;

        for(int Y=1; Y<=N; Y++) {
            if(X == Y) continue;
            if(diff(X, Y) <= P) ans++;
        }

        System.out.print(ans);
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
