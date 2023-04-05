/*
 * BOJ 7785 회사에 있는 사람
 *
 * memory : 44504kb
 * time : 600ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P7785 {

    private static TreeSet<String> set;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        set = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String behavior = st.nextToken();

            if (behavior.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for (String s : set) {
            sb.append(s).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
