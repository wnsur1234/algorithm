package com.proCode.level2;

import java.util.ArrayList;
import java.util.Scanner;

// Solution2 의 문제점
// 2진수로 변환하는 과정에서 List에 값을 저장했는데 굳이 그럴 필요가 없었음
// List에 값을 저장하고 찾는데 걸리는 시간 복잡도 O(n) 매우 오래 걸림
// 그냥 2진수로 변환하는 과정에 1의 값이 나오면 바로 바로 count 로 해결
public class Solution2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    private static int solution(int n) {
        // 입력 받은 숫자와 그 다음 수를 비교
        int num = n;
        while (true) {
            num++;
            if(transeValue(n) == transeValue(num)) {
                break;
            }
        }
        return num;
    }
    private static int transeValue(int n) {
        // n의 값이 주어 졌을 때 2진수로 변환하며
        // 1의 값이 나오면 count 해주는 함수
        int count = 0; // 왜냐하면 0을 제외한 모든 수는
        int result =n;
        int leave = 0;
        while (true){
            leave = result%2;
            if(leave == 1){
                count++;
            }
            result = result/2;
            if(result == 1){
                count++;
                break;
            }
        }
        return count;
    }
}
