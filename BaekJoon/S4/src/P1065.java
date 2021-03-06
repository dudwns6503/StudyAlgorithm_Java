/*
 * BOJ 1065 한수
 *
 * memory : 14280kb
 * time : 124ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P1065 {

    static FastReader fr = new FastReader();

    static int N, ans;

    static void input() {

        N = fr.nextInt();
    }

    static boolean isHansu(int num) {

        if(num < 100) {
            return true;
        }
        else if(num < 1000) {
            int one = num / 100;
            int two = (num % 100) / 10;
            int three = num % 10;

            if(one - two == two - three) {
                return true;
            }
        }
        return false;
    }

    static void pro() {

        for(int i=1; i<=N; i++) {
            if(isHansu(i)) ans++;
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