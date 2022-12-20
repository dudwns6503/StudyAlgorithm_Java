/*
 * BOJ 15828 Router
 *
 * memory : 39632kb
 * time : 424ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P15828 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> buffer = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        while (true) {
            int num = Integer.parseInt(br.readLine());

            // -1이 주어지면 종료.
            if (num == -1) break;

            // 입력이 0이라면 버퍼에서 하나를 뽑아냄.
            if (num == 0) {
                buffer.poll();
                continue;
            }

            // 버퍼가 꽉찼다면 다음으로 넘어감.
            if (buffer.size() == n) continue;

            // 아무 조건도 만족하지 않는다면 버퍼에 패킷 추가.
            buffer.offer(num);
        }

        if (buffer.isEmpty()) {
            sb.append("empty");
        }
        else {
            while (!buffer.isEmpty()) {
                sb.append(buffer.poll()).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.print(sb);
    }
}
