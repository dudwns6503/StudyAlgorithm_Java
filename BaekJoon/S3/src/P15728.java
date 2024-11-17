/*
 * BOJ 15728 에리 - 카드
 *
 * memory : 14940kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P15728 {

    private static Node[] sum;
    private static int[] share, team;
    private static int n, k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[index++] = new Node(team[j], share[i] * team[j]);
            }
        }

        Arrays.sort(sum);

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n * n; i++) {
            if (set.size() == k && !set.contains(sum[i].team)) {
                System.out.print(sum[i].sum);
                break;
            } else {
                set.add(sum[i].team);
            }
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        share = new int[n];
        team = new int[n];
        sum = new Node[n * n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            share[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            team[i] = Integer.parseInt(st.nextToken());
        }
    }

    static class Node implements Comparable<Node> {
        int team, sum;

        public Node(int team, int sum) {
            this.team = team;
            this.sum = sum;
        }

        @Override
        public int compareTo(Node o) {
            return o.sum - this.sum;
        }
    }
}
