/*
 * BOJ 28235 코드마스터 2023
 *
 * memory : 14060kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P28235 {

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
        Map<String, String> map = new HashMap<>();

        map.put("SONGDO", "HIGHSCHOOL");
        map.put("CODE", "MASTER");
        map.put("2023", "0611");
        map.put("ALGORITHM", "CONTEST");

        System.out.print(map.get(str));
    }
}
