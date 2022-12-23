/*
 * BOJ 10866 덱
 *
 * memory : 18668kb
 * time : 196ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P10866 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dequeue = new ArrayDeque<>();

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            if (order.equals("push_back") || order.equals("push_front")) {
                int num = Integer.parseInt(st.nextToken());

                if (order.equals("push_front")) {
                    dequeue.addFirst(num);
                }
                else {
                    dequeue.addLast(num);
                }
            }
            else if (order.equals("pop_front")) {
                if (dequeue.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else {
                    sb.append(dequeue.pollFirst()).append("\n");
                }
            }
            else if (order.equals("pop_back")) {
                if (dequeue.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else {
                    sb.append(dequeue.pollLast()).append("\n");
                }
            }
            else if (order.equals("size")) {
                sb.append(dequeue.size()).append("\n");
            }
            else if (order.equals("empty")) {
                if (dequeue.isEmpty()) {
                    sb.append("1").append("\n");
                }
                else {
                    sb.append("0").append("\n");
                }
            }
            else if (order.equals("front")) {
                if (dequeue.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else {
                    sb.append(dequeue.peekFirst()).append("\n");
                }
            }
            else if (order.equals("back")) {
                if (dequeue.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else {
                    sb.append(dequeue.peekLast()).append("\n");
                }
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
