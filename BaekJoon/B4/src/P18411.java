/*
 * BOJ 18411 試験 (Exam)
 *
 * memory : 14220kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P18411 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[3];
        scores[0] = Integer.parseInt(st.nextToken());
        scores[1] = Integer.parseInt(st.nextToken());
        scores[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(scores);
        System.out.print(scores[1] + scores[2]);
    }
}
