/*
 * BOJ 26530 Shipping
 *
 * memory : 14436kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26530 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            double sum = 0;
            int x = Integer.parseInt(br.readLine());

            for (int j = 0; j < x; j++) {
                st = new StringTokenizer(br.readLine());

                String name = st.nextToken();
                int quantity = Integer.parseInt(st.nextToken());
                double price = Double.parseDouble(st.nextToken());

                sum += quantity * price;
            }

            System.out.println("$" + String.format("%.2f", sum));
        }
    }
}
