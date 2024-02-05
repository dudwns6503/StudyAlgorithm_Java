/*
 * BOJ 31090 2023은 무엇이 특별할까?
 *
 * memory : 15844kb
 * time : 164ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31090 {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            solve(n);
        }

        if (sb.length() > 1)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static void solve(int year) {
        if ((year + 1) % (year % 100) == 0)
            sb.append("Good").append("\n");
        else
            sb.append("Bye").append("\n");
    }
}
