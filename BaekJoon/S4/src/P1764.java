/*
 * BOJ 1764 듣보잡
 *
 * memory : 26324kb
 * time : 288ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class P1764 {

    static HashSet<String> neverHeard = new HashSet<>();
    static TreeSet<String> neverHeardAndSeen = new TreeSet<>();

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String humanName = br.readLine();
            neverHeard.add(humanName);
        }

        for (int i = 0; i < m; i++) {
            String humanName = br.readLine();

            if (neverHeard.contains(humanName)) {
                neverHeardAndSeen.add(humanName);
            }
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        sb.append(neverHeardAndSeen.size()).append("\n");

        for (String humanName : neverHeardAndSeen) {
            sb.append(humanName).append("\n");
        }

        sb.deleteCharAt(sb.length()-1); // 마지막 공백 제거
        System.out.print(sb);
    }
}
