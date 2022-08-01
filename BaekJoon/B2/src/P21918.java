/*
 * BOJ 21918 전구
 *
 * memory : 15844kb
 * time : 220ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21918 {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int[] bulb;
    static int N, M;

    static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        bulb = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
            bulb[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() throws Exception {
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 1) methodOne(b, c);
            else if(a == 2) methodTwo(b, c);
            else if(a == 3) methodThree(b, c);
            else methodFour(b, c);
        }

        for(int i=1; i<=N; i++) {
            sb.append(bulb[i]).append(" ");
        }

        System.out.print(sb);
    }

    static void methodOne(int i, int x) {
        bulb[i] = x;
    }

    static void methodTwo(int l, int r) {
        for(int i=l; i<=r; i++) {
            if(bulb[i] == 0) bulb[i] = 1;
            else bulb[i] = 0;
        }
    }

    static void methodThree(int l, int r) {
        for(int i=l; i<=r; i++) {
            bulb[i] = 0;
        }
    }

    static void methodFour(int l, int r) {
        for(int i=l; i<=r; i++) {
            bulb[i] = 1;
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        pro();
    }
}
