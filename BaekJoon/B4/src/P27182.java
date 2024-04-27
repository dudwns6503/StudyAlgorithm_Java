/*
 * BOJ 27182 Rain Diary
 *
 * memory : 14276kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P27182 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n > 7)
            System.out.print(n - 7);
        else if (m <= 21)
            System.out.print(m + 7);
        else {
            System.out.print(m + 7 + (n - 7));
        }
    }
}
