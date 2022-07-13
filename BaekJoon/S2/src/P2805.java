/*
 * BOJ 2805 나무 자르기
 *
 * memory : 119368kb
 * time : 600ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2805 {

    static int[] trees;
    static int N, M;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        trees = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }
    }

    // 절단기의 높이가 H일 때 M 이상의 나무를 가져갈 수 있는가?
    static boolean determination(int H) {

        // 잘린 나무들의 합이 커서 Integer.Max_VALUE를 넘을 수도 있다. 따라서 long으로 설정
        long sum = 0;
        for(int i=1; i<=N; i++) {
            // 절단기로 자른 트리가 0보다 크다면
            if(trees[i] - H > 0) {
                // 잘린 나무의 합에 더해줌.
                sum += trees[i] - H;
            }
        }

        return sum >= M;
    }

    static void pro() {

        // 적어도 M 미터의 나무를 구할 수 있는 절단기의 최대 높이를 구하는 과정.
        int L = 0;
        int R = 2000000000;

        int ans = 0;

        while(L <= R) {
            int mid = (L + R) / 2;

            // 현재 절단기의 높이에서 나무를 구할 수 있다면 이보다 작은 절단기의 높이는 필요없음.
            if(determination(mid)) {
                ans = mid;
                L = mid + 1;
            }

            // 현재 절단기의 높이에서 나무를 구할 수 없다면 절단기의 높이를 낮춰야함.
            else {
                R = mid - 1;
            }

        }

        System.out.print(ans);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
