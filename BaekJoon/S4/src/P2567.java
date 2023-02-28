/*
 * BOJ 2567 색종이 - 2
 *
 * memory : 14196kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2567 {

    private static int[][] paper;
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        paper = new int[101][101];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }
    }

    private static void solve() {
        int ans = 0;

        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                if (paper[x][y] == 1) {

                    for (int k = 0; k < 4; k++) {
                        int nx = x + dir[k][0];
                        int ny = y + dir[k][1];

                        if (nx >= 1 && nx <= 100 && ny >= 1 && ny <= 100 && paper[nx][ny] == 0) {
                            ans++;
                        } else if (nx < 1 || nx > 100 || ny < 1 || ny > 100) {
                            ans++;
                        }
                    }
                }
            }
        }

        System.out.print(ans);
    }
}
