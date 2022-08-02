/*
 * BOJ 21919 소수 최소 공배수
 *
 * memory : 15844kb
 * time : 220ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21919 {

    static long[] A;
    static int[] prime;
    static int N;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        A = new long[N+1];
        prime = new int[1000001];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
    }

    static void pro() {
        long ans = 1;
        for(int i=1; i<=N; i++) {

            if(isPrimeNumber(A[i])) {
                ans = lcm(ans, A[i]);
            }
        }

        if(ans == 1) System.out.print(-1);
        else System.out.print(ans);
    }

    static boolean isPrimeNumber(long a) {
        for(int i=2; i<=Math.sqrt(a); i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long gcd(long x, long y) {
        while(y != 0) {
            long temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    static long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }

    public static void main(String[] args) throws Exception {
        input();
        pro();
    }
}
