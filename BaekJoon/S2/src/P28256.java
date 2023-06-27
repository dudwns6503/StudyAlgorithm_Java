/*
 * BOJ 28256 초콜릿 보관함
 *
 * memory : 14384kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P28256 {

    private static String[] board;
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static int[][] newBoard;
    private static int[] a;
    private static int max;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            board = new String[3];
            // newBoard의 최댓값을 저장할 변수
            max = -1;

            for (int i = 0; i < 3; i++) {
                board[i] = br.readLine();
            }

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            sb.append(solve()).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static int solve() {
        boolean[][] visited = new boolean[3][3];
        newBoard = new int[3][3];

        // newBoard의 나눠진 부분을 count 값으로 구분해줌.
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!visited[i][j] && board[i].charAt(j) == 'O') {
                    dfs(i, j, visited, ++count);
                }
            }
        }

        max = count;

        if(check()) {
            return 1;
        } else {
            return 0;
        }
    }

    private static void dfs(int x, int y, boolean[][] visited, int count) {
        visited[x][y] = true;
        newBoard[x][y] = count;

        for (int k = 0; k < 4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if (nx < 0 || nx >= 3 || ny < 0 || ny >= 3) continue;
            if (visited[nx][ny]) continue;
            if (board[nx].charAt(ny) == 'O') dfs(nx, ny, visited, count);
        }
    }

    private static boolean check() {
        int[] checkArray = new int[max + 1];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 1; k <= max; k++) {
                    if (newBoard[i][j] == k) {
                        checkArray[k]++;
                        break;
                    }
                }
            }
        }

        Arrays.sort(checkArray);
        return Arrays.equals(a, checkArray);
    }
}
