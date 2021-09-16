/*
BaekJoon 12865 평범한 배낭

전형적인 0-1 Knapsack 문제이다. N개의 물건과 K의 무게를 담을 수 있는 배낭이 있다고 할 때, 최적의 원리로 테이블을 채워야 한다.
i번째 물건이 배낭의 무게 한도보다 무겁다면 넣을 수 없으므로 i번째 물건을 뺀 i-1개의 물건을 가지고 구한 최적 값을 그대로 가져온다.
i번재 물건이 배낭의 무게 한도보다 작거나 같다면 i번째 물건을 위해 i번째 물건만큼의 무게를 비웠을 때의 최적값에 i번째의 물건의 가치를 더한 값
또는 i-1개의 물건을 가지고 구한 최적값 중 큰 것을 선택하는 것이 핵심이다.
최적값을 저장할 D를 2차원 배열로 지정했고, 물건의 무게와 가치를 1차원 배열로 설정하였다.
*/

import java.util.*;

public class P12865 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] weights = new int[N+1];
        int[] values = new int[N+1];

        for(int i=1; i<=N; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }

        int[][] D = new int[N+1][K+1];

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=K; j++) {
                if(weights[i] <= j) {
                    D[i][j] = Math.max(D[i-1][j], values[i] + D[i-1][j-weights[i]]);
                } else {
                    D[i][j] = D[i-1][j];
                }
            }
        }

        System.out.print(D[N][K]);
    }
}
