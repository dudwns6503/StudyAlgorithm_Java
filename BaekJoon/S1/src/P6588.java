/*
 * BOJ 6588 골드바흐의 추측
 *
 * memory : 38448kb
 * time : 632ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P6588 {

    private static StringBuilder sb = new StringBuilder();
    private static boolean[] isPrime;
    private static int num;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void solve() {
        int a = 3;
        while (a <= num / 2) {
            int b = num - a;
            if (isPrime[a] && isPrime[b]) {
                sb.append(num).append(" = ").append(a).append(" + ").append(b);
                sb.append("\n");
                break;
            }

            a++;
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        initPrime();
        while (true) {
            num = Integer.parseInt(br.readLine());

            if (num == 0)
                break;

            solve();
        }

        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '\n') {
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.print(sb);
    }

    private static void initPrime() {
        isPrime = new boolean[1_000_001];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= 1000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1_000_000; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
