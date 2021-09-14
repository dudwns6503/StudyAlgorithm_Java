/*
BaekJoon 1463 1로 만들기

다이나믹 프로그래밍의 점화식을 잘 생각해서 만들어 볼 것. 무작정 배수로 나누는 것으로 시작하면 반례가 생길 수 있다.
*/

import java.util.*;

public class P1463 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] D = new int[N+1];

        D[1] = 0;

        for(int i=2; i<=N; i++) {
            // 우선 이전 값에서 +1을 해준 Dp와 2의 배수라면 2로 나눈 것과 3의 배수라면 3으로 나눈 것의 Dp중 최솟값을 D[i]에 넣어준다.
            D[i] = D[i-1] + 1;
            if(i % 2 == 0) D[i] = Math.min(D[i], D[i/2] + 1);
            if(i % 3 == 0) D[i] = Math.min(D[i], D[i/3] + 1);
        }

        System.out.println(D[N]);
        sc.close();
    }
}
