/*
 * BOJ 11401 이항계수3
 *
 * 페르마의 소정리의 개념을 이해해야 풀 수 있느 문제
 */

import java.util.*;

public class P11401 {

    static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        long a = factorial(N);
        long b = factorial(K) * factorial(N-K) % MOD;

        long answer = (a * pow(b, MOD-2) % MOD);

        System.out.print(answer);
    }

    public static long factorial(long n) {
        long res = 1L;

        while(n>1) {
            res = (res * n) % MOD;
            n--;
        }

        return res;
    }

    // 분할정복
    public static long pow(long a, long b) {
        if(b == 1) return a % MOD;

        long tmp = pow(a, b/2);

        // 지수가 홀수라면 a를 한번 더 곱해줘야한다.
        if(b%2 == 1) {
            return (tmp * tmp % MOD) * a % MOD;
        }

        return tmp * tmp % MOD;
    }
}