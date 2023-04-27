 /*
  * BOJ 1037 약수
  *
  * memory : 14252kb
  * time : 132ms
  */


 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1037 {

    private static long[] prime;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        prime = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            prime[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        Arrays.sort(prime);

        if (n == 1) {
            System.out.print(prime[0] * prime[0]);
        } else {
            System.out.print(prime[0] * prime[n - 1]);
        }
    }
}
