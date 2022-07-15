/*
 * BOJ 16472 고냥이
 *
 * memory : 15572kb
 * time : 160ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P16472 {

    static String str;
    static int[] cnt;
    static int N, kind;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        str = br.readLine();

        cnt = new int[26];

    }

    static void add(char x) {
        // x가 추가 되고 현재 cnt가 1이라면 새로운 종류의 알파벳이 추가된 것이다.
        cnt[x - 'a']++;
        if(cnt[x - 'a'] == 1) {
            kind++;
        }
    }

    static void erase(char x) {
        // x가 추가 되고 현재 cnt가 0이라면 한 종류의 알파벳이 없어진 것이다.
        cnt[x - 'a']--;
        if(cnt[x - 'a'] == 0) {
            kind--;
        }
    }

    static void pro() {

        int len = str.length();
        int ans = 0;

        for(int R=0, L=0; R<len; R++) {
            add(str.charAt(R));

            while(kind > N) {
                erase(str.charAt(L));
                L++;
            }

            ans = Math.max(ans, R - L + 1);
        }

        System.out.print(ans);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
