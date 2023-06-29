/*
 * BOJ 11282 한글
 *
 * memory : 14280kb
 * time : 124ms
 */


import java.io.*;

public class P11282 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }

    private static void solve() throws IOException {
        int cnt = 0;
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 21; j++) {
                for (int k = 0; k < 28; k++) {
                    if (++cnt == n) {
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                        bw.write(((i) * 21 + j) * 28 + k + 0xAC00);
                        bw.flush();
                        bw.close();
                        return;
                    }
                }
            }
        }
    }
}
