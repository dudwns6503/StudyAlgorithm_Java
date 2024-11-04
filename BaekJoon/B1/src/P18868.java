/*
 * BOJ 18868 멀티버스 Ⅰ
 *
 * memory : 14776kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P18868 {

    private static int[][] planets;
    private static int m, n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int count = 0;

        // 모든 행성 비교
        boolean isEqual = true;
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                isEqual = true;
                // 모든 (x, y) 비교
                for (int x = 0; x < n - 1; x++) {
                    for (int y = x + 1; y < n; y++) {
                        if (!(planets[i][x] > planets[i][y] && planets[j][x] > planets[j][y]) &&
                            !(planets[i][x] < planets[i][y] && planets[j][x] < planets[j][y]) &&
                            !(planets[i][x] == planets[i][y] && planets[j][x] == planets[j][y])) {
                            isEqual = false;
                            break;
                        }
                    }

                    if (!isEqual)
                        break;
                }

                if (isEqual)
                    count++;
            }
        }

        System.out.print(count);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        planets = new int[m][n];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                planets[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
