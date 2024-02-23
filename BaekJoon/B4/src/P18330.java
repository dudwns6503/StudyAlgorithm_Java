/*
 * BOJ 18330 Petrol
 *
 * memory : 14256kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P18330 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int amount = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        if (amount <= 60)
            System.out.print(1500 * amount);
        else
            System.out.print(1500 * Math.min(amount, 60 + day) + 3000 * (Math.max(0, amount - (60 + day))));
    }
}
