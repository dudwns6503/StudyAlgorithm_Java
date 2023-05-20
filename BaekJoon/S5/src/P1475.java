/*
 * BOJ 1475 방 번호
 *
 * memory : 14308kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1475 {

    private static int[] cnt;
    private static String n;
    private static int ans;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = br.readLine();
    }

    private static void solve() {
        cnt = new int[10];
        ans = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);

            if (ch == '6') {
                if (cnt[6] > 0) {
                    cnt[6]--;
                } else if (cnt[9] > 0) {
                    cnt[9]--;
                } else {
                    setPlus();
                    cnt[6]--;
                }
            } else if (ch == '9') {
                if (cnt[9] > 0) {
                    cnt[9]--;
                } else if (cnt[6] > 0) {
                    cnt[6]--;
                } else {
                    setPlus();
                    cnt[9]--;
                }
            } else {
                if (cnt[ch - '0'] != 0) {
                    cnt[ch - '0']--;
                } else {
                    setPlus();
                    cnt[ch - '0']--;
                }
            }
        }

        System.out.print(ans);
    }

    private static void setPlus() {
        ans++;

        for (int i = 0; i < 10; i++) {
            cnt[i]++;
        }
    }
}
