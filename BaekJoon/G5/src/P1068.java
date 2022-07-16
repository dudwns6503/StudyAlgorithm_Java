/*
 * BOJ 1068 트리
 *
 * memory : 14272kb
 * time : 124ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1068 {

    static ArrayList<Integer>[] graph;
    static int[] leaf;
    static int N, cut, root;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        graph = new ArrayList[N];
        leaf = new int[N];

        for(int i=0; i<N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<N; i++) {
            int parent = Integer.parseInt(st.nextToken());
            if(parent == -1) {
                root = i;
                continue;
            }
            graph[parent].add(i);
        }

        cut = Integer.parseInt(br.readLine());
    }

    static void dfs(int x) {

        // 노드의 child가 없다면 leaf노드이다.
        if(graph[x].isEmpty())
            leaf[x]++;

        // 자식이 있다면 dfs -> 이 후 자식들의 leaf의 합을 현재 leaf에 더해준다.
        for(int y: graph[x]) {
            dfs(y);
            leaf[x] += leaf[y];
        }
    }

    static void pro() {

        // 현재 노드에 지워야할 노드가 있다면 지움.
        for(int i=0; i<N; i++) {
            if(graph[i].contains(cut)) {
                graph[i].remove(graph[i].indexOf(cut));
            }
        }

        // 루트가 지워졌다면 0을 출력 아니라면 root부터 dfs를 시행한다.
        if(root != cut) dfs(root);

        System.out.print(leaf[root]);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
