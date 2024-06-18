/*
 * BOJ 31994 강당 대관
 *
 * memory : 14236kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P31994 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] semina = new String[7];
        int[] count = new int[7];
        for (int i = 0; i < 7; i++) {
            st = new StringTokenizer(br.readLine());

            semina[i] = st.nextToken();
            count[i] = Integer.parseInt(st.nextToken());
        }

        int maxIndex = -1;
        int max = -1;
        for (int i = 0; i < 7; i++) {
            if (count[i] > max) {
                max = count[i];
                maxIndex = i;
            }
        }

        System.out.print(semina[maxIndex]);
    }
}
