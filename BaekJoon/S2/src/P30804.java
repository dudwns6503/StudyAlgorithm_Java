/*
 * BOJ 30804 과일 탕후루
 *
 * memory : 30336kb
 * time : 292ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30804 {

    private static int[] nums, count;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        int kind = 0;
        int ans = 0;

        if (n == 1) {
            ans = 1;
        }
        else {
            kind = 1;
            count[nums[0]]++;
            ans = 0;

            for (int i = 0, j = 1; j < n; j++) {
                if (count[nums[j]]++ == 0) {
                    kind++;
                }

                while (kind > 2) {
                    if (--count[nums[i]] == 0)
                        kind--;

                    i++;
                }

                if (kind <= 2)
                    ans = Math.max(ans, j - i + 1);
            }
        }

        System.out.print(ans);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        count = new int[10];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
    }
}
