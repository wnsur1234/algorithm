package com.proCode.level2;

import java.util.Scanner;

public class H_Index {
    public static void main(String[] args) {

        /*
         * H-Index 구하기 문제
         * H-Indext는 주어진 논문들에서 h인용횟수 이상이 될 수 있는 수 중 최대값
         * h는 논물들 중 인용횟수가 가능한 수
         * ex) h = 1 -> 1번 이상 인용환 논문의 수가 1이상인가?
         * 따라서
         * 1. citations.length = n
         * 2. h의 조건 => citations 반복 -> 각 요소가 h 보다 큰 개수 count -> 최종 count > h만 족 중 제일 높은거
         * */

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strArr = str.split(",");
        int[] citations = new int[strArr.length];
        int c = 0;
        // 입력 배열 Int 배열로 변환
        for (String s : strArr) {
            citations[c] = Integer.parseInt(s);
            c +=1;
        }


        // H-Index 구하기
        // 이중 for 문을 돌아야하나?
        // 시뮬 : h = 0 ~ 계속 커짐
        // h = 1 이면 배열의 요소 모두와 비교하며 이상일때 count 해야함
        int H = 0;
        for (int h = 0; h <= citations.length; h++) {
            int count = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= h) {
                    count++;
                }
            }
            if (h <= count) {
                H = h;
            }
        }
        System.out.println(H);
    }
}

