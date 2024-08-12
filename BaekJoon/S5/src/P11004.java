/*
 * BOJ 11004 K번째 수
 *
 * memory : 377660kb
 * time : 2012ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11004 {

    private static int[] numbers;
    private static int k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        Arrays.sort(numbers);

        System.out.print(numbers[k - 1]);
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        numbers = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
    }
}
