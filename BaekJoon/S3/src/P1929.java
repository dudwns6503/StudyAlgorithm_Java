/*
 * BOJ 1929 소수 구하기
 *
 * memory : 23424kb
 * time : 240ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1929 {

    static StringBuilder sb = new StringBuilder();

    static int[] prime;
    static int N, M;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        prime = new int[1000001];
    }

    // 에라토스테네스의 체로 소수 구하기
    static void findDecimal() {

        prime[0] = prime[1] = 0;

        for(int i=2; i<=1000000; i++) {
            prime[i] = i;
        }

        for(int i=2; i<1000000; i++) {
            if(prime[i] == 0) continue;

            // 소수의 배수는 소수가 아니므로 0
            for(int j=2*i; j<=1000000; j+=i) {
                prime[j] = 0;
            }
        }
    }

    static void pro() {

        findDecimal();

        // M부터 N까지 숫자 중 소수면 출력
        for(int i=M; i<=N; i++) {
            if(prime[i] != 0) sb.append(i).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
