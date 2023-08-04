/*
 * BOJ 11945 뜨거운 붕어빵
 *
 * memory : 14168kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11945 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            solve(str);
        }
    }

    private static void solve(String word) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(word).reverse());
    }
}
