/*
 * BOJ 18111 마인크래프트
 *
 * memory : 34508kb
 * time : 636ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P18111 {

    private static int[][] ground;
    private static int n, m, b, maxHeight, minHeight;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        // 최소 시간, 땅 높이 출력 => 최소 시간 여러개라면 땅 높이 높은 것 출력
        int time = Integer.MAX_VALUE;
        int height = Integer.MIN_VALUE;

        for (int k = minHeight; k <= maxHeight; k++) {
            int needBlockCount = 0;
            int currentTime = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // 블록을 쌓아야 하는 경우
                    if (ground[i][j] < k) {
                        int blockCount = k - ground[i][j];
                        currentTime += blockCount;
                        needBlockCount += blockCount;
                    } else if (ground[i][j] > k) {
                        int blockCount = ground[i][j] - k;
                        currentTime += 2 * blockCount;
                        needBlockCount -= blockCount;
                    }
                }
            }

            // 가능한 경우
            if (b >= needBlockCount) {
                if (time >= currentTime) {
                    time = currentTime;
                    height = Math.max(height, k);
                }
            }
        }

        System.out.print(time + " " + height);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        ground = new int[n][m];
        minHeight = 257;
        maxHeight = -1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());

                if (minHeight > ground[i][j])
                    minHeight = ground[i][j];

                if (maxHeight < ground[i][j])
                    maxHeight = ground[i][j];
            }
        }
    }
}
