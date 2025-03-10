/*
 * BOJ 11286 절댓값 힙
 *
 * memory : 31448kb
 * time : 344ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class P11286 {

    private static StringBuilder sb = new StringBuilder();
    private static PriorityQueue<Integer> pq;
    private static HashMap<Integer, Integer> map;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
    
    private static void print() {
        if (pq.size() == 0) {
            sb.append(0).append("\n");
        }
        else {
            int min = pq.peek();
            int negative = (-1) * min;
            // 음수가 Map에 있다면
            if (map.containsKey(negative) && map.get(negative) > 0) {
                sb.append(negative).append("\n");
                map.put(negative, map.get(negative) - 1);
            }
            else {
                sb.append(min).append("\n");
                map.put(min, map.get(min) - 1);
            }

            pq.poll();
        }
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        pq = new PriorityQueue<>();
        map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                print();
            }
            else {
                // 원본을 집어 넣음
                map.put(num, map.getOrDefault(num, 0) + 1);
                // 양수로 집어 넣음
                pq.offer(Math.abs(num));
            }
        }
    }
}
