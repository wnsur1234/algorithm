package com.proCode.test4;

import java.util.Scanner;
import java.util.Stack;

public class SaleApple {

    public static void main(String[] args) {
//    사과 상태에 따라 1점 부터 k점까지의 점수로 분류하며, K점이 최상품 1점이 최하품 이다.
//    사과 한 상자의 가격 결정되는 방법
//            - 한 상자에 사과를 m개씩 담아 포장
//            - 상자에 담긴 사과 중 가장 낮은 점수가 p(1<= p <=k)점 인 경우,
//              사과 한 상자의 가격 = p * m ,
//    가능한 많이 사과를 팔았을 때, 얻을 수 있는 최대 이익을 계산 하자,
//    (사과는 상자 단위로만 판매하며, 남는 사과는 버림)
//
//    예를 들어 k=3, m=4 사과 7개의 점수가 [1,2,3,1,2,3,1] 라면,
//    [2,3,2,3]으로 구성된 사과 상자 1개를 판매 최대 이익 얻을 수 있음
//     - (최저 사과 점수 = 2) * (한상자에 담긴 사과 개수 = 4) * (상자 개수 = 1) = 2*4*1 = 8
//
//    사과 최대 점수 k, 한 상자에 들어가는 사과의 수  m,
//    사과들의 점수 score 가 주어 졌을 때, 과일장수가 얻을 수 있는 최대 이익을 구하시오.

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        String[] scores = sc.nextLine().split(",");
        int[] scoreArry = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            scoreArry[i] = Integer.parseInt(scores[i]);
        }
        int result = solution(k, m, scoreArry);
        System.out.println(result);
    }

    private static int solution(int k, int m, int[] scoreArry) {
        int[] count = new int[k + 1]; // 점수별 개수 카운트

        // 각 점수별 개수 저장
        for (int score : scoreArry) {
            count[score]++;
        }

        int totalProfit = 0;
        int appleCount = 0;

        // 높은 점수부터 순회
        for (int score = k; score >= 1; score--) {
            while (count[score] > 0) {
                count[score]--;
                appleCount++;

                // 한 상자 완성
                if (appleCount == m) {
                    totalProfit += score * m;
                    appleCount = 0;
                }
            }
        }

        return totalProfit;
    }
}
