/*
BaekJoon 2675 문자열 반복
*/

import java.util.*;

public class P2675 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case=1; test_case<=T; test_case++) {
            ArrayList<String> arrayList = new ArrayList<>();
            int N = sc.nextInt();
            String str = sc.next();
            String[] strArray = new String[str.length()];
            strArray = str.split("");

            for(int i=0; i<strArray.length; i++) {
                for(int j=0; j<N; j++) {
                    arrayList.add(strArray[i]);
                }
            }
            for(int i=0; i<arrayList.size(); i++) {
                System.out.print(arrayList.get(i));
            }
            System.out.println();
        }
    }
}
