/*
 * BOJ 25305 커트라인
 *
 * memory : 14332kb
 * time : 136ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P25305 {

    public static void main(String[] args) throws IOException {
        inputAndSolve();
    }

    private static void inputAndSolve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] records = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            records[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(records, Collections.reverseOrder());

        System.out.print(records[k-1]);
    }
}
