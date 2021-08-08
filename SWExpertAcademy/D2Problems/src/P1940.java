/*
SW Expert Academy 문제 1940 가랏! RC카!
*/

import java.util.Scanner;

public class P1940 {

    static int T, N;
    static int command, acceleration;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            int carSpeed = 0;
            int distance = 0;

            for(int i=0; i<N; i++) {
                command = sc.nextInt();
                if (command == 1) {  // 가속이면 가속도를 받는다.
                    acceleration = sc.nextInt();
                    carSpeed += acceleration;
                    distance += carSpeed;
                }
                else if(command == 2){ // 감속이여도 가속도를 받는다.
                    acceleration = sc.nextInt();
                    carSpeed -= acceleration;
                    if (carSpeed < 0) carSpeed = 0;
                    distance += carSpeed;
                } else if(command == 0) {
                    distance += carSpeed;
                }
            }
            System.out.println("#" + test_case + " " + distance);
        }

    }
}