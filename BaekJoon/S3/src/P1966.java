/*
 * BOJ 1966 프린터 큐
 *
 * memory : 14820kb
 * time : 156ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P1966 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Queue<Node> queue;
    static ArrayList<Integer> importance_desc;
    static int n, m;

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            input();
            sb.append(solve()).append("\n");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
    }

    private static void input() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        importance_desc = new ArrayList<>();
        queue = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            importance_desc.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < n; i++) {
            queue.add(new Node(i, importance_desc.get(i)));
        }

        Collections.sort(importance_desc, Collections.reverseOrder());
    }

    private static int solve() {
        int count = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            int start_index = node.start_index;
            int now_importance = node.importance;
            int max = importance_desc.get(0);

            if (now_importance == max) {
                importance_desc.remove(0);
                count++;

                if (start_index == m) return count;
            }
            else {
                queue.offer(node);
            }
        }

        return 0;
    }

    static class Node {
        int start_index, importance;

        public Node(int start_index, int importance) {
            this.start_index = start_index;
            this.importance = importance;
        }
    }
}
