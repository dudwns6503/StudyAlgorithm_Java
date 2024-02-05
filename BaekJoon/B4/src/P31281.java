/*
 * BOJ 31281 ЗЛАТНАТА СРЕДА
 *
 * memory : 14236kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P31281 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] numbers = new long[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(numbers);
        System.out.print(numbers[1]);
    }
}
