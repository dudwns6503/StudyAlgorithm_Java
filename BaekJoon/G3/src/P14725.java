/*
 * BOJ 14725 개미굴
 *
 * memory : 15960kb
 * time : 148ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P14725 {

    private static StringBuilder sb = new StringBuilder();
    private static Node root;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        // 트리 출력
        dfs(root, 0);
        System.out.print(sb);
    }

    private static void dfs(Node node, int depth) {
        for (String key : node.children.keySet()) {
            for (int i = 0; i < depth; i++) {
                sb.append("--");
            }
            sb.append(key).append("\n");
            dfs(node.children.get(key), depth + 1);
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        root = new Node();
        // 입력 처리 및 트리 구성
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            Node current = root;
            for (int j = 1; j <= k; j++) {
                String key = st.nextToken();
                current.children.putIfAbsent(key, new Node());
                current = current.children.get(key);
            }
        }
    }

    static class Node {
        TreeMap<String, Node> children = new TreeMap<>();
    }
}
