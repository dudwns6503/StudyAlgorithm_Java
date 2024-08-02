/*
 * BOJ 17219 비밀번호 찾기
 *
 * memory : 55276kb
 * time : 532ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P17219 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String key = st.nextToken();
            String value = st.nextToken();

            map.put(key, value);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(map.get(br.readLine())).append("\n");
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
