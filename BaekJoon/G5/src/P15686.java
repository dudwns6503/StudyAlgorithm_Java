/*
 * BOJ 15686 치킨 배달
 *
 * memory : 17528kb
 * time : 248ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P15686 {

    private static ArrayList<Node> chickenHouses;
    private static ArrayList<Node> houses;
    private static int[][] city;
    private static boolean[] visited;
    private static int n, m, min;

    /**
     *  처음에는 BFS를 활용하여 문제를 풀려고 했으나, 너무 변수가 많아져서 복잡해지기도 하고,
     *  생각해보면 더 간단하게 문제를 푸는 방법이 있었다. `백트래킹 + 조합`이다.
     *  치킨집은 M개를 선택한 후에 치킨 거리를 구해야 한다. (중복X, 순서X) => 조합
     */
    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        init();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                city[i][j] = Integer.parseInt(st.nextToken());

                if (city[i][j] == 2) {
                    chickenHouses.add(new Node(i, j));
                } else if (city[i][j] == 1) {
                    houses.add(new Node(i, j));
                }
            }
        }

        visited = new boolean[chickenHouses.size()];
    }

    private static void init() {
        city = new int[n][n];
        chickenHouses = new ArrayList<>();
        houses = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }

    private static void solve() {
        chooseChickenHouse(1, 0);
        System.out.print(min);
    }

    private static void chooseChickenHouse(int k, int idx) {
        if (k == m + 1) {
            // 최소값을 구하라.
            int totalDistance = 0;

            for (int i = 0; i < houses.size(); i++) {
                int sum = Integer.MAX_VALUE;

                for (int j = 0; j < chickenHouses.size(); j++) {
                    if (visited[j]) {
                        int dist = Math.abs(houses.get(i).r - chickenHouses.get(j).r)
                                + Math.abs(houses.get(i).c - chickenHouses.get(j).c);

                        sum = Math.min(sum, dist);
                    }
                }

                totalDistance += sum;
            }

            min = Math.min(min, totalDistance);
            return;
        }

        for (int i = idx; i < chickenHouses.size(); i++) {
            visited[i] = true;
            chooseChickenHouse(k + 1, i + 1);
            visited[i] = false;
        }
    }

    static class Node {
        int r, c;

        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
