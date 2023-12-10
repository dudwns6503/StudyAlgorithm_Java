/*
 * BOJ 6764 Sounds fishy!
 *
 * memory : 14060kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6764 {

    private static int first, second, third, fourth;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        first = Integer.parseInt(br.readLine());
        second = Integer.parseInt(br.readLine());
        third = Integer.parseInt(br.readLine());
        fourth = Integer.parseInt(br.readLine());
    }

    private static void solve() {
        if (first > second && second > third && third > fourth) {
            System.out.print("Fish Diving");
        } else if (first < second && second < third && third < fourth) {
            System.out.print("Fish Rising");
        } else if (first == second && second == third && third == fourth) {
            System.out.print("Fish At Constant Depth");
        } else {
            System.out.print("No Fish");
        }
    }
}
