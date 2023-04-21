/*
 * BOJ 27964 콰트로치즈피자
 *
 * memory : 14196kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P27964 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashSet<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            String ingredient = st.nextToken();

            if (ingredient.endsWith("Cheese")) {
                set.add(ingredient);
            }

            if (set.size() == 4) {
                System.out.print("yummy");
                return;
            }
        }

        System.out.print("sad");
    }
}
