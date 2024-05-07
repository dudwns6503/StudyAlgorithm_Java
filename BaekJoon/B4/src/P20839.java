/*
 * BOJ 20839 Betygsättning
 *
 * memory : 14096kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20839 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int criteriaX = Integer.parseInt(st.nextToken());
        int criteriaY = Integer.parseInt(st.nextToken());
        int criteriaZ = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        if (y >= criteriaY) {
            if (x >= criteriaX) {
                System.out.print("A");
            }
            else if (x >= (criteriaX + 1) / 2){
                System.out.print("B");
            }
            else {
                System.out.print("C");
            }
        } else {
            if (y >= (criteriaY + 1) / 2) {
                System.out.print("D");
            } else {
                System.out.print("E");
            }
        }
    }
}
