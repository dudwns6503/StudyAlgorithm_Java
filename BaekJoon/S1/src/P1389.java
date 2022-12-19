/*
 * BOJ 1389 케빈 베이컨의 6단계 법칙
 *
 * memory : 14228kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1389 {

    static ArrayList<Integer>[] friendships;
    static int[] visited;
    static int n, m, count, min, personNumber;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        friendships = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            friendships[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            friendships[a].add(b);
            friendships[b].add(a);
        }
    }

    private static void solve() {
        min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            visited = new int[n + 1];
            count = 0;
            bfs(i);
        }

        System.out.print(personNumber);
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = 1;

        while(!queue.isEmpty()) {
            int x = queue.poll();

            for (int y : friendships[x]) {
                if (visited[y] == 0) {
                    queue.offer(y);
                    visited[y] = visited[x] + 1;
                }
            }
        }

        // 케빈 베이컨의 수 더하기.
        for (int i = 1; i <=n; i++) {
            if (i == start) continue;
            count += (visited[i] - 1);
        }

        // 가장 케빈 베이컨의 수가 작은 사람 찾기. (숫자가 낮은 사람부터 찾을 수 있음.)
        if (min > count) {
            min = count;
            personNumber = start;
        }
    }
}
