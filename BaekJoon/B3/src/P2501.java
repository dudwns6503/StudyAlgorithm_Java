/*
 * BOJ 2501 약수 구하기
 *
 * memory : 14280kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P2501 {

    private static ArrayList<Integer> arr;
    private static int n, k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) arr.add(i);
        }

        Collections.sort(arr);

        if (arr.size() < k) {
            System.out.print("0");
        } else {
            System.out.print(arr.get(k - 1));

        }
    }
}
