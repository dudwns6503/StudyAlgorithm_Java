/*
 * BOJ 26566 Pizza
 *
 * memory : 14020kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26566 {

    private static StringBuilder sb = new StringBuilder();
    private static int area, radius, priceOne, priceTwo;

    public static void main(String[] args) throws Exception {
        input();
    }
    
    private static void solve() {
        double twoPizzaArea = radius * radius * Math.PI;
        double onePizzaPrice = twoPizzaArea / area * priceOne;

        if (onePizzaPrice < priceTwo)
            sb.append("Slice of pizza").append("\n");
        else
            sb.append("Whole pizza").append("\n");
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            area = Integer.parseInt(st.nextToken());
            priceOne = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            radius = Integer.parseInt(st.nextToken());
            priceTwo = Integer.parseInt(st.nextToken());

            solve();
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
