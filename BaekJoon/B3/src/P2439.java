/*
BaekJoon 2439 별찍기-2
*/
import java.util.Scanner;

public class P2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++) {
            for(int j=N-1; j >=0;  j--) {
                if(j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
