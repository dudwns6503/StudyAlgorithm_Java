/*
 * BOJ 17471 게리맨더링
 *
 * memory : 15660kb
 * time : 156ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P17471 {

    private static ArrayList<Integer>[] nodes;
    private static ArrayList<Integer> listA, listB;
    private static boolean[] selected;
    private static int[] populations;
    private static boolean[] visited;
    private static int n, min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        init();

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            populations[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            int recursive = Integer.parseInt(st.nextToken());

            for (int j = 0; j < recursive; j++) {
                nodes[i].add(Integer.parseInt(st.nextToken()));
            }
        }
    }

    private static void solve() {
        // 선거구를 나눈다.
        divide(1);

        // 만약 min이 초기값을 가지고 있다면 모든 경우에도 선거구를 나눌 수 없음을 의미한다.
        if (min == Integer.MAX_VALUE) {
            System.out.print("-1");
        } else {
            System.out.print(min);
        }
    }

    private static void divide(int cnt) {
        if (cnt == n + 1) {
            // 서로 다른 선거구를 A와 B로 칭한다면..
            listA = new ArrayList<>();
            listB = new ArrayList<>();

            // selected[i] true면 A선거구로, false라면 B선거구로.
            for (int i = 1; i <= n; i++) {
                if (selected[i]) {
                    listA.add(i);
                } else {
                    listB.add(i);
                }
            }

            // 선거구를 나눴을 때 한 선거구가 아예 없는 경우는 생각하지 않는다.
            if (listA.size() == 0 || listB.size() == 0) return;

            /**
             *  선거구를 나눈 후, 선거구 안에 있는 각 구역들이 서로 연결되어 있는지 체크하고
             *  서로 연결되어 있다면 각 구역의 인구수들의 합을 구한 다음 둘의 차를 절댓값으로 취한 후
             *  min과 비교해서 더 작은 값을 min에 저장한다.
             */
            if (isConnect(listA) && isConnect(listB)) {
                int difference = Math.abs(totalPopulation(listA) - totalPopulation(listB));
                min = Math.min(min, difference);
            }
        } else {
            // 중복X, 순서 중요X => 조합
            selected[cnt] = true;
            divide(cnt + 1);
            selected[cnt] = false;
            divide(cnt + 1);
        }
    }

    // 각 선거구의 인구를 구하는 메서드
    private static int totalPopulation(ArrayList<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += populations[list.get(i)];
        }

        return sum;
    }

    // 각 선거구에 있는 구역들이 연결되어있는지 체크 (BFS 활용)
    private static boolean isConnect(ArrayList<Integer> list) {
        Queue<Integer> queue = new LinkedList<>();
        visited = new boolean[n + 1];

        int x = list.get(0);
        queue.offer(x);
        visited[x] = true;
        int cnt = 1;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int i = 0; i < nodes[cur].size(); i++) {
                int y = nodes[cur].get(i);

                if (list.contains(y) && !visited[y]) {
                    queue.offer(y);
                    visited[y] = true;
                    cnt++;
                }
            }
        }

        if (cnt == list.size()) return true;
        else return false;
    }

    private static void init() {
        populations = new int[n + 1];
        nodes = new ArrayList[n + 1];
        selected = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            nodes[i] = new ArrayList<>();
        }
    }
}
