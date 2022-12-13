/*
 * BOJ 1620 나는야 포켓몬 마스터 이다솜
 *
 * memory : 60224kb
 * time : 552ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P1620 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> pocketmonNameFirst = new HashMap<>();
        HashMap<Integer, String> pocketmonNumberFirst = new HashMap<>();

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 1; i <= n; i++) {
            String pocketmonName = br.readLine();
            pocketmonNameFirst.put(pocketmonName, i);
            pocketmonNumberFirst.put(i, pocketmonName);
        }

        for (int i = 0; i < m; i++) {
            String findName = br.readLine();

            if (pocketmonNameFirst.containsKey(findName)) {
                sb.append(pocketmonNameFirst.get(findName)).append("\n");
            } else {
                int key = Integer.parseInt(findName);
                sb.append(pocketmonNumberFirst.get(key)).append("\n");
            }
        }

        System.out.print(sb);
    }
}
