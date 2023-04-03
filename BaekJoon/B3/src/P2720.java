/*
 * BOJ 2720 세탁소 사장 동혁
 *
 * memory : 14140kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2720 {

    private static StringBuilder sb = new StringBuilder();
    private static int[] change = {25, 10, 5, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int c = Integer.parseInt(br.readLine());
            solve(c);
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void solve(int c) {
        for (int i = 0; i < change.length; i++) {
            if (c / change[i] != 0) {
                sb.append(c / change[i]).append(" ");
                c %= change[i];
            } else {
                sb.append(0).append(" ");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        sb.append("\n");
    }
}
