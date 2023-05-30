/*
 * BOJ 1076 저항
 *
 * memory : 14380kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P1076 {

    private static Map<String, Integer[]> map;
    private static String colorA, colorB, colorC;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        colorA = br.readLine();
        colorB = br.readLine();
        colorC = br.readLine();
    }

    private static void solve() {
        init();

        int plus = map.get(colorA)[0] * 10 + map.get(colorB)[0];
        long ans = (long) plus * map.get(colorC)[1];

        System.out.print(ans);
    }

    private static void init() {
        map = new HashMap<>();

        map.put("black", new Integer[]{0, 1});
        map.put("brown", new Integer[]{1, 10});
        map.put("red", new Integer[]{2, 100});
        map.put("orange", new Integer[]{3, 1000});
        map.put("yellow", new Integer[]{4, 10000});
        map.put("green", new Integer[]{5, 100000});
        map.put("blue", new Integer[]{6, 1000000});
        map.put("violet", new Integer[]{7, 10000000});
        map.put("grey", new Integer[]{8, 100000000});
        map.put("white", new Integer[]{9, 1000000000});
    }
}
