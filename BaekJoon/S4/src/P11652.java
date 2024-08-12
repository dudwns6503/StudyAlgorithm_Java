/*
 * BOJ 11652 카드
 *
 * memory : 40636kb
 * time : 356ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class P11652 {

    private static Map<Long, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        ArrayList<Node> arr = new ArrayList<>();

        for (long key :map.keySet()) {
            arr.add(new Node(key, map.get(key)));
        }

        Collections.sort(arr);

        System.out.print(arr.get(0).number);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long number = Long.parseLong(br.readLine());

            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            }
            else {
                map.put(number, 1);
            }
        }
    }

    static class Node implements Comparable<Node> {
        long number;
        int count;

        public Node(long number, int count) {
            this.number = number;
            this.count = count;
        }

        @Override
        public int compareTo(Node o) {
            if (this.count == o.count) {
                return Long.compare(this.number, o.number);
            }

            return o.count - this.count;
        }
    }
}
