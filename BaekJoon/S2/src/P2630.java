/*
 * BOJ 2630 색종이 만들기
 *
 * memory : 15520kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2630 {

    private static int[][] squares;
    private static int whiteCount, blueCount;
    private static final int WHITE = 0;
    private static final int BLUE = 1;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        whiteCount = 0;
        blueCount = 0;
        check(n, 0, 0);

        System.out.println(whiteCount);
        System.out.print(blueCount);
    }

    private static void check(int length, int x, int y) {
        if (length == 0)
            return;

        boolean needCut = false;

        int firstNumber = squares[x][y];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (squares[x + i][y + j] != firstNumber) {
                    needCut = true;
                    break;
                }
            }

            if (needCut)
                break;
        }

        // 잘라야 한다면 재귀적으로 한다.
        if (needCut) {
            check(length / 2, x, y);
            check(length / 2, x + (length / 2), y);
            check(length / 2, x, y + (length / 2));
            check(length / 2, x + (length / 2), y + (length / 2));
        }
        else {
            if (firstNumber == WHITE)
                whiteCount++;
            else
                blueCount++;
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        squares = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                squares[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
