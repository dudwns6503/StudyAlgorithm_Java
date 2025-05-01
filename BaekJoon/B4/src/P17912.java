/*
 * BOJ 17912 License to Launch
 *
 * memory : 25484kb
 * time : 280ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17912 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int minTrash = Integer.MAX_VALUE;
        int minDay = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());

            if (minTrash > current) {
                minTrash = current;
                minDay = i;
            }
        }

        System.out.print(minDay);
    }
}
