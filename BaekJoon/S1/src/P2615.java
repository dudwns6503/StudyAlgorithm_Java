/*
 * BOJ 2615 오목
 *
 * memory : 14212kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2615 {

    private static StringBuilder sb = new StringBuilder();
    private static int[][] dir = {{0, 1}, {1, 0}, {1, 1}, {-1, 1}};
    private static int[][] board;

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    /**
     * 문제를 읽었을 때 바둑판의 좌표가 1부터 시작하므로, 배열의 크기를 실제 크기보다 + 1로 지정함.
     * 0 : 놓이지 않은 자리
     * 1 : 검은 바둑알
     * 2 : 흰 바둑알
     */
    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        board = new int[19][19];

        for (int i = 0; i < 19; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 19; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int j = 0; j < 19; j++) {
            for (int i = 0; i < 19; i++) {
                if (board[i][j] == 1 || board[i][j] == 2) {
                    for (int k = 0; k < 4; k++) {
                        int nx = i;
                        int ny = j;
                        int cnt = 1;

                        while (true) {
                            nx += dir[k][0];
                            ny += dir[k][1];

                            if (nx >= 0 && nx < 19 && ny >= 0 && ny < 19) {
                                if (board[i][j] == board[nx][ny]) cnt++;
                                else break;
                            } else break;
                        }

                        nx = i;
                        ny = j;

                        while (true) {
                            nx -= dir[k][0];
                            ny -= dir[k][1];

                            if (nx >= 0 && nx < 19 && ny >= 0 && ny < 19) {
                                if (board[i][j] == board[nx][ny]) cnt++;
                                else break;
                            } else break;
                        }

                        if (cnt == 5) {
                            sb.append(board[i][j]).append("\n");
                            sb.append(i+1).append(" ").append(j+1);
                            System.out.print(sb);
                            return;
                        }
                    }
                }
            }
        }

        System.out.print(0);
    }
}
