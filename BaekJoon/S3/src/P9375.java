/*
 * BOJ 9375 패션왕 신해빈
 *
 * memory : 14164kb
 * time : 108ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P9375 {

    private static Map<String, Integer> maps;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
    }
    
    private static void solve() {
        int combinations = 1;
        for (int value : maps.values()) {
            combinations *= (value + 1);
        }

        System.out.println(combinations - 1);
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            maps = new HashMap<>();
            n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                String name = st.nextToken();
                String type = st.nextToken();

                maps.put(type, maps.getOrDefault(type, 0) + 1);
            }

            solve();
        }
    }
}
