/*
 * BOJ 9772 Quadrants
 *
 * memory : 14056kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9772 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);

            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());

            if (x == 0 || y == 0)
                System.out.println("AXIS");
            else if (x < 0 && y < 0)
                System.out.println("Q3");
            else if (x > 0 && y > 0)
                System.out.println("Q1");
            else if (x > 0 && y < 0)
                System.out.println("Q4");
            else if (x < 0 && y > 0)
                System.out.println("Q2");
        }
    }
}
