/*
 * BOJ 28282 운명
 *
 * memory : 37184kb
 * time : 452ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P28282 {

    private static int[] socks;
    private static int x, k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        socks = new int[2 * x + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 2 * x; i++) {
            socks[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        // 왼쪽 양말의 번호와 개수
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= k; i++) {
            map.put(i, 0);
        }

        for (int i = 1; i <= x; i++) {
            map.put(socks[i], map.get(socks[i]) + 1);
        }

        long cnt = (long) x * x;

        for (int i = x + 1; i <= 2 * x; i++) {
            int rightSockNumber = socks[i];

            // 현재 오른쪽 양말 번호와 같은 번호인 왼쪽 양말의 개수
            int sameCnt = map.get(rightSockNumber);

            cnt -= sameCnt;
        }

        System.out.print(cnt);
    }
}
