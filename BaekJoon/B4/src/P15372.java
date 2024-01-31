/*
 * BOJ 15372 A Simple Problem.
 *
 * memory : 36144kb
 * time : 464ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15372 {

    private static StringBuilder sb = new StringBuilder();
    private static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            solve(n);
        }

        if (sb.length() > 1)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static void solve(int n) {
        long ans = (long) Math.pow(n, 2);
        sb.append(ans).append("\n");
    }
}
