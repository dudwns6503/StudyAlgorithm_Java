/*
 * BOJ 2578 빙고
 *
 * memory : 16252kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2578 {

    private static int[][] bingo;
    private static int cnt;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void solve(int number, int ans) {
        eraseNumber(number);
        drawLine();

        if (cnt >= 3) {
            System.out.print(ans);
            System.exit(0);
        }
    }

    private static void drawLine() {
        boolean isBingo = false;
        // 행
        cnt = 0;
        for (int i = 0; i < 5; i++) {
            isBingo = true;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] != 0) {
                    isBingo = false;
                    break;
                }
            }

            if (isBingo)
                cnt++;
        }

        // 열
        for (int i = 0; i < 5; i++) {
            isBingo = true;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] != 0) {
                    isBingo = false;
                    break;
                }
            }

            if (isBingo)
                cnt++;
        }

        // 대각선 (왼쪽 위에서 왼쪽 아래)
        isBingo = true;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] != 0) {
                isBingo = false;
                break;
            }
        }

        if (isBingo)
            cnt++;

        // 대각선 검사 (오른쪽 위에서 왼쪽 아래)
        isBingo = true;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i] != 0) {
                isBingo = false;
                break;
            }
        }

        if (isBingo)
            cnt++;
    }

    private static void eraseNumber(int number) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == number) {
                    bingo[i][j] = 0;
                    return;
                }
            }
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        bingo = new int[5][5];
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        for (int i = 1; i <= 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {
                ++count;
                solve(Integer.parseInt(st.nextToken()), count);
            }
        }
    }
}
