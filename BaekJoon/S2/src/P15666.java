/*
 * BOJ 15666 N과 M (12)
 *
 * memory : 14696kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class P15666 {

    private static StringBuilder sb = new StringBuilder();
    private static Set<Integer> set;
    private static int[] nums;
    private static int[] selected;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    // 중복 조합
    private static void solve() {
        Arrays.sort(nums);

        rec_func(1);

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static void rec_func(int k) {
        if (k == m + 1) {
            for (int i = 1; i < selected.length; i++) {
                sb.append(selected[i]).append(" ");
            }

            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
        }
        else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < selected[k - 1])
                    continue;

                selected[k] = nums[i];
                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        set = new TreeSet<>();
        nums = new int[n + 1];
        selected = new int[m + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        nums = new int[set.size() + 1];
        int index = 1;
        for (int num : set) {
            nums[index++] = num;
        }
    }
}
