/*
 * BOJ 21921 블로그
 *
 * memory : 35136kb
 * time : 396ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21921 {

    static int[] day;
    static int N, X;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        day = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
            day[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {

        int sum = 0;

        for (int i=1; i<=N; i++) {
            if (i <= X) sum += day[i];
        }

        int max_sum = sum;
        int count = 1;

        int left = 1;
        int right = X;

        while(true) {
            left++;
            right++;

            if (right > N) break;

            sum = sum + day[right] - day[left - 1];

            if (max_sum == sum) {
                count++;
            } else if (max_sum < sum) {
                max_sum = sum;
                count = 1;
            }
        }

        if (max_sum == 0) System.out.print("SAD");
        else {
            System.out.println(max_sum);
            System.out.print(count);
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        pro();
    }
}
