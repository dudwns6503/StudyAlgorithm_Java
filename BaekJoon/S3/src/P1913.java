/*
 * BOJ 1913 달팽이
 *
 * memory : 112668kb
 * time : 592ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1913 {

    private static int[][] map;
    private static int n, k, cnt;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int startRow = n / 2;
        int startCol = n / 2;

        map[startRow][startCol] = 1;
        cnt = 1;
        // 위로 가는 조건 : 오른쪽으로 갈 수 없고 위로 더 갈 수 있다면 진행
        // 오른쪽으로 가는 조건 : 아래로 갈 수 없고 오른쪽으로 갈 수 있다면 진행
        // 아래로 가는 조건 : 왼쪽으로 갈 수 없고 아래로 갈 수 있다면 진행
        // 왼쪽으로 가는 조건 : 위로 갈 수 없고 왼쪽으로 갈 수 있다면 진행
        if (startRow - 1 >= 0)
            up(startRow - 1, startCol);

        StringBuilder sb = new StringBuilder();
        int findX = 0;
        int findY = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == k) {
                    findX = i + 1;
                    findY = j + 1;
                }
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }

        sb.append(findX).append(" ").append(findY);
        System.out.print(sb);
    }

    private static void up(int row, int col) {
        if (cnt == n * n)
            return;

        map[row][col] = ++cnt;

        // 오른쪽으로 진행할 수 있다면
        if (col + 1 < n && map[row][col + 1] == 0) {
            right(row, col + 1);
        }
        else
            up(row - 1, col);
    }

    private static void right(int row, int col) {
        if (cnt == n * n)
            return;

        map[row][col] = ++cnt;

        // 아래로 진행할 수 있다면
        if (row + 1 < n && map[row + 1][col] == 0) {
            down(row + 1, col);
        }
        else
            right(row, col + 1);
    }

    private static void down(int row, int col) {
        if (cnt == n * n)
            return;

        map[row][col] = ++cnt;

        // 왼쪽으로 진행할 수 있다면
        if (col - 1 >= 0 && map[row][col - 1] == 0) {
            left(row, col - 1);
        }
        else
            down(row + 1, col);
    }

    private static void left(int row, int col) {
        if (cnt == n * n)
            return;

        map[row][col] = ++cnt;

        // 위로 진행할 수 있다면
        if (row - 1 >= 0 && map[row - 1][col] == 0) {
            up(row - 1, col);
        }
        else
            left(row, col - 1);
    }


    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        map = new int[n][n];
    }
}
