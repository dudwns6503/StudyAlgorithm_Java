/*
 * BOJ 11948 과목선택
 *
 * memory : 14316kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11948 {

    private static int[] sciences, societies;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        sciences = new int[4];
        societies = new int[2];

        sciences[0] = Integer.parseInt(br.readLine());
        sciences[1] = Integer.parseInt(br.readLine());
        sciences[2] = Integer.parseInt(br.readLine());
        sciences[3] = Integer.parseInt(br.readLine());
        societies[0] = Integer.parseInt(br.readLine());
        societies[1] = Integer.parseInt(br.readLine());

        solve();
    }

    private static void solve() {
        Arrays.sort(sciences);
        Arrays.sort(societies);

        int sum = sciences[3] + sciences[2] + sciences[1] + societies[1];
        System.out.print(sum);
    }
}
