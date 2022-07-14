/*
 * BOJ 2470 두 용액
 *
 * memory : 28052kb
 * time : 368ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2470 {
    static StringBuilder sb = new StringBuilder();

    static int[] fluid;
    static int N;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        fluid = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=1; i<=N; i++) {
            fluid[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {

        Arrays.sort(fluid, 1, N+1);

        int L = 1;
        int R = N;
        int sum = Integer.MAX_VALUE;
        int f1 = 0;
        int f2 = 0;

        while(L < R) {
            // 두 용액의 절댓값이 sum보다 작으면 가장 0에 근접하므로 용액을 변수에 저장하고
            if(Math.abs(fluid[L] + fluid[R]) < sum) {
                sum = Math.abs(fluid[L] + fluid[R]);

                f1 = fluid[L];
                f2 = fluid[R];

                // 두 용액의 합이 0보다 작으면 최솟값을 증가
                // 0보다 크면 최댓값을 감소시킨다.
                if (fluid[L] + fluid[R] < 0) L++;
                else R--;
            }
            // 두 용액의 합이 sum보다 클 때,
            else {
                // 두 용액의 합이 0보다 작으면 최솟값을 증가
                // 0보다 크면 최댓값을 감소시킨다.
                if (fluid[L] + fluid[R] < 0) L++;
                else R--;
            }
        }

        sb.append(f1).append(" ").append(f2);
        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
