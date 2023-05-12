 /*
  * BOJ 25192 인사성 밝은 곰곰이
  *
  * memory : 25640kb
  * time : 276ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P25192 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        int ans = 0;

        for (int i = 0; i < n; i++) {
            String name = br.readLine();

            if (name.equals("ENTER")) {
                ans += set.size();
                set.clear();
            } else {
                set.add(name);
            }
        }

        ans += set.size();
        System.out.print(ans);
    }
}
