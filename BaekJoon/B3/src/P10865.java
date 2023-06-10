/*
 * BOJ 10865 친구 친구
 *
 * memory : 257264kb
 * time : 920ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P10865 {

    private static Map<Integer, Integer> map;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        mapInit();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            makeFriend(a, b);
        }

        print();
    }

    private static void mapInit() {
        map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }
    }

    private static void makeFriend(int a, int b) {
        map.put(a, map.get(a) + 1);
        map.put(b, map.get(b) + 1);
    }

    private static void print() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(map.get(i)).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
