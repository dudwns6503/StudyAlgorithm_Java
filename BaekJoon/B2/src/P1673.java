/*
 * BOJ 1673 치킨 쿠폰
 *
 * memory : 14148kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1673 {

    private static int n, k;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String inputString = "";
        while ((inputString = br.readLine()) != null) {
            st = new StringTokenizer(inputString);
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            solve();
        }
    }

    private static void solve() {
        // 처음에 n개를 다먹음 --> eatChicken: n개, 도장도 n개
        int eatChicken = n;
        int stamp = n;
        int coupon = 0;

        // 도장이 k 이상이라면 반복
        while (stamp >= k) {
            // 쿠폰은 도장에서 k를 나눈 값
            coupon += stamp / k;
            // 쿠폰 갯수만큼 치킨을 먹음(여기서 도장이 생김)
            eatChicken += coupon;
            // 도장 = 쿠폰으로 바꾼 후 남은 나머지 도장 + 방금 먹은 치킨으로 만들어진 도장 값을 더함.
            stamp = (stamp % k) + coupon;
            coupon = 0;
        }

        System.out.println(eatChicken);
    }
}
