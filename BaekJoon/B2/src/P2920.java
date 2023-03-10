/*
 * BOJ 2920 음계
 *
 * memory : 14212kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2920 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean isAscending = true;
        boolean isDescending = true;
        int[] arr = new int[8];
        int[] compare = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            compare[i] = arr[i];
        }

        Arrays.sort(compare);

        for (int i = 0; i < 8; i++) {
            if (arr[i] != compare[i]) {
                isAscending = false;
                break;
            }
        }

        for (int i = 7; i >= 0; i--) {
            if (arr[7 - i] != compare[i]) {
                isDescending = false;
                break;
            }
        }

        if (isAscending) System.out.print("ascending");
        else if (isDescending) System.out.print("descending");
        else System.out.print("mixed");
    }
}
