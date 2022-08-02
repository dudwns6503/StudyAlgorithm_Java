/*
 * BOJ 21920 서로소 평균
 *
 * memory : 54344kb
 * time : 516ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21920 {

    static int[] A;
    static int N, X;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        A = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        X = Integer.parseInt(br.readLine());
    }

    static void pro() {

        long sum = 0;
        int cnt = 0;

        for(int i=1; i<=N; i++) {
            int gcd = getGCD(A[i], X);
            if(gcd == 1) {
                sum += A[i];
                cnt++;
            }
        }

        System.out.printf("%.6f", (double) sum / cnt);
    }

    static int getGCD(int x, int y) {
        while(y != 0) {
            int temp = x % y;

            x = y;
            y = temp;
        }
        return x;
    }

    public static void main(String[] args) throws Exception {
        input();
        pro();
    }
}
