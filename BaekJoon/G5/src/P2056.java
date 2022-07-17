/*
 * BOJ 2056 작업
 *
 * memory : 82656kb
 * time : 788ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P2056 {

    static ArrayList<Integer>[] works;
    static int[] time, workTime, inDegree;
    static int N;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        time = new int[N+1];
        workTime = new int[N+1];
        inDegree = new int[N+1];

        works = new ArrayList[N+1];
        for(int i=1; i<=N; i++) {
            works[i] = new ArrayList<>();
        }

        for(int i=1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            time[i] = Integer.parseInt(st.nextToken());

            int cnt = Integer.parseInt(st.nextToken());

            for(int j=0; j<cnt; j++) {
                int preWork = Integer.parseInt(st.nextToken());

                works[preWork].add(i);
                inDegree[i]++;
            }
        }
    }

    static void pro() {

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++) {
            if(inDegree[i] == 0) {
                queue.offer(i);
                workTime[i] = time[i];
            }
        }

        while(!queue.isEmpty()) {
            int x = queue.poll();

            for(int y: works[x]) {
                workTime[y] = Math.max(workTime[y], workTime[x] + time[y]);

                if(--inDegree[y] == 0) queue.offer(y);
            }
        }

        Arrays.sort(workTime, 1, N+1);
        System.out.print(workTime[N]);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}