/*
 * BOJ 1269 대칭 차집합
 *
 * memory : 80600kb
 * time : 764ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P1269 {

    static Set<Integer> aSet = new HashSet<>();
    static Set<Integer> bSet = new HashSet<>();

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(st.nextToken());
            aSet.add(num);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int num = Integer.parseInt(st.nextToken());
            bSet.add(num);
        }
    }

    private static void solve() {
        int count = 0;

        for (Integer number : aSet) {
            if (!bSet.contains(number)) count++;
        }

        for (Integer number : bSet) {
            if (!aSet.contains(number)) count++;
        }

        System.out.print(count);
    }
}
