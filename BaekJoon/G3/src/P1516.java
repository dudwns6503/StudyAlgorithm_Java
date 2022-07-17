/*
 * BOJ 1516 게임 개발
 *
 * memory : 22168kb
 * time : 328ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1516 {

    static ArrayList<Integer>[] building;
    static int[] inDegree, time, buildTime;
    static int N;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        inDegree = new int[N+1];
        building = new ArrayList[N+1];
        // 각 건물의 짓는 시간
        time = new int[N + 1];
        // 먼저 지어져야 하는 건물의 시간을 고려한 짓는 시간
        buildTime = new int[N + 1];

        for(int i=1; i<=N; i++) {
            building[i] = new ArrayList<>();
        }

        for(int i=1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            time[i] = Integer.parseInt(st.nextToken());

            while(st.hasMoreTokens()) {
                int preBuilding = Integer.parseInt(st.nextToken());

                if(preBuilding == -1) break;

                // 선행 건물에 현재 건물을 연결하고
                building[preBuilding].add(i);
                // 현재 건물의 진입차수를 1 증가시킨다.
                inDegree[i]++;
            }
        }
    }

    static void pro() {

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++) {
            // 어떤 건물의 진입차수가 0이다 == 선행 건물이 없다 == 이전 건물의 짓는 시간에 영향을 안받는다.
            // 바로 buildTime에 넣어준다.
            if(inDegree[i] == 0) {
                queue.offer(i);
                buildTime[i] = time[i];
            }
        }

        while(!queue.isEmpty()) {
            int x = queue.poll();

            for(int y: building[x]) {
                // 각 건물의 biildTime은 이전 건물까지의 buildTime의 값 + 현재 건물의 짓는시간 중 최댓값
                buildTime[y] = Math.max(buildTime[y], buildTime[x] + time[y]);

                // 현재 건물의 진입차수를 -1하고 0이 되었으면 Queue에 넣어준다.
                if(--inDegree[y] == 0) queue.offer(y);
            }
        }

        for(int i=1; i<=N; i++) {
            System.out.println(buildTime[i]);
        }
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
