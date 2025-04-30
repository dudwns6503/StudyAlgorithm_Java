/*
 * BOJ 17598 Animal King Election
 *
 * memory : 14152kb
 * time : 108ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P17598 {

    private static int lionCount, tigerCount;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        if (lionCount > tigerCount)
            System.out.print("Lion");
        else
            System.out.print("Tiger");
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            String vote = br.readLine();

            if (vote.equals("Lion"))
                lionCount++;
            else
                tigerCount++;
        }
    }
}
