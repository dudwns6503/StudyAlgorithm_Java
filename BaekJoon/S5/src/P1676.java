/*
 * BOJ 1676 팩토리얼 0의 개수
 *
 * memory : 14576kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P1676 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }

    private static void solve() {
        BigInteger[] bigIntegers = new BigInteger[n + 1];

        bigIntegers[0] = new BigInteger("1");

        if (n >= 2) {
            bigIntegers[1] = new BigInteger("1");
        }

        for (int i = 2; i <= n; i++) {
            bigIntegers[i] = bigIntegers[i - 1].multiply(BigInteger.valueOf(i));
        }

        String str = String.valueOf(bigIntegers[n]);

        int ans = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                ans++;
            } else {
                break;
            }
        }

        System.out.print(ans);
    }
}
