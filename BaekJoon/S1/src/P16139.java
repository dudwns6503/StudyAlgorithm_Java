/*
 * BOJ 16139 인간-컴퓨터 상호작용
 *
 * memory : 102772kb
 * time : 820ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16139 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int[][] alphaCount = new int[s.length()][26];

        alphaCount[0][s.charAt(0) - 'a']++;

        for (int i = 1; i < s.length(); i++) {
            int num = s.charAt(i) - 'a';

            for (int j = 0; j < 26; j++) {
                alphaCount[i][j] = alphaCount[i-1][j];
            }
            alphaCount[i][num]++;
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());

            char alpha = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (start == 0) sb.append(alphaCount[end][alpha - 'a']).append("\n");
            else sb.append(alphaCount[end][alpha - 'a'] - alphaCount[start - 1][alpha - 'a']).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
