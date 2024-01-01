/*
 * BOJ 16017 Telemarketer or not?
 *
 * memory : 14344kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P16017 {

    private static StringBuilder sb = new StringBuilder();
    private static int[] numbers;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        numbers = new int[4];

        for (int i = 0; i < 4; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        solve();

        if (sb.length() == 0)
            sb.append("answer");

        System.out.print(sb);
    }

    private static void solve() {
        if (numbers[0] == 8 || numbers[0] == 9)
            if (numbers[1] == numbers[2])
                if (numbers[3] == 8 || numbers[3] == 9)
                    sb.append("ignore");
    }
}
