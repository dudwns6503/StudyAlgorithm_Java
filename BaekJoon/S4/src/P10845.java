/*
 * BOJ 10845 큐
 *
 * memory : 19396kb
 * time : 376ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P10845 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int last = -1;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if (order.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                queue.offer(num);
                last = num;
            } else if (order.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.poll());
                }
            } else if (order.equals("size")) {
                System.out.println(queue.size());
            } else if (order.equals("empty")) {
                if (queue.isEmpty()) System.out.println("1");
                else System.out.println("0");
            } else if (order.equals("front")) {
                if (queue.isEmpty()) System.out.println("-1");
                else System.out.println(queue.peek());
            } else if (order.equals("back")) {
                if (queue.isEmpty()) System.out.println("-1");
                else System.out.println(last);
            }
        }
    }
}
