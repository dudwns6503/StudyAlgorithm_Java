/*
 * BOJ 5014 스타트링크
 *
 * memory : 98604kb
 * time : 280ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P5014 {

    static boolean visited[];
    static int[] count;
    static int f, s, g, u, d;
    static final int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        f = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        visited = new boolean[f+1];
        count = new int[f+1];
        Arrays.fill(count, MAX);
    }

    private static void solve() {
        count[s] = 0;
        bfs(s);

        if (count[g] == MAX) System.out.print("use the stairs");
        else System.out.print(count[g]);
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        while (!queue.isEmpty()) {
            int x = queue.poll();

            if (visited[x]) continue;

            visited[x] = true;

            int y = x + u;
            if (y <= f) {
                queue.offer(y);
                count[y] = Math.min(count[y], count[x] + 1);
            }

            y = x - d;
            if (y >= 1) {
                queue.offer(y);
                count[y] = Math.min(count[y], count[x] + 1);
            }
        }
    }
}
