/*
 * BOJ 1978 소수 찾기
 *
 * memory : 14144kb
 * time : 140ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978 {

    static int[] arr, prime;
    static int N;
    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[N + 1];
        prime = new int[1001];


        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

    }

    // 에라토스테네스의 체를 이용한 소수 찾기
    static void findDecimal() {
        // 소수가 아니라면 0
        // 0과 1은 소수가 아니므로 0
        prime[0] = prime[1] = 0;

        for(int i=2; i<=1000; i++) {
            prime[i] = i;
        }

        // 소수의 배수는 소수가 아니다.
        for(int i=2; i<1000; i++) {
            if(prime[i] == 0) continue;

            for(int j=2*i; j<=1000; j+=i) {
                prime[j] = 0;
            }
        }
    }

    static void pro() {

        int ans = 0;

        findDecimal();

        for(int i=1; i<=N; i++) {
            if(prime[arr[i]] != 0) {
                ans++;
            }
        }

        System.out.print(ans);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
