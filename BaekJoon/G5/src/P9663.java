/*
 * BOJ 9663 N-Queen
 *
 * memory : 18116kb
 * time : 10456ms
 */


import java.util.Scanner;

public class P9663 {
    static void input() {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        col = new int[N+1];
    }

    static int N, ans;
    // 열을 저장할 1차원 배열
    static int[] col;

    public static void main(String[] args) {

        input();

        // 1행부터 탐색
        rec_func(1);

        System.out.println(ans);
    }

    static void rec_func(int row) {

        if(row == N+1) {
            ans++;
        }
        else {
            for(int c=1; c<=N; c++) {
                boolean possible = true;
                // row행의 c열에 놓을 수 있다면
                for(int i=1; i<=row-1; i++) {
                    // (i, col[i])
                    if(attackable(row, c, i, col[i])) {
                        possible = false;
                    }
                }

                if(possible) {
                    col[row] = c;
                    rec_func(row+1);
                    col[row] = 0;
                }
            }
        }
    }

    static boolean attackable(int r1, int c1, int r2, int c2) {
        if(c1 == c2) return true;
        // 왼쪽위 대각선
        else if(r1 - c1 == r2 - c2) return true;
        // 오른쪽 위 대각선
        else if(r1 + c1 == r2 + c2) return true;

        return false;
    }
}
