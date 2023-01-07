/*
 * BOJ 14889 스타트와 링크
 *
 * memory : 21248kb
 * time : 376ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14889 {

    private static int[][] stats;
    private static boolean[] visited;
    private static int n;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        stats = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                stats[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void solve() {
        combination(0, 0);
        System.out.print(min);
    }

    private static void combination(int idx, int count) {

        if (count == n / 2) {
            calculate();
            return;
        }

        for (int i = idx; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }

    private static void calculate() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (visited[i] && visited[j]) {
                    team_start += stats[i][j];
                    team_start += stats[j][i];
                } else if (!visited[i] && !visited[j]) {
                    team_link += stats[i][j];
                    team_link += stats[j][i];
                }
            }
        }

        int abs = Math.abs(team_start - team_link);

        if (abs == 0) {
            System.out.print(abs);
            System.exit(0);
        }

        min = Math.min(min, abs);
    }
}
