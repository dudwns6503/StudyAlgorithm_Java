/*
 * BOJ 29823 Pakirobot Manhattanis
 *
 * memory : 14212kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P29823 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        String word = br.readLine();

        int w = 0;
        int e = 0;
        int n = 0;
        int s = 0;

        for (int i = 0; i < number; i++) {
            char c = word.charAt(i);
            if (c == 'W')
                w++;
            else if (c == 'E')
                e++;
            else if (c == 'N')
                n++;
            else
                s++;
        }

        int count = Math.abs(w - e) + Math.abs(n - s);
        System.out.print(count);
    }
}
