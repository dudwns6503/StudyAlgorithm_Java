/*
 * BOJ 17903 Counting Clauses
 *
 * memory : 14140kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17903 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        if (m >= 8)
            System.out.print("satisfactory");
        else
            System.out.print("unsatisfactory");
    }
}
