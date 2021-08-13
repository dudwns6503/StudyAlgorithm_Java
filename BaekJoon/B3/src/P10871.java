/*
BaekJoon 10871 X보다 작은 수
*/

import java.util.Scanner;

public class P10871 {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int X = sc.nextInt();

       for(int i=0; i<N; i++) {
           int a = sc.nextInt();
           if (a < X) {
               System.out.print(a + " ");
           }
       }
    }
}
