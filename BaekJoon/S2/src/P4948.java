/*
 * BOJ 4948 베르트랑 공준
 *
 * memory : 15492kb
 * time : 180ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4948 {

    static final int LEN = 2*123456;
    static int[] prime;
    static int n;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        prime = new int[LEN + 1];

        findDecimal();

        n = Integer.parseInt(st.nextToken());

        // 각 테이스케이스마다 pro를 실행
        while(n != 0) {
            pro();
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
        }

    }

    // 에라토스테네스의 체로 소수 구하기
    static void findDecimal() {

        prime[0] = prime[1] = 1;

        for(int i=2; i<=LEN; i++) {
            prime[i] = i;
        }

        for(int i=2; i<LEN; i++) {
            if(prime[i] == 0) continue;

            for(int j=2*i; j<=LEN; j+=i) {
                prime[j] = 0;
            }
        }
    }

    static void pro() {
        int ans = 0;
        for(int i=n+1; i<=2*n; i++) {
            if(prime[i] != 0) ans++;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) throws Exception {

        input();
    }
}
