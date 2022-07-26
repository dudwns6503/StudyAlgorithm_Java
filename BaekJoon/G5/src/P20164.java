/*
 * BOJ 20164 홀수 홀릭 호석
 *
 * memory : 16292kb
 * time : 164ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P20164 {

    static FastReader fr = new FastReader();

    static int N, ans_min, ans_max;
    static void input() {

        N = fr.nextInt();
    }

    static void pro() {

        ans_min = Integer.MAX_VALUE;
        ans_max = 0;

        dfs(N, get_odd_cnt(N));
        System.out.print(ans_min + " " + ans_max);
    }

    static int get_odd_cnt(int x) {

        int res = 0;

        while(x > 0) {
            int digit = x % 10;
            if(digit % 2 == 1) res++;
            x /= 10;
        }

        return res;
    }

    static void dfs(int x, int total_odd_cnt) {

        if(x <= 9) {
            ans_min = Math.min(ans_min, total_odd_cnt);
            ans_max = Math.max(ans_max, total_odd_cnt);
            return;
        }

        if(x <= 99) {
            int next_x = (x / 10) + (x % 10);
            dfs(next_x, total_odd_cnt + get_odd_cnt(next_x));
        }

        String s = Integer.toString(x);
        for(int i=0; i<=s.length()-3; i++) {
            for(int j=i+1; j<=s.length()-2; j++) {
                String x1 = s.substring(0, i + 1);
                String x2 = s.substring(i+1, j+1);
                String x3 = s.substring(j+1);

                int next_x = Integer.parseInt(x1) + Integer.parseInt(x2) + Integer.parseInt(x3);
                dfs(next_x, total_odd_cnt + get_odd_cnt(next_x));
            }
        }

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
