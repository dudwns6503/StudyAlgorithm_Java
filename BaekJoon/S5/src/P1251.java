/*
 * BOJ 1251 단어 나누기
 *
 * memory : 17100kb
 * time : 160ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P1251 {

    private static ArrayList<String> arr = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();
    private static String str;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int j = 0;
        int k = 0;

        for (j = 1; j < str.length(); j++) {
            for (k = 1; k < str.length(); k++) {
                if (j >= k)
                    continue;

                String word1 = str.substring(0, j);
                String word2 = str.substring(j, k);
                String word3 = str.substring(k);

                rotate(word1, word2, word3);
            }
        }

        Collections.sort(arr);
        System.out.println(arr.get(0));
    }

    private static void rotate(String word1, String word2, String word3) {
        sb.append(word1);
        sb.reverse();
        word1 = sb.toString();
        sb.delete(0, sb.length());
        sb.append(word2);
        sb.reverse();
        word2 = sb.toString();
        sb.delete(0, sb.length());
        sb.append(word3);
        sb.reverse();
        word3 = sb.toString();
        sb.delete(0, sb.length());
        sb.append(word1 + word2 + word3);
        arr.add(sb.toString());
        sb.delete(0, sb.length());
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
    }
}
