/*
BaekJoon 2480 주사위 세개

예외처리를 확실하게 하는 것이 포인트이다. -> 반례를 생각하는데 시간이 오래걸림.
*/

import java.util.*;

public class P2480 {

    static int N = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[N];
        int isSame = 0;
        int sameNumber = 0;
        for(int i=0; i<N; i++) {
            num[i] = sc.nextInt();
            if(i >= 1 && num[i-1] == num[i]) {
                sameNumber = num[i];
                isSame += 1;
                continue;
            }
            // 3, 6, 3 같은 예외처리
            if(i==2 && num[i-2] == num[i]) {
                sameNumber = num[i];
                isSame += 1;
            }
        }

        Arrays.sort(num);

        switch(isSame) {
            case 0:
                System.out.println(num[N-1] * 100);
                break;
            case 1:
                System.out.println(sameNumber * 100 + 1000);
                break;
            case 2:
                System.out.println(sameNumber * 1000 + 10000);
        }
    }
}
