/*
BaekJoon 2562 최댓값
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2562 {

    static int N = 9;
    static int max = Integer.MIN_VALUE;
    static int maxIndex = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max != Math.max(max, arr[i])) {
                max = Math.max(max, arr[i]);
                maxIndex = i+1;
            };
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
