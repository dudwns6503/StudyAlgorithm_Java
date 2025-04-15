/*
 * BOJ 15723 n단 논법
 *
 * memory : 14072kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15723 {

    private static boolean[][] graph;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        graph = new boolean[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                graph[i][j] = false;
            }
        }

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            char[] chars = str.toCharArray();
            graph[chars[0] - 'a'][chars[chars.length - 1] - 'a'] = true;
        }

        int m = Integer.parseInt(br.readLine());

        floydWarshall();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String str = br.readLine();

            char[] chars = str.toCharArray();
            if (graph[chars[0] - 'a'][chars[chars.length - 1] - 'a'])
                sb.append("T").append("\n");
            else
                sb.append("F").append("\n");
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static void floydWarshall() {
        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    if (i == j)
                        continue;

                    if (graph[i][k] && graph[k][j])
                        graph[i][j] = true;
                }
            }
        }
    }
}
