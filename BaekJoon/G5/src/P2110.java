/*
 * BOJ 2110 공유기 설치
 *
 * memory : 29004kb
 * time : 312ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2110 {

    static int[] home;
    static int N, C;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        home = new int[N + 1];

        for(int i=1; i<=N; i++) {
            home[i] = Integer.parseInt(br.readLine());
        }

    }

    // C대 이상의 공유기를 설치할 수 있는 거리 중 최대 dist
    static boolean determination(int dist) {

        int cnt = 1;
        int start = home[1];

        for(int i=2; i<=N; i++) {
            if(home[i] >= start + dist) {
                cnt++;
                start = home[i];
            }
        }

        return cnt >= C;

    }

    static void pro() {

        Arrays.sort(home, 1, N+1);

        int L = 1;
        int R = 1000000000;
        int ans = 0;

        while(L <= R) {
            int mid = (L + R) / 2;

            if(determination(mid)) {
                ans = mid;
                L = mid + 1;
            }
            else {
                R = mid - 1;
            }
        }

        System.out.print(ans);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
