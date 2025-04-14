/*
 * BOJ 2660 회장뽑기
 *
 * memory : 14128kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2660 {

    private static int[][] friends;
    private static ArrayList<Integer> chairmans;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        chairmans = new ArrayList<>();

        floydWarshall();

        int min = Integer.MAX_VALUE;
        int perRowMax = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            perRowMax = Integer.MIN_VALUE;
            for (int j = 1; j <= n; j++) {
                if (perRowMax < friends[i][j] && friends[i][j] != 100_000_000) {
                    perRowMax = friends[i][j];
                }
            }

            if (min > perRowMax) {
                min = perRowMax;
            }
        }

        for (int i = 1; i <= n; i++) {
            perRowMax = Integer.MIN_VALUE;
            for (int j = 1; j <= n; j++) {
                if (perRowMax < friends[i][j] && friends[i][j] != 100_000_000) {
                    perRowMax = friends[i][j];
                }
            }

            if (perRowMax == min) {
                chairmans.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(chairmans.size()).append("\n");
        for (int i = 0; i < chairmans.size(); i++) {
            sb.append(chairmans.get(i)).append(" ");
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static void floydWarshall() {
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j)
                        continue;

                    if (friends[i][j] > friends[i][k] + friends[k][j])
                        friends[i][j] = friends[i][k] + friends[k][j];
                }
            }
        }
    }


    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        friends = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                friends[i][j] = 100_000_000;
            }
        }

        while (true) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == -1 && b == -1)
                break;

            friends[a][b] = 1;
            friends[b][a] = 1;
        }
    }
}
