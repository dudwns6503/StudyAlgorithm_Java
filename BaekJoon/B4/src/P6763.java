/*
 * BOJ 6763 Speed fines are not fine!
 *
 * memory : 14212kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6763 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());

        int exceedSpeed = speed - limit;

        if (exceedSpeed < 1) {
            System.out.print("Congratulations, you are within the speed limit!");
        }
        else if (exceedSpeed <= 20) {
            System.out.print("You are speeding and your fine is $100.");
        } else if (exceedSpeed <= 30) {
            System.out.print("You are speeding and your fine is $270.");
        } else {
            System.out.print("You are speeding and your fine is $500.");
        }
    }
}
