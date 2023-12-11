/*
 * BOJ 6825 Body Mass Index
 *
 * memory : 14212kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6825 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());

        double bmi = weight / (height * height);

        if (bmi > 25)
            System.out.print("Overweight");
        else if (bmi >= 18.5)
            System.out.print("Normal weight");
        else
            System.out.print("Underweight");
    }
}
