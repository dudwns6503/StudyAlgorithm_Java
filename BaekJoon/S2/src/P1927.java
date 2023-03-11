/*
 * BOJ 1927 최소 힙
 *
 * memory : 26360kb
 * time : 324ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P1927 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (pq.isEmpty()) {
                    sb.append("0").append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                pq.offer(x);
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
