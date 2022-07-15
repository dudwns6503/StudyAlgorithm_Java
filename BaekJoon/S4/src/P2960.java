/*
 * BOJ 2960 에라토스테네스의 체
 *
 * memory : 14244kb
 * time : 124ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2960 {

    static int[] prime;
    static int N, K, ans;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        prime = new int[N + 1];
    }

    static void pro() {

        ans = 0;
        prime[0] = prime[1] = 0;

        for(int i=2; i<=N; i++) {
            prime[i] = i;
        }

        for(int i=2; i<=N; i++) {
            if(prime[i] == 0) continue;

            else {
                for(int j=i; j<=N; j+=i) {
                    if(prime[j] == 0) continue;
                    prime[j] = 0;
                    ans++;

                    if(ans == K) {
                        System.out.print(j);
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
