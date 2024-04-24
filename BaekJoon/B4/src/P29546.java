/*
 * BOJ 29546 Файлы
 *
 * memory : 21956kb
 * time : 240ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P29546 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        String[] fileNames = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            fileNames[i] = br.readLine();
        }

        int m = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int firstIndex = Integer.parseInt(st.nextToken());
            int lastIndex = Integer.parseInt(st.nextToken());

            for (int j = firstIndex; j <= lastIndex; j++) {
                sb.append(fileNames[j]).append("\n");
            }
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
