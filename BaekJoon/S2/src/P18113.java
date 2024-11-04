/*
 * BOJ 18113 그르다 김가놈
 *
 * memory : 97700kb
 * time : 448ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P18113 {

    private static int[] gimbap;
    private static int n, k, m, max;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int l = 1;
        int r = 1_000_000_000;
        max = -1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (determine(mid)) {
                l = mid + 1;
                max = Math.max(max, mid);
            }
            else
                r = mid - 1;
        }

        System.out.print(max);
    }

    private static boolean determine(int mid) {
        long cnt = 0;
        for (int i = 0; i < gimbap.length; i++) {
            cnt += gimbap[i] / mid;
        }

        return cnt >= m;
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 김밥 길이 전처리
        // 1. k 보다 작거나 같다면 폐기
        // 2. 2*k 보다 작다면 한쪽만 자른다.
        // 3. 이외에는 양쪽을 다 자른다.
        ArrayList<Integer> rawGimbap = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int gimbapLength = Integer.parseInt(br.readLine());
            if (gimbapLength <= k)
                continue;
            else if (gimbapLength < 2 * k)
                gimbapLength -= k;
            else
                gimbapLength -= 2 * k;

            rawGimbap.add(gimbapLength);
        }

        gimbap = new int[rawGimbap.size()];
        for (int i = 0; i < gimbap.length; i++) {
            gimbap[i] = rawGimbap.get(i);
        }
    }
}
