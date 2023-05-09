 /*
  * BOJ 10817 세 수
  *
  * memory : 14288kb
  * time : 128ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10817 {

    private static int[] nums;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        nums = new int[3];

        nums[0] = Integer.parseInt(st.nextToken());
        nums[1] = Integer.parseInt(st.nextToken());
        nums[2] = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        Arrays.sort(nums);
        System.out.print(nums[1]);
    }
}
