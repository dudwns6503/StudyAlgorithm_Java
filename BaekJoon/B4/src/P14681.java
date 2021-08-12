/*
BaekJoon 14681 사분면 고르기
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P14681 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int result = 0;

        if (x > 0 && y > 0)  result = 1;
        else if (x > 0 && y < 0) result = 4;
        else if (x < 0 && y > 0) result = 2;
        else result = 3;

        System.out.println(result);
    }
}
