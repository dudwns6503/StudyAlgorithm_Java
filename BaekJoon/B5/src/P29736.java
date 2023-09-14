/*
 * BOJ 29736 브실이와 친구가 되고 싶어 🤸‍♀️
 *
 * memory : 15012kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P29736 {

    private static Set<Integer> set;
    private static int a, b, k, x;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        setInit();

        st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void setInit() {
        set = new HashSet<>();

        for (int i = a; i <= b; i++) {
            set.add(i);
        }
    }

    private static void solve() {
        // 배열의 index가 0보다 작으면 안되기 때문에 최솟값은 0으로 설정.
        int start = Math.max((k - x), 0);

        int friendCount = 0;
        for (int i = start; i <= k + x; i++) {
            if (set.contains(i)) friendCount++;
        }

        if (friendCount == 0) System.out.print("IMPOSSIBLE");
        else System.out.print(friendCount);
    }
}
