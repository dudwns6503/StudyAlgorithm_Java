/*
 * BOJ 11047 동전 0
 */

import java.io.*;
import java.util.*;

public class P11047 {

    /*
     * N : 동전 종류의 수
     * K : 가치의 합
     * coin : 동전의 가치를 저장할 1차원 정수형 배열
     * ans : 필요한 동전 개수의 최솟값
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];

        for(int i=0; i<N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int ans = 0;

        /*
        * K원을 만드는데 필요한 동전 개수의 최솟값
        * K가 0이 되면 반복을 끝낸다.
        */
        while(K!=0) {
            // 동전 배열의 끝부터(큰 지폐부터 만들 수 있는지 -> 최솟값을 만들기 위해서) 시작한다.
            for(int i=N-1; i>=0; i--) {
                // 큰동전으로 나누었을 때 몫이 없다. -> 그 동전으로 K를 만들 수 없다. -> continue
                if(K / coin[i] == 0) continue;

                // K를 동전으로 나누었을 때 나온 몫을 ans에 +한다. 그리고 그 나머지를 K에 저장한다.
                ans += K / coin[i];
                K %= coin[i];
            }
        }

        System.out.print(ans);
    }
}
