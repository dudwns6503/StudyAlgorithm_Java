/*
 * BOJ 2476 주사위 게임
 *
 * memory : 14740kb
 * time : 144ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2476 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] total = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];

            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);

            int money = 0;
            if (arr[0] == arr[1] && arr[1] == arr[2]) {
                money = 10000 + arr[0] * 1000;
            } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
                money = 1000 + arr[1] * 100;
            } else {
                money = arr[2] * 100;
            }

            total[i] = money;
        }

        Arrays.sort(total);
        System.out.print(total[n - 1]);
    }
}
