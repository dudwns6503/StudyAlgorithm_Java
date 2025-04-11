/*
 * BOJ 1972 놀라운 문자열
 *
 * memory : 16944kb
 * time : 160ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P1972 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void solve(String str) {
        Set<String> set = new HashSet<>();

        int cnt = 0;
        int l = 0;

        for (int d = 1; d < str.length() - 1; d++) {
            set.clear();
            cnt = 0;
            l = 0;
            for (int r = l + d; r < str.length(); r++) {
                set.add(String.valueOf(str.charAt(l)) + str.charAt(r));
                cnt++;
                l++;
            }

            if (cnt != set.size()) {
                System.out.println(str + " is NOT surprising.");
                return;
            }
        }

        System.out.println(str + " is surprising.");
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals("*"))
                break;

            solve(str);
        }
    }
}
