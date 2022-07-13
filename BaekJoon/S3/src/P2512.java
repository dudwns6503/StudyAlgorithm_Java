/*
 * BOJ 2512 예산
 *
 * memory : 15692kb
 * time : 200ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2512 {

    static int[] local_budgets;
    static int N, national_budget;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        local_budgets = new int[N + 1];

        for(int i=1; i<=N; i++) {
            local_budgets[i] = Integer.parseInt(st.nextToken());
        }

        national_budget = Integer.parseInt(br.readLine());
    }

    static boolean determination(int maxLine) {

        int money = 0;
        for(int i=1; i<=N; i++) {
            // 1. 상한선보다 지역예산이 작다면 지역예산을 합에 넣음.
            if(local_budgets[i] <= maxLine) money += local_budgets[i];
            // 2. 상한선보다 지역예산이 크다면 상한선을 합에 넣음.
            else {
                money += maxLine;
            }
        }

        return money <= national_budget;
    }

    static void pro() {

        Arrays.sort(local_budgets, 1, N+1);

        int sum = 0;
        int L = 1;
        int R = 1000000000;
        int ans = 0;

        for(int local_budget : local_budgets) {
            sum += local_budget;
        }

        // 1. 지방예산의 합들이 국가예산의 합보다 작거나 같다면 예산의 최댓값을 출력 (오름차순이므로 마지막 값)
        if(sum <= national_budget) {
            ans = local_budgets[local_budgets.length - 1];
            System.out.print(ans);
        }

        // 2. 지방예산의 합들이 크다면 최대한의 예산을 쓸수 있도록 찾아야함.
        else {
            while(L <= R) {
                int mid = (L + R) / 2;

                // 지방예산의 총합 중 국가예산의 합을 넘지 않는 상한선 최댓값 구하기
                if(determination(mid)) {
                    ans = mid;
                    L = mid+1;
                }
                else {
                    R = mid-1;
                }
            }

            System.out.print(ans);
        }
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
