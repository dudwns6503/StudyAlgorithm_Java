/*
 * BOJ 1264 모음의 개수
 *
 * memory : 14092kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1264 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String t;

    public static void main(String[] args) throws Exception {
        while (true) {
            t = br.readLine();
            if (t.equals("#")) break;

            solve();
            System.out.println();
        }
    }

    private static void solve() {
        int count = 0;

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }

        System.out.print(count);
    }
}
