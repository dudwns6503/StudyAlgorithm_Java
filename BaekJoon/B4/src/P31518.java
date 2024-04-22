/*
 * BOJ 31518 Triple Sevens
 *
 * memory : 14196kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P31518 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < 3; i++) {
            boolean flag = false;
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                if (Integer.parseInt(st.nextToken()) == 7) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.print("0");
                return;
            }
        }

        System.out.print("777");
    }
}
