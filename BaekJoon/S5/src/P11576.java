/*
 * BOJ 11576 Base Conversion
 *
 * memory : 14220kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11576 {

    private static int[] nums;
    private static int a, b, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        // A진법 -> 10진법
        int sum = 0;
        int temp = 1;
        for (int i = m - 1; i >= 0; i--) {
            sum += nums[i] * temp;
            temp *= a;
        }

        // 10진법 -> B진법
        ArrayList<Integer> arr = new ArrayList<>();
        while (sum > 0) {
            arr.add(sum % b);
            sum /= b;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = arr.size() - 1; i >= 0; i--) {
            sb.append(arr.get(i)).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());
        nums = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
    }
}
