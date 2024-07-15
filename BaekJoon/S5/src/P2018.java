/*
 * BOJ 2018 수들의 합 5
 *
 * memory : 14236kb
 * time : 164ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2018 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int ans = 0;

        if (n == 1) {
            System.out.print("1");
        }
        else {
            int l = 1;
            int r = 2;

            int sum = l + r;
            while (r <= n) {
                if (sum == n) {
                    ans++;
                    r++;
                    sum += r;
                } else if (sum > n) {
                    sum -= l;
                    l++;
                } else {
                    r++;
                    sum += r;
                }
            }

            System.out.print(ans);
        }
    }
}
