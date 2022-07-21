/*
 * BOJ 2908 상수
 *
 * memory : 14272kb
 * time : 124ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P2908 {

    static FastReader fr = new FastReader();

    static String a, b;
    static void input() {

        a = fr.next();
        b = fr.next();
    }

    static void pro() {
        String str1 = "";
        String str2 = "";

        for(int i=a.length()-1; i>=0; i--) {
            char c = a.charAt(i);
            str1 += Character.toString(c);
        }

        for(int i=b.length()-1; i>=0; i--) {
            char c = b.charAt(i);
            str2 += Character.toString(c);
        }

        int answer1 = Integer.parseInt(str1);
        int answer2 = Integer.parseInt(str2);

        if(answer1 > answer2) System.out.print(answer1);
        else System.out.print(answer2);
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
