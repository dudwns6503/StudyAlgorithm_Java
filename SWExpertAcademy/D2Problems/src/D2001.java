/*
SW Expert Academy 문제 2001 파리 퇴치
*/

import java.util.Scanner;

/*
 * 정사각형의 왼쪽 위를 기준으로 작성하였으며, 그렇다면 길이가 늘어나는 방향은 오른쪽과 아래쪽임.
 *
 */
public class D2001 {
    static int T, N, M;
    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            M = sc.nextInt();
            map = new int[N][N];

            int answer = 0;
            int width = M - 1; // 사각형이 늘어나는 범위는 왼쪽좌표 기준으로 M-1(M이 3이면 길이는 2까지 늘어날 수 있다.)이다.
            int x = 0; int y = 0; // 사각형의 시작 좌표(왼쪽 위)
            int maxValue = Integer.MIN_VALUE;
            int sum = 0;

            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            // x의 모든 범위를 탐색하면서 x + 사각형의 늘어난 길이가 전체 배열의 길이를 넘었을 때 반복문을 탈출한다.
            for(x=0; x < N; x++) {
                if(x + width >= N) break;
                for(y=0; y < N; y++) {
                    if(y + width >= N) break;
                    for(int i=0; i < M; i++) {
                        for(int j=0; j < M; j++)
                            sum += map[x+i][y+j];
                    }
                    maxValue = Math.max(sum, maxValue);  // 대소 비교해서 최댓값을 계속 저장하고, 사각형을 이동하면 sum 값을 초기화한다.
                    sum = 0;
                }
            }

            answer = maxValue;
            System.out.println("#" + test_case + " " + answer);
        }
    }
}