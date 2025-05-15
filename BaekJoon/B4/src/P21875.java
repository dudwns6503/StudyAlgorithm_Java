/*
 * BOJ 21875 Innohorse
 *
 * memory : 16024kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P21875 {

    private static String cell1, cell2;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        char alpha1 = cell1.charAt(0);
        char alpha2 = cell2.charAt(0);

        char num1 = cell1.charAt(1);
        char num2 = cell2.charAt(1);

        int x = Math.min(Math.abs(alpha1 - alpha2), Math.abs(num1 - num2));
        int y = Math.max(Math.abs(alpha1 - alpha2), Math.abs(num1 - num2));

        System.out.print(x + " " + y);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        cell1 = br.readLine();
        cell2 = br.readLine();
    }
}
