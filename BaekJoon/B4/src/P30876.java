/*
 * BOJ 30876 Tren del Fin del Mundo
 *
 * memory : 16260kb
 * time : 164ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P30876 {

    public static void main(String[] args) throws Exception{
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        List<Node> nodes = new ArrayList<Node>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            nodes.add(new Node(x, y));
        }

        Collections.sort(nodes);
        System.out.print(nodes.get(0).x + " " + nodes.get(0).y);
    }

    static class Node implements Comparable<Node> {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Node other) {
            return this.y - other.y;
        }
    }
}
