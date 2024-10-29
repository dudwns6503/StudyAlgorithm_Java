/*
 * BOJ 3085 사탕 게임
 *
 * memory : 14864kb
 * time : 164ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3085 {

    private static boolean[][] visited;
    private static char[][] candies;
    // 상, 하, 좌, 우
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static int n, max;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        max = Integer.MIN_VALUE;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                char c = candies[x][y];

                for (int k = 0; k < 4; k++) {
                    int nx = x + dir[k][0];
                    int ny = y + dir[k][1];

                    if (nx < 0 || ny < 0 || nx >= n || ny >= n)
                        continue;

                    if (visited[nx][ny])
                        continue;

                    char nc = candies[nx][ny];

                    // x좌표(세로)가 바뀌었을 때 영향받는 것은 row
                    checkChangedRow(c, nc, x, y, nx, ny);
                    checkNonChangedRow(c, nc, x, y, nx, ny);
                    checkChangedColumn(c, nc, x, y, nx, ny);
                    checkNonChangedColumn(c, nc, x, y, nx, ny);
                }

                visited[x][y] = true;
            }
        }

        System.out.print(max);
    }


    private static void checkNonChangedRow(char c, char nc, int x, int y, int nx, int ny) {
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            char currentRowChar = candies[x][i];

            if (c == currentRowChar)
                sum++;
            else {
                ans = Math.max(ans, sum);
                sum = 0;
            }
        }

        ans = Math.max(ans, sum);
        sum = 0;

        for (int i = 0; i < n; i++) {
            char nextRowChar = candies[nx][i];

            if (nc == nextRowChar)
                sum++;
            else {
                ans = Math.max(ans, sum);
                sum = 0;
            }
        }

        ans = Math.max(ans, sum);
        max = Math.max(max, ans);
    }

    // 값을 바꿨을 때.
    private static void checkChangedRow(char c, char nc, int x, int y, int nx, int ny) {
        candies[x][y] = nc;
        candies[nx][ny] = c;
        int sum = 0;
        int ans = 0;


        for (int i = 0; i < n; i++) {
            char currentRowChar = candies[x][i];

            if (nc == currentRowChar)
                sum++;
            else {
                ans = Math.max(ans, sum);
                sum = 0;
            }
        }

        ans = Math.max(ans, sum);
        sum = 0;

        for (int i = 0; i < n; i++) {
            char nextRowChar = candies[nx][i];

            if (c == nextRowChar)
                sum++;
            else {
                ans = Math.max(ans, sum);
                sum = 0;
            }
        }

        ans = Math.max(ans, sum);
        max = Math.max(max, ans);

        candies[nx][ny] = nc;
        candies[x][y] = c;
    }

    private static void checkChangedColumn(char c, char nc, int x, int y, int nx, int ny) {
        candies[x][y] = nc;
        candies[nx][ny] = c;
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            char currentColumnChar = candies[i][y];

            if (nc == currentColumnChar)
                sum++;
            else {
                ans = Math.max(ans, sum);
                sum = 0;
            }
        }

        ans = Math.max(ans, sum);
        sum = 0;

        for (int i = 0; i < n; i++) {
            char nextColumnChar = candies[i][ny];

            if (c == nextColumnChar)
                sum++;
            else {
                ans = Math.max(ans, sum);
                sum = 0;
            }
        }

        ans = Math.max(ans, sum);
        max = Math.max(max, ans);
        candies[x][y] = c;
        candies[nx][ny] = nc;
    }

    private static void checkNonChangedColumn(char c, char nc, int x, int y, int nx, int ny) {
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            char currentColumnChar = candies[i][y];

            if (c == currentColumnChar)
                sum++;
            else {
                ans = Math.max(ans, sum);
                sum = 0;
            }
        }

        ans = Math.max(ans, sum);
        sum = 0;

        for (int i = 0; i < n; i++) {
            char nextColumnChar = candies[i][ny];

            if (nc == nextColumnChar)
                sum++;
            else {
                ans = Math.max(ans, sum);
                sum = 0;
            }
        }

        ans = Math.max(ans, sum);
        max = Math.max(max, ans);
    }


    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        candies = new char[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                candies[i][j] = str.charAt(j);
            }
        }

        visited = new boolean[n][n];
    }
}
