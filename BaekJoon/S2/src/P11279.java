/*
 * BOJ 11279 최대 힙
 *
 * memory : 26364kb
 * time : 340ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class P11279 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (pq.isEmpty()) sb.append("0").append("\n");
                else sb.append(pq.poll()).append("\n");
            } else {
                pq.offer(x);
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
