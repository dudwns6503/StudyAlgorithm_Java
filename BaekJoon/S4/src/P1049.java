/*
 * BOJ 1049 기타줄
 *
 * memory : 14372kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1049 {

    private static int[] packages, each;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        // 낱개는 가장 낮은 가격만 고르기 위해서 정렬
        Arrays.sort(each);
        Arrays.sort(packages);

        int sum = 0;
        while (n > 0) {
            if (n >= 6) {
                if (packages[0] > each[0] * 6) {
                    sum += each[0] * 6;
                }
                else {
                    sum += packages[0];
                }

                n -= 6;
            }
            else {
                if (packages[0] > each[0] * n) {
                    sum += each[0] * n;
                    n = 0;
                }
                else {
                    sum += packages[0];
                    n -= 6;
                }
            }
        }

        System.out.print(sum);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        packages = new int[m];
        each = new int[m];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            packages[i] = Integer.parseInt(st.nextToken());
            each[i] = Integer.parseInt(st.nextToken());
        }
    }
}
