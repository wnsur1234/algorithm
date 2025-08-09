package com.proCode.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ChooseOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 상자에 담으려는 개수 : k
        // 귤의 크기 : oranges
        System.out.print("K : ");
        int k = sc.nextInt();
        sc.nextLine();
        System.out.println("배열 입력하세요. " );
        String s = sc.nextLine();
        String[] oranges = s.split(",");
        int[] orangesInt = new int[oranges.length];
        for (int i = 0; i < orangesInt.length; i++) {
            orangesInt[i] = Integer.parseInt(oranges[i]);
        }
        solution(k,orangesInt);
    }

    private static void solution(int k , int[] orangesInt) {

        int sum = 0;
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : orangesInt) {
            // 일단 orangesInt = 크기 배열을 돌면 서
            // 각 인덱스에 해당 하는 값
            // 비교를 orangesInt 와 같은 값이 있으면 으로 해야하나
            // 1. put orangesInt(크기), o을 넣는다
            // 2. 조건 orangesInt 존재한다면 +1
            // 그게 아니라면 0을 넣는다
            int currentCount = 0;
            if (map.get(j) == j) {
                currentCount = map.get(j);
            }
            map.put(j, currentCount + 1);
        }
        // 여기 까지가 귤 별 개수 저장 한거고
        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort(Collections.reverseOrder());
        for (int v : valueList) {
            if (sum + v >= k) {
                cnt++;
                break;
            } else {
                sum += v;
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
