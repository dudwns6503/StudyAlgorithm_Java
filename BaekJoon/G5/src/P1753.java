/*
BaekJoon 1753 최단경로
*/

import java.io.*;
import java.util.*;

public class P1753 {

    static ArrayList<Node>[] adjList;

    static class Node {

        int to;
        int weight;

        public Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());
        int end = V - 1;
        adjList = new ArrayList[V+1];
        boolean[] visited = new boolean[V+1];
        int[] distance = new int[V+1];
        final int INFINITY = Integer.MAX_VALUE;

        for(int i=1; i<=V; i++) {
            adjList[i] = new ArrayList<Node>();
        }

        for(int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            adjList[from].add(new Node(to, weight));
        }

        // distance배열을 무한으로 초기화한다.
        Arrays.fill(distance, INFINITY);
        // 시작 정점은 0으로 만든다.
        distance[start] = 0;

        for(int i=1; i<=V; i++) {
            int current = 0;
            // 1단계: 방문하지 않은 정점들 중 최소 가중치의 정점 선택
            int min = INFINITY;
            for(int j=1; j<=V; j++) {
                // 방문하지 않은 정점이면서, 최소 가중치보다 작으면 업데이트
                if(!visited[j] && min>distance[j]) {
                    // 최소 가중치 업데이트
                    min = distance[j];
                    // 정점 선택
                    current = j;
                }
            }

            // 선택 정점 방문 처리
            visited[current] = true;
            // 선택 정점이 도착 정점이면 탈출
            if(current == end) {
                break;
            }

            // 2단계: current 정점을 경유지로해서 갈 수 있는 다른 방문하지 않은 정점들을 처리.
            for(int c=0; c<adjList[current].size(); c++) {
                if(!visited[adjList[current].get(c).to] && distance[adjList[current].get(c).to] > min + adjList[current].get(c).weight) {
                    distance[adjList[current].get(c).to] = min + adjList[current].get(c).weight;
                }
            }
        }

        for(int i=1; i<=V; i++) {
            if(distance[i] == INFINITY) {
                System.out.println("INF");
            } else {
                System.out.println(distance[i]);
            }
        }
    }
}