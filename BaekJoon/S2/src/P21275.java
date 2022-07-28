/*
 * BOJ 21275 폰 호석만
 *
 * memory : 14208kb
 * time : 124ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P21275 {

    static FastReader fr = new FastReader();

    static long MAX = Long.MAX_VALUE;
    static String x1, x2;

    static void input() {

        x1 = fr.next();
        x2 = fr.next();
    }

    // 10진법으로 바꿔주는 함수
    static int conv(char x) {
        if('0' <= x && x <= '9') return x - '0';
        return x - 'a' + 10;
    }

    // str을 base진법으로 변환 가능하면 결과를, 불가능하면 -1를 리턴.
    static long possible(String str, int base) {
        long res = 0;

        for(char c : str.toCharArray()) {
            if(conv(c) >= base) return -1;

            if(res > (MAX - conv(c)) / base) return -1;
            res = res * base + conv(c);
        }
        return res;
    }

    static void pro() {
        long ansVal = -1, ansA = 0, ansB = 0;

        for(int A=2; A<=36; A++) {
            long valA = possible(x1, A);
            if(valA == -1) continue;

            for(int B=2; B<=36; B++) {
                if(A == B) continue;
                long valB = possible(x2, B);
                if(valB == -1) continue;

                if(valA != valB) continue;

                if(ansVal == -1) {
                    ansVal = valA;
                    ansA = A;
                    ansB = B;
                }
                else {
                    System.out.print("Multiple");
                    return;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if(ansVal == -1) sb.append("Impossible");
        else sb.append(ansVal).append(' ').append(ansA).append(' ').append(ansB);
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
