/*
 * BOJ 1107 리모컨
 *
 * memory : 63692kb
 * time : 300ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1107 {

    private static boolean[] isBrokenButton;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        isBrokenButton = new boolean[10];

        if (m != 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                int brokenButton = Integer.parseInt(st.nextToken());
                isBrokenButton[brokenButton] = true;
            }
        }
    }

    private static void solve() {
        int targetChannel = n;

        int ans = Math.abs(targetChannel - 100);
        for (int i = 0; i <= 999999; i++) {
            String cur = String.valueOf(i);
            int length = cur.length();

            boolean isBreak = false;
            for (int j = 0; j < length; j++) {
                if (isBrokenButton[cur.charAt(j) - '0']) {
                    isBreak = true;
                    break;
                }
            }

            if (!isBreak) {
                ans = Math.min(ans, Math.abs(targetChannel - i) + length);
            }
        }

        System.out.print(ans);
    }
}
