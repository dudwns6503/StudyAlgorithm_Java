/*
 * BOJ 28279 덱 2
 *
 * memory : 252668kb
 * time : 1124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P28279 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Deque<Integer> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int oper = Integer.parseInt(st.nextToken());

            if (oper == 1) {
                int num = Integer.parseInt(st.nextToken());
                deque.addFirst(num);
            } else if (oper == 2) {
                int num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
            } else if (oper == 3) {
                if (deque.isEmpty())
                    sb.append("-1").append("\n");
                else
                    sb.append(deque.pollFirst()).append("\n");
            } else if (oper == 4) {
                if (deque.isEmpty())
                    sb.append("-1").append("\n");
                else
                    sb.append(deque.pollLast()).append("\n");
            } else if (oper == 5) {
                sb.append(deque.size()).append("\n");
            } else if (oper == 6) {
                if (deque.isEmpty())
                    sb.append("1").append("\n");
                else
                    sb.append("0").append("\n");
            } else if (oper == 7) {
                if (deque.isEmpty())
                    sb.append("-1").append("\n");
                else
                    sb.append(deque.peekFirst()).append("\n");
            } else {
                if (deque.isEmpty())
                    sb.append("-1").append("\n");
                else
                    sb.append(deque.peekLast()).append("\n");
            }
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
