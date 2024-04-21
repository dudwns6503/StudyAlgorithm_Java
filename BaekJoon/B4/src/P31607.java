/*
 * BOJ 31607 和の判定 (Sum Checker)
 *
 * memory : 14236kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P31607 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[3];

        numbers[0] = Integer.parseInt(br.readLine());
        numbers[1] = Integer.parseInt(br.readLine());
        numbers[2] = Integer.parseInt(br.readLine());

        Arrays.sort(numbers);

        if (numbers[2] == numbers[0] + numbers[1])
            System.out.print("1");
        else
            System.out.print("0");
    }
}
