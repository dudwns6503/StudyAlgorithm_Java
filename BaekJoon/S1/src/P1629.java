/*
 * BOJ 1629 곱셈
 *
 * memory : 14152kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1629 {

    private static long a, b, c;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());
    }

    private static void solve() {
        System.out.print(pow(a, b));
    }

    private static long pow(long a, long exponent) {

        // 지수가 1이면 a를 c로 나눈 나머지 리턴
        if (exponent == 1) {
            return a % c;
        }

        // 현재 지수의 절반을 구한다.
        long temp = pow(a, exponent / 2);

        // 현재 지수가 홀 수라면 마지막에 a를 한 번 더 곱해줘야 한다.
        // a^9 = a^4 * a^4 * a
        if (exponent % 2 == 1) {
            return (temp * temp % c) * a % c;
        }

        return temp * temp % c;
    }
}
