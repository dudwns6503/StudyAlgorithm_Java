/*
BaekJoon 1149 RGB 거리

우선 구해야 할 것은 "N개의 집을 빨강(R), 초록(G), 파랑(B)을 이용하여 이웃집과 겹치지 않게 칠하는데 드는 최소 가격" 이다.
문제에서 R,G,B 3가지 색으로 구별하였으므로 3가지 방향으로 나누어 접근하도록 한다.
3가지 방향으로 접근하여 N번째 까지 드는 비용을 각각 구한 뒤, 3개 중 최소 가격을 찾아내는 것이 포인트이다.
*/

import java.util.*;

public class P1149 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // index를 1~1000으로 맞추기 위해서 1001로 설정.
        int[][] price = new int[1001][3];
        int[][] D = new int[1001][3];

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < 3; j++) {
                price[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= N; i++) {
            // 첫 시작을 빨강, 초록, 파랑으로 시작하는 경우를 각각 따로 점화식을 만든다.
            // 현재 집에 칠할 페인트 가격 + 이전 집에서 선택한 페인트(현재 집이 레드라면.. 그린 or 블루)의 가격 중 최솟값을 더한다.
            // 레드, 그린, 블루 순
            D[i][0] = Math.min(D[i - 1][1], D[i - 1][2]) + price[i][0];
            D[i][1] = Math.min(D[i - 1][0], D[i - 1][2]) + price[i][1];
            D[i][2] = Math.min(D[i - 1][0], D[i - 1][1]) + price[i][2];
        }
        // 각각의 점화식 중 가장 낮은 D[N][?] 값을 출력한다.
        System.out.println(Math.min(Math.min(D[N][0], D[N][1]), D[N][2]));
        sc.close();
    }
}
