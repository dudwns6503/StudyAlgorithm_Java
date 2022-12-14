/*
 * BOJ 2644 촌수계산
 *
 * memory : 14312kb
 * time : 116ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2644 {

    static ArrayList<Integer>[] relationships;
    static boolean[] visited;
    static int[] count;
    static int a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        relationships = new ArrayList[n+1];
        visited = new boolean[n+1];
        count = new int[n+1];

        for (int i = 1; i <= n; i++) {
            relationships[i] = new ArrayList<>();
        }

        String[] input = br.readLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());

            relationships[parent].add(child);
            relationships[child].add(parent);
        }

    }

    private static void solve() {
        bfs(a);

        if (!visited[b]) {
            System.out.print("-1");
        }
        else System.out.print(count[b]);
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int i = 0; i < relationships[x].size(); i++) {
                int y = relationships[x].get(i);

                if (visited[y]) continue;
                count[y] = count[x] + 1;
                queue.offer(y);
                visited[y] = true;
            }
        }
    }
}
