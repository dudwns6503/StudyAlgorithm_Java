/*
 * BOJ 27262 Лифт
 *
 * memory : 14100kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P27262 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int floor = Integer.parseInt(st.nextToken());
        int currentElevatorFloor = Integer.parseInt(st.nextToken());

        int walkSecond = Integer.parseInt(st.nextToken());
        int elevatorSecond = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append((currentElevatorFloor - 1) * elevatorSecond + (floor - 1) * elevatorSecond ).append(" ").append((floor - 1) * walkSecond);
        System.out.print(sb);
    }
}
