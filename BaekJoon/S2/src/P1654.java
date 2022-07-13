/*
 * BOJ 1654 나무 자르기
 *
 * memory : 16684kb
 * time : 180ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1654 {

    static int[] Lan;
    static int N, K;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        Lan = new int[K + 1];

        for(int i=1; i<=K; i++) {
            Lan[i] = Integer.parseInt(br.readLine());
        }
    }

    // len만큼의 길이로 잘랐을 때 최소 N개 이상의 랜선을 얻을 수 있는가?
    static boolean determined(long len) {

        long sum = 0;

        for(int i=1; i<=K; i++) {
            sum += Lan[i] / len;
        }

        return sum >= N;
    }

    static void pro() {

        long L = 1;
        long R = Integer.MAX_VALUE;

        long ans = 0;

        while(L <= R) {
            long mid = (L + R) / 2;

            if(determined(mid)) {
                ans = mid;
                L = mid+1;
            }
            else {
                R = mid-1;
            }
        }

        System.out.print(ans);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
