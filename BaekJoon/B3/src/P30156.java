/*
 * BOJ 30156 Malvika is peculiar about color of balloons
 *
 * memory : 14024kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P30156 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            int num = solve(word);

            if (i == n - 1) System.out.print(num);
            else System.out.println(num);
        }

        br.close();
    }

    private static int solve(String word) {
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') countA++;
            else countB++;
        }

        return Math.min(countA, countB);
    }
}
