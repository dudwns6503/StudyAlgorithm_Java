/*
 * BOJ 11403 경로 찾기
 *
 * memory : 16968kb
 * time : 380ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11403 {

    static int[][] graph;
    static int N;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        graph = new int[N + 1][N + 1];

        for(int i=1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void floyedWarshall() {

        for(int k=1; k<=N; k++) {
            for(int i=1; i<=N; i++) {
                for(int j=1; j<=N; j++) {
                    if(graph[i][k] == 1 && graph[k][j] == 1) {
                        graph[i][j] = 1;
                    }
                }
            }
        }
    }

    static void pro() {

        floyedWarshall();

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
