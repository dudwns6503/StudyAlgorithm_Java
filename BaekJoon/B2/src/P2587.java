/*
 * BOJ 2587 대표값2
 *
 * memory : 14264kb
 * time : 124ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2587 {

    public static void main(String[] args) throws IOException {
        inputAndSolve();
    }

    private static void inputAndSolve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        sb.append(sum / 5).append("\n");
        sb.append(arr[2]);

        System.out.print(sb);
    }
}
