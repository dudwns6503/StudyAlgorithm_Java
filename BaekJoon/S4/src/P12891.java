/*
 * BOJ 12891 DNA 비밀번호
 *
 * memory : 21296kb
 * time : 348ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891 {

    private static int[] rules, myRules;
    private static String strings;
    private static int s, p, checkSecret, ans;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        s = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        strings = st.nextToken();

        rules = new int[4];
        myRules = new int[4];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            rules[i] = Integer.parseInt(st.nextToken());
            if (rules[i] == 0) checkSecret++;
        }
    }

    private static void solve() {
        for (int i = 0; i < p; i++) {
            check(strings.charAt(i));
        }

        if (checkSecret == 4) ans++;

        for (int i = p; i < s; i++) {
            int j = i - p;
            check(strings.charAt(i));
            checkPrevious(strings.charAt(j));
            if (checkSecret == 4) ans++;
        }

        System.out.print(ans);
    }

    private static void check(char ch) {
        if (ch == 'A') {
            myRules[0]++;
            if (myRules[0] == rules[0]) checkSecret++;
        } else if (ch == 'C') {
            myRules[1]++;
            if (myRules[1] == rules[1]) checkSecret++;
        } else if (ch == 'G') {
            myRules[2]++;
            if (myRules[2] == rules[2]) checkSecret++;
        } else if (ch == 'T'){
            myRules[3]++;
            if (myRules[3] == rules[3]) checkSecret++;
        }
    }

    private static void checkPrevious(char ch) {
        if (ch == 'A') {
            if (myRules[0] == rules[0]) checkSecret--;
            myRules[0]--;
        } else if (ch == 'C') {
            if (myRules[1] == rules[1]) checkSecret--;
            myRules[1]--;
        } else if (ch == 'G') {
            if (myRules[2] == rules[2]) checkSecret--;
            myRules[2]--;
        } else if (ch == 'T'){
            if (myRules[3] == rules[3]) checkSecret--;
            myRules[3]--;
        }
    }
}
