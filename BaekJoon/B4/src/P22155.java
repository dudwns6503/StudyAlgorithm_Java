/*
 * BOJ 22155 Простая задача
 *
 * memory : 14072kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P22155 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int theNumberOfIf = Integer.parseInt(st.nextToken());
            int theNumberOfFor = Integer.parseInt(st.nextToken());

            if (theNumberOfIf > 2 || theNumberOfFor > 2) {
                System.out.println("No");
            } else if (theNumberOfIf == 2 && theNumberOfFor == 2) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
