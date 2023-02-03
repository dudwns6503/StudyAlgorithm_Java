/*
 * BOJ 4153 직각삼각형
 *
 * memory : 14072kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P4153 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] numbers;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            numbers = new int[3];
            numbers[0] = Integer.parseInt(st.nextToken());
            numbers[1] = Integer.parseInt(st.nextToken());
            numbers[2] = Integer.parseInt(st.nextToken());

            if (numbers[0] == 0 && numbers[1] == 0 && numbers[2] == 0) break;

            Arrays.sort(numbers);

            if (numbers[2] * numbers[2] == (numbers[0] * numbers[0]) + (numbers[1] * numbers[1])) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
