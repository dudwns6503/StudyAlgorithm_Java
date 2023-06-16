/*
 * BOJ 1302 베스트셀러
 *
 * memory : 14252kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class P1302 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = -1;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String bookName = br.readLine();

            if (map.containsKey(bookName)) {
                map.put(bookName, map.get(bookName) + 1);
                max = Math.max(map.get(bookName), max);
            } else {
                map.put(bookName, 1);
                max = Math.max(map.get(bookName), max);
            }
        }

        ArrayList<String> arr = new ArrayList<>();

        for (String bookName : map.keySet()) {
            if (map.get(bookName) == max) {
                arr.add(bookName);
            }
        }

        Collections.sort(arr);

        System.out.print(arr.get(0));
    }
}
