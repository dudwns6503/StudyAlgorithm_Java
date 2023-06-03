/*
 * BOJ 14935 FA
 *
 * memory : 14180kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P14935 {

    private static Set<Integer> set;
    private static String x;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = br.readLine();
    }

    private static void solve() {
        set = new HashSet<>();

        int first = x.charAt(0) - '0';
        int length = x.length();

        int num = first * length;
        set.add(num);

        while (true) {
            if (set.contains(num)) {
                break;
            } else {
                String strNum = String.valueOf(num);
                first = strNum.charAt(0) - '0';
                length = strNum.length();

                num = first * length;
                set.add(num);
            }
        }

        System.out.print("FA");
    }
}
