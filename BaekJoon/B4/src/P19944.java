/*
 * BOJ 19944 뉴비의 기준은 뭘까?
 *
 * memory : 14232kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P19944 {

    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void solve() {
        if (m == 1 || m == 2) System.out.print("NEWBIE!");
        else if (m <= n) System.out.print("OLDBIE!");
        else System.out.print("TLE!");
    }
}
