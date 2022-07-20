/*
 * BOJ 2525 오븐 시계
 *
 * memory : 14168kb
 * time : 128ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P2525 {

    static FastReader fr = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int hour, minute, cookTime;

    static void input() {

        hour = fr.nextInt();
        minute = fr.nextInt();

        cookTime = fr.nextInt();
    }

    static void pro() {

        minute += cookTime;
        while(minute >= 60) {
            minute -= 60;
            hour += 1;

            if(hour >= 24) {
                hour = 0;
            }
        }

        sb.append(hour).append(" ").append(minute);
        System.out.print(sb);
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