/*
 * BOJ 30585 Поп-ит
 *
 * memory : 14200kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30585 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = br.readLine();
        }

        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i].charAt(j) == '0')
                    zeroCount++;
                else
                    oneCount++;
            }
        }

        System.out.print(Math.min(zeroCount, oneCount));
    }
}
