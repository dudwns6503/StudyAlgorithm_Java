/*
 * BOJ 15000 CAPS
 *
 * memory : 20968kb
 * time : 312ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15000 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        solve(word);
    }

    private static void solve(String word) {
        System.out.print(word.toUpperCase());
    }
}
