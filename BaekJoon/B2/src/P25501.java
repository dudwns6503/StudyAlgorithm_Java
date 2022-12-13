/*
 * BOJ 25501 재귀의 귀재
 *
 * memory : 19816kb
 * time : 252ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P25501 {

    static String[] strings;
    static int count;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        strings = new String[t];

        for (int i = 0; i < t; i++) {
            strings[i] = br.readLine();
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            count = 0;
            int recursionNumber = isPalindrome(strings[i]);
            sb.append(recursionNumber).append(" ").append(count).append("\n");
        }
        System.out.print(sb);
    }

    private static int isPalindrome(String str) {
        return recursion(str, 0, str.length() - 1);
    }

    private static int recursion(String str, int l, int r) {
        count++;
        if (l >= r) return 1;
        else if (str.charAt(l) != str.charAt(r)) return 0;
        else return recursion(str, l+1, r-1);
    }
}
