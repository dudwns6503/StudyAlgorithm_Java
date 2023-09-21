/*
 * BOJ 30087 진흥원 세미나
 *
 * memory : 14308kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P30087 {

    private static Map<String, Integer> map;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        initMap();
        for (int i = 0; i < n; i++) {
            String seminar = br.readLine();

            if (seminar.equals("CyberSecurity")) {
                System.out.println("B" + map.get(seminar));
            } else {
                System.out.println(map.get(seminar));
            }
        }
    }

    private static void initMap() {
        map = new HashMap<>();

        map.put("Algorithm", 204);
        map.put("DataAnalysis", 207);
        map.put("ArtificialIntelligence", 302);
        map.put("CyberSecurity", 101);
        map.put("Network", 303);
        map.put("Startup", 501);
        map.put("TestStrategy", 105);
    }
}
