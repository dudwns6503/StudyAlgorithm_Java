/*
 * BOJ 28249 Chili Peppers
 *
 * memory : 14120kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P28249 {

    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        init();
        input();
    }

    private static void init() {
        map.put("Poblano", 1500);
        map.put("Mirasol", 6000);
        map.put("Serrano", 15500);
        map.put("Cayenne", 40000);
        map.put("Thai", 75000);
        map.put("Habanero", 125000);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += map.get(br.readLine());
        }

        System.out.print(sum);
    }
}
