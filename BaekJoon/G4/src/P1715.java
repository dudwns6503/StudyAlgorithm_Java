/*
 * BOJ 1715 카드 정렬하기
 *
 * memory : 24164kb
 * time : 328ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P1715 {

    private static PriorityQueue<Integer> pq;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        pq = new PriorityQueue<>();

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }
    }

    private static void solve() {
        int sum = 0;

        while (pq.size() > 1) {
            int num1 = pq.poll();
            int num2 = pq.poll();

            sum += num1 + num2;
            pq.add(num1 + num2);
        }

        System.out.print(sum);
    }
}
