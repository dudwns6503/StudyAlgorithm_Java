/*
 * BOJ 28074 모비스
 *
 * memory : 14232kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P28074 {

    private static char[] words = {'M', 'O', 'B', 'I', 'S'};
    private static String str;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
    }

    private static void solve() {
        Map<Character, Integer> map = new HashMap<>();
        boolean canMake = true;

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                canMake = false;
                break;
            }
        }

        if (!canMake) System.out.print("NO");
        else System.out.print("YES");
    }
}
