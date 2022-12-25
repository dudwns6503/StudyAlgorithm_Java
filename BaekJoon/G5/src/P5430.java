/*
 * BOJ 5430 AC
 *
 * memory : 101920kb
 * time : 744ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class P5430 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList<Integer> deque;
    static String p;
    static int n;

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            input();
            solve();
        }
    }

    private static void input() throws Exception {
        p = br.readLine();
        n = Integer.parseInt(br.readLine());

        deque = new LinkedList<>();

        String array = br.readLine();

        if (array.equals("[]")) return;

        array = array.substring(1, array.length() - 1);
        String[] split = array.split(",");

        for (int i = 0; i < split.length; i++) {
            deque.offer(Integer.parseInt(split[i]));
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        boolean isReverse = false;

        char[] chars = p.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'R') {
                isReverse = !isReverse;
            }
            else {
                if (deque.isEmpty()) {
                    System.out.println("error");
                    return;
                }
                else {
                    if (isReverse) deque.pollLast();
                    else deque.pollFirst();
                }
            }
        }

        if (isReverse) {
            while (!deque.isEmpty()) {
                sb.append(deque.pollLast()).append(",");
            }
        }
        else {
            while (!deque.isEmpty()) {
                sb.append(deque.pollFirst()).append(",");
            }
        }

        if (sb.length() != 1) sb.deleteCharAt(sb.length() - 1);
        sb.append("]").append("\n");
        System.out.print(sb);
    }
}
