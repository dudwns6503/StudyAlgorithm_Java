/*
 * BOJ 24183 Affischutskicket
 *
 * memory : 14232kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24183 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int envelopeWeight = 229 * 324 * Integer.parseInt(st.nextToken()) * 2;
        int posterWeight = 297 * 420 * Integer.parseInt(st.nextToken()) * 2;
        int infoSheetWeight = 210 * 297 * Integer.parseInt(st.nextToken());

        System.out.print((double)(envelopeWeight + posterWeight + infoSheetWeight) / 1000000);
    }
}
