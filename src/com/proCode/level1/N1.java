package com.proCode.level1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class N1 {
    //포켓몬
    /*
    * 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다.
      폰켓몬은 종류에 따라 번호를 붙여 구분합니다. 따라서 같은 종류의 폰켓몬은 같은 번호를 가지고 있습니다.
      예를 들어 연구실에 총 4마리의 폰켓몬이 있고, 각 폰켓몬의 종류 번호가 [3번, 1번, 2번, 3번]이라면
      이는 3번 폰켓몬 두 마리, 1번 폰켓몬 한 마리, 2번 폰켓몬 한 마리가 있음을 나타냅니다.
      이때, 4마리의 폰켓몬 중 2마리를 고르는 방법은 다음과 같이 6가지가 있습니다.
        입출력 예
        nums	        result
        [3,1,2,3]	    2
        [3,3,3,2,2,4]	3
        [3,3,3,2,2,2]	2
입출력 예 설명
     */
    public static void main(String[] args) {

        solution();
    }

    private static int solution() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        HashSet<Integer> list = new HashSet<>();
        int answer = 0;
        for (int num : nums) {
            list.add(num);
        }
        if(list.size()>N/2){
            answer = N/2;
        }
        answer = list.size();
        return answer;
    }
}
