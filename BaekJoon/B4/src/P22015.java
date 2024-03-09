/*
 * BOJ 22015 金平糖 (Konpeito)
 *
 * memory : 14276kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P22015 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numbers = new int[3];
        numbers[0] = Integer.parseInt(st.nextToken());
        numbers[1] = Integer.parseInt(st.nextToken());
        numbers[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(numbers);

        System.out.print(numbers[2] - numbers[1] + numbers[2] - numbers[0]);
    }
}
