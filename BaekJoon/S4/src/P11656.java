/*
 * BOJ 11656 접미사 배열
 *
 * memory : 17716kb
 * time : 160ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11656 {

    private static String s;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        String[] arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            String subStr = s.substring(i);
            arr[i] = subStr;
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append("\n");
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine();
    }
}
