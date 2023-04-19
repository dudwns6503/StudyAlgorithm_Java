/*
 * BOJ 27961 고양이는 많을수록 좋다
 *
 * memory : 14288kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27961 {

    private static long n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Long.parseLong(br.readLine());
    }

    private static void solve() {
        long k = 0;
        int cnt = 0;

        while (true) {
            // 고양이가 정확히 N마리가 있다면 종료.
            if (n == k) break;

            // 고양이가 집에 아예 없고 N이 0이 아니라면 생성마법 실행하고 횟수 1 증가.
            if (k == 0) {
                k++;
                cnt++;
                continue;
            }

            /*
                (if)   N이 현재 고양이 수(k)의 2배한 것(복제 마법의 최대)보다 크지 않다면
                       현재 고양이 수를 N으로 설정하고 횟수 1 증가시킴.
                (else) N이 현재 고양이 수(k)의 2배한 것보다 크다면 현재 고양이 수를 k만큼 늘리고
                       횟수를 1 증가시킴.
            */
            if (n <= 2 * k) {
                k = n;
                cnt++;
            } else {
                k += k;
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}
