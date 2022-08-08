/*
 * BOJ 21940 가운데에서 만나기
 *
 * memory : 28068kb
 * time : 400ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P21940 {

    static final int INF = (int) 1e9;
    static ArrayList<Integer> result;
    static int[][] adj;
    static int[] cities;
    static int N, M, K;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new ArrayList<>();
        adj = new int[N+1][N+1];

        for(int i=1; i<=N; i++) {
            Arrays.fill(adj[i], INF);
        }

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                if(i == j) adj[i][j] = 0;
            }
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());

            adj[from][to] = time;
        }

        K = Integer.parseInt(br.readLine());

        cities = new int[K+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=K; i++) {
            cities[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void sol() {
        for(int k=1; k<=N; k++) {
            for(int i=1; i<=N; i++) {
                for(int j=1; j<=N; j++) {
                    adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
                }
            }
        }

        int min = INF;

        for(int to=1; to<=N; to++) {
            int now = 0;
            for(int i=1; i<cities.length; i++) {
                int from = cities[i];
                now = Math.max(now, adj[from][to] + adj[to][from]);
            }

            if(min > now) {
                result.clear();
                result.add(to);
                min = now;
            }
            else if(min == now) {
                result.add(to);
            }
        }

        for(int i=0; i<result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
}
