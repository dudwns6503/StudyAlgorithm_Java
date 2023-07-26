/*
 * BOJ 27889 특별한 학교 이름
 *
 * memory : 14136kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P27889 {

    private static final Map<String, String> map = new HashMap<>();
    private static String schoolName;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        schoolName = br.readLine();
    }

    private static void solve() {
        map.put("NLCS", "North London Collegiate School");
        map.put("BHA", "Branksome Hall Asia");
        map.put("KIS", "Korea International School");
        map.put("SJA", "St. Johnsbury Academy");

        System.out.print(map.get(schoolName));
    }
}
