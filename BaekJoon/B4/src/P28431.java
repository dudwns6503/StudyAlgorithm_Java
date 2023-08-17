/*
 * BOJ 28431 양말 짝 맞추기
 *
 * memory : 14188kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P28431 {

    private static boolean[] socks;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        socks = new boolean[10];

        for (int i = 0; i < 5; i++) {
            int sockNumber = Integer.parseInt(br.readLine());

            socks[sockNumber] = !socks[sockNumber];
        }

        solve();
    }

    private static void solve() {
        for (int i = 0; i <= 9; i++) {
            if (socks[i]) {
                System.out.print(i);
                break;
            }
        }
    }
}
