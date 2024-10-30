/*
 * BOJ 1535 안녕
 *
 * memory : 14328kb
 * time : 112ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1535 {

    private static Node[] nodes;
    private static int[] L, J;
    private static int n, max;


    // l : 체력, j : 기쁨 최대 1번만 가능.
    // 체력이 0이 되어서는 안됨.
    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        max = Integer.MIN_VALUE;

        nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            Node node = new Node(L[i], J[i]);
            nodes[i] = node;
        }

        rec_func(1, 100, 0, 0);
        System.out.print(max);
    }

    private static void rec_func(int k, int hp, int sumHappiness, int prevHappiness) {
        if (k == n + 1 || hp <= 0) {
            if (hp <= 0)
                max = Math.max(max, prevHappiness);
            else
                max = Math.max(max, sumHappiness);
        }
        else {


            Node node = nodes[k - 1];
            int minusHp = node.hp;
            int happiness = node.happiness;

            rec_func(k + 1, hp - minusHp, sumHappiness + happiness, sumHappiness);
            rec_func(k + 1, hp, sumHappiness, sumHappiness);
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        L = new int[n];
        J = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            L[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            J[i] = Integer.parseInt(st.nextToken());
        }
    }

    static class Node {
        int hp;
        int happiness;

        public Node(int hp, int happiness) {
            this.hp = hp;
            this.happiness = happiness;
        }
    }
}
