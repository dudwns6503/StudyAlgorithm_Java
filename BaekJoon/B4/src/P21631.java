/*
 * BOJ 21631 Checkers
 *
 * memory : 14180kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21631 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long whitePieces = Long.parseLong(st.nextToken());
        long blackPieces = Long.parseLong(st.nextToken());

        long ans;

        if (whitePieces == 0) {
            ans = Math.min(1, blackPieces);
        } else {
            ans = Math.min(whitePieces + 1, blackPieces);
        }

        System.out.print(ans);
    }
}
