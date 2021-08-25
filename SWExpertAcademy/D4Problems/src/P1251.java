/*
SW Expert Academy 문제 1251 [S/W 문제해결 응용] 4일차 - 하나로
*/

import java.util.*;
import java.io.*;

public class P1251 {
    static class Node {

        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=T; test_case++) {
            int N = Integer.parseInt(br.readLine());

            boolean[] visited = new boolean[N];
            double[] minEdge = new double[N];
            Node[] adjList = new Node[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            double E = Double.parseDouble(br.readLine());
            for(int i=0; i<N; i++) {
                adjList[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st2.nextToken()));
                minEdge[i] = Double.MAX_VALUE;
            }

            minEdge[0] = 0;
            double answer = 0;

            for(int i=0; i<N; i++) {
                // 1. 신장트리에 포함되지 않은 정점 중 최소 간선비용의 정점 찾기
                double min = Double.MAX_VALUE;
                int minVertex = -1; // 최소 간선 비용의 정점 번호
                for(int j=0; j<N; j++) {
                    if(!visited[j] && min > minEdge[j]) {
                        min = minEdge[j];
                        minVertex = j;
                    }
                }

                visited[minVertex] = true; // 신장트리에 포함시킴
                answer += min; // 간선비용 누적

                // 2. 선택된 정점 기준으로 신장트리에 연결되지 않은 타 정점과의 간선 비용 최소로 업데이트
                for(int j=0; j<N; j++) {
                    double distance = E * (Math.pow(adjList[minVertex].x - adjList[j].x, 2) +
                            + Math.pow(adjList[minVertex].y - adjList[j].y, 2));
                    if(!visited[j] && minEdge[j] > distance) {
                        minEdge[j] = distance;
                    }
                }
            }
            System.out.printf("#%d %.0f\n", test_case, answer);
        }
    }
}