/*
 * BOJ 9020 골드바흐의 추측
 *
 * memory : 19496kb
 * time : 340ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9020 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static boolean[] prime = new boolean[10001];
    static int N, sum, x, y;

    static void findDecimal() {

        prime[0] = prime[1] = false;

        for(int i=2; i<=10000; i++) {
            prime[i] = true;
        }

        for(int i=2; i<=Math.sqrt(10000); i++) {
            if(prime[i] == false) continue;

            for(int j=2*i; j<=10000; j+=i) {

                prime[j] = false;
            }
        }
    }

    static void pro() {

        int a = N / 2;
        int b = N / 2;

        while(true) {

            if(prime[a] && prime[b]) {
                System.out.println(a + " " + b);
                break;
            }

            a--;
            b++;
        }
    }

    public static void main(String[] args) throws Exception {

        int T = Integer.parseInt(br.readLine());

        findDecimal();

        while(T-- > 0) {

            N = Integer.parseInt(br.readLine());
            pro();
        }
    }
}