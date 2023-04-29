 /*
  * BOJ 14891 톱니바퀴
  *
  * memory : 16584kb
  * time : 180ms
  */


 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14891 {

    private static String[] gear;
    private static boolean[] rotated;
    private static int[] score = {0, 1, 2, 4, 8};
    private static int k;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        gear = new String[5];
        for (int i = 1; i <= 4; i++) {
            gear[i] = br.readLine();
        }

        k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());

            int gearNumber = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());

            rotated = new boolean[5];
            if (direction == 1) rightRoll(gearNumber);
            else leftRoll(gearNumber);
        }

        int ans = 0;

        // N극은 0점, S극이면 1점
        for (int i = 1; i <= 4; i++) {
            if (gear[i].charAt(0) == '1') {
                ans += score[i];
            }
        }

        System.out.print(ans);
    }

    // 01010101
    private static void leftRoll(int gearNumber) {
        char temp = gear[gearNumber].charAt(0);
        gear[gearNumber] = gear[gearNumber].substring(1) + temp;

        rotated[gearNumber] = true;

        int now = gearNumber;
        int next = gearNumber + 1;
        int previous = gearNumber - 1;

        if (now == 1) {
            if (!rotated[next] && gear[now].charAt(1) != gear[next].charAt(6)) {
                rightRoll(next);
            }
        } else if (now == 2) {
            if (!rotated[next] && gear[now].charAt(1) != gear[next].charAt(6)) {
                rightRoll(next);
            }

            if (!rotated[previous] && gear[previous].charAt(2) != gear[now].charAt(5)) {
                rightRoll(previous);
            }
        } else if (now == 3) {
            if (!rotated[next] && gear[now].charAt(1) != gear[next].charAt(6)) {
                rightRoll(next);
            }

            if (!rotated[previous] && gear[previous].charAt(2) != gear[now].charAt(5)) {
                rightRoll(previous);
            }
        } else {
            if (!rotated[previous] && gear[previous].charAt(2) != gear[now].charAt(5)) {
                rightRoll(previous);
            }
        }
    }

    private static void rightRoll(int gearNumber) {
        char temp = gear[gearNumber].charAt(7);
        gear[gearNumber] = temp + gear[gearNumber].substring(0, 7);

        rotated[gearNumber] = true;

        int now = gearNumber;
        int next = gearNumber + 1;
        int previous = gearNumber - 1;

        if (now == 1) {
            if (!rotated[next] && gear[now].charAt(3) != gear[next].charAt(6)) {
                leftRoll(next);
            }
        } else if (now == 2) {
            if (!rotated[next] && gear[now].charAt(3) != gear[next].charAt(6)) {
                leftRoll(next);
            }

            if (!rotated[previous] && gear[previous].charAt(2) != gear[now].charAt(7)) {
                leftRoll(previous);
            }
        } else if (now == 3) {
            if (!rotated[next] && gear[now].charAt(3) != gear[next].charAt(6)) {
                leftRoll(next);
            }

            if (!rotated[previous] && gear[previous].charAt(2) != gear[now].charAt(7)) {
                leftRoll(previous);
            }
        } else {
            if (!rotated[previous] && gear[previous].charAt(2) != gear[now].charAt(7)) {
                leftRoll(previous);
            }
        }
    }
}
