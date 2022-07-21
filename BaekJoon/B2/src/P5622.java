/*
 * BOJ 5622 다이얼
 *
 * memory : 14140kb
 * time : 120ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P5622 {

    static FastReader fr = new FastReader();

    static String word;

    static void input() {

        word = fr.next();
    }

    static void pro() {

        int ans = 0;
        char[][] charArray = {{'A','B','C'}, {'D','E','F'}, {'G','H','I'}, {'J', 'K', 'L'},
                {'M', 'N', 'O'}, {'P', 'Q', 'R', 'S'}, {'T','U','V'}, {'W', 'X','Y','Z'}};

        outer: for(int i=0; i<word.length(); i++) {
            char c = word.charAt(i);

            for(int j=0; j<charArray.length; j++) {
                for(int k=0; k<charArray[j].length; k++) {
                    if(charArray[j][k] == c) {
                        ans += j+3;
                        continue outer;
                    }
                }
            }
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
