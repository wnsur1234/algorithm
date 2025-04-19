package com.proCode.level2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));        /*
        * 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.

조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.

자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.*/
    }
    private static int solution(int n) {
        // 입력 받은 숫자와 그 다음 수를 비교
        int num=n;
        while (true) {
            num++;
            if(countValue(transeValue(n)) == countValue(transeValue(num))) {
                break;
            }
        }
        return num;
    }
    private static ArrayList<Integer> transeValue(int n) {
        // n의 값이 주어 졌을 때 2진수로 변환하는 함수
        ArrayList<Integer> list = new ArrayList<Integer>();
        int leave;
        int count = n;
        int count1;
        do {
            count1 = count / 2;
            leave = count % 2;
            list.add(leave);
            count /= 2;
        }
        while (count != 1);
        return list;
    }

    private static int countValue(ArrayList<Integer> list) {
        // Value값이 1인 경우를 세주는 함수
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                count += 1;
            }
        }
        return count;
    }


}
