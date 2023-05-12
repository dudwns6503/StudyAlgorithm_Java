/*
 * BOJ 26069 붙임성 좋은 총총이
 *
 * memory : 14976kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P26069 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashSet<String> dancingName = new HashSet<>();
        dancingName.add("ChongChong");

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String a = st.nextToken();
            String b = st.nextToken();

            if (dancingName.contains(a)) {
                dancingName.add(b);
            } else if (dancingName.contains(b)) {
                dancingName.add(a);
            }
        }

        System.out.print(dancingName.size());
    }
}
