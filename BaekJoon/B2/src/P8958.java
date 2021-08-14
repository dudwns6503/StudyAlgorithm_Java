/*
BaekJoon 8958 OX퀴즈
*/

import java.util.*;

public class P8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            String str = sc.next();
            String[] strArray = new String[str.length()];
            strArray = str.split("");
            int sumScore = 0;
            int countO = 0;

            for(int i=0; i<strArray.length; i++) {
                if(strArray[i].equals("O")) {
                    countO = 1;
                    sumScore += countO;
                    for(int j=i+1; j<strArray.length; j++) {
                        if(strArray[j].equals("O")) {
                            countO += 1;
                            i++;
                            sumScore += 1 * countO;
                        } else {
                            break;
                        }
                    }
                }
            }
            System.out.println(sumScore);
        }
    }
}
