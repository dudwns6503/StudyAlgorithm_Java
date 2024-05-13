/*
 * BOJ 21665 Миша и негатив
 *
 * memory : 14184kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21665 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] originalImage = new String[n];

        for (int i = 0; i < n; i++) {
            originalImage[i] = br.readLine();
        }

        br.readLine();

        String[] resultImage = new String[n];
        for (int i = 0; i < n; i++) {
            resultImage[i] = br.readLine();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (originalImage[i].charAt(j) == 'B' && resultImage[i].charAt(j) == 'B')
                    ans++;
                else if (originalImage[i].charAt(j) == 'W' && resultImage[i].charAt(j) == 'W')
                    ans++;
            }
        }

        System.out.print(ans);
    }
}
