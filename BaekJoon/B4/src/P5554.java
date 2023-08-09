/*
 * BOJ 5554 심부름 가는 길
 *
 * memory : 14180kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5554 {

    private static int secondA, secondB, secondC, secondD;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        secondA = Integer.parseInt(br.readLine());
        secondB = Integer.parseInt(br.readLine());
        secondC = Integer.parseInt(br.readLine());
        secondD = Integer.parseInt(br.readLine());

        solve();
    }

    private static void solve() {
        int total = secondA + secondB + secondC + secondD;

        System.out.println(total / 60);
        System.out.print(total % 60);
    }
}
