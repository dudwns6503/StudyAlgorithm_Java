/*
 * BOJ 22856 트리 순회
 *
 * memory : 44828kb
 * time : 400ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P22856 {

   static int[][] tree;
    static int N, ans;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        tree = new int[N+1][2];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            tree[a][0] = b;
            tree[a][1] = c;
        }

    }

    static void sol() {
        ans = 2 * (N - 1); // 모든 간선의 수
        int now = 1;

        while(true) {
            // 가장 우측 하단 노드에 도달했다면 종료
            if(tree[now][1] == -1) break;
            now = tree[now][1];
            ans--;
        }
        System.out.println(ans);
    }


    public static void main(String[] args) throws Exception {
        input();
        sol();
    }
}
