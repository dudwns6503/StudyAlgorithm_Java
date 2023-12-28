/*
 * BOJ 30794 가희와 클럽 오디션 1
 *
 * memory : 14184kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30794 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lv = Integer.parseInt(st.nextToken());
        String correctness = st.nextToken();

        if (correctness.equals("miss"))
            System.out.print(0);
        else if (correctness.equals("bad"))
            System.out.print(200 * lv);
        else if (correctness.equals("cool"))
            System.out.print(400 * lv);
        else if (correctness.equals("great"))
            System.out.print(600 * lv);
        else
            System.out.print(1000 * lv);
    }
}
