/*
 * BOJ 29267 Случай с игрой
 *
 * memory : 14252kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P29267 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int currentBullet = 0;
        int savedBullet = 0;
        for (int i = 0; i < n; i++) {
            String behavior = br.readLine();

            if (behavior.equals("ammo"))
                currentBullet += k;
            else if (behavior.equals("shoot"))
                currentBullet -= 1;
            else if (behavior.equals("save"))
                savedBullet = currentBullet;
            else if (behavior.equals("load"))
                currentBullet = savedBullet;

            System.out.println(currentBullet);
        }
    }
}
