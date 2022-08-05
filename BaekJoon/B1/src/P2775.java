/*
 * BOJ 2775 부녀회장이 될테야
 *
 * memory : 14196kb
 * time : 120ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2775 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] apartment;
    static int n, k;

    public static void main(String[] args) throws Exception {
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            sol();
        }
    }

    static void sol() throws Exception {
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        apartment = new int[n+1][k+1];

        for(int i=0; i<=n; i++) {
            for(int j=1; j<=k; j++) {
                if(i == 0) apartment[i][j] = j;
                else {
                    for(int m=1; m<=j; m++) {
                        apartment[i][j] += apartment[i-1][m];
                    }
                }
            }
        }

        System.out.println(apartment[n][k]);
    }
}
