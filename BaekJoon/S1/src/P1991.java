/*
 * BOJ 1991 트리 순회
 *
 * memory : 14208kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1991 {

    private static int[][] tree;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        tree = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int parent = st.nextToken().charAt(0) - 'A';
            int leftChild = st.nextToken().charAt(0) - 'A';
            int rightChild = st.nextToken().charAt(0) - 'A';

            tree[parent][0] = (leftChild == -19) ? -1 : leftChild;
            tree[parent][1] = (rightChild == -19) ? -1 : rightChild;
        }
    }

    private static void solve() {
        preOrder(0);
        sb.append("\n");

        inOrder(0);
        sb.append("\n");

        postOrder(0);

        System.out.print(sb);
    }

    private static void preOrder(int x) {
        // root -> 왼쪽 자식 -> 오른쪽 자식
        if (x == -1) return;

        sb.append((char)(x + 'A'));
        preOrder(tree[x][0]);
        preOrder(tree[x][1]);
    }

    private static void inOrder(int x) {
        // 왼쪽 자식 -> root -> 오른쪽 자식
        if (x == -1) return;

        inOrder(tree[x][0]);
        sb.append((char) (x + 'A'));
        inOrder(tree[x][1]);
    }

    private static void postOrder(int x) {
        // 왼쪽 자식 -> 오른쪽 자식 -> root
        if (x == -1) return;

        postOrder(tree[x][0]);
        postOrder(tree[x][1]);
        sb.append((char) (x + 'A'));
    }
}
