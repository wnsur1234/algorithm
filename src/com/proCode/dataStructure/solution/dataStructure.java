package com.proCode.dataStructure.solution;

import java.util.*;

public class dataStructure {
    /*
    1. Array
    문제: 정수 배열이 주어질 때, 가장 큰 두 수의 합을 반환하시오.
    예: [1, 9, 3, 7, 5] → 9 + 7 = 16
    * */
    public static void main(String[] args) {
        array();
        list();
    }

    private static void list() {
        // 문제 : 중복을 제거한 리스트 반환
        int[] ex = {1,2,2,3,4,4};
        // 풀이 : set은 중복 허용 x 길이 제한 있음
        Set<Integer> set = new HashSet<>();
        for(int i : ex){
            set.add(i);
        }
        // 다시 List 화
        List<Integer> resultList = new ArrayList<>(set);
        System.out.println(resultList);
    }

    private static void array() {
        int[] arr = {1,9,3,7,5};
        // 내 생각 일단 배열의 특성 상 배열의 값을 찾기 위해서 O(n)의 시간 복잡도
        // 뭐 sort 랑 이런거? 있는거 같은데 이건 뭐였는지 다시 확인
        // -> 이거 Array.sort 임

//        int max = arr[0];
//        int nextMax = arr[0]; -> 이렇게 했을 경우 같은 값을 가지는 오류가 생길 수 있음
        int max = Integer.MIN_VALUE;
        int nextMax = Integer.MIN_VALUE;
        // 일단 최대값을 찾음
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] > max) {
                nextMax = max;
                max = arr[i];
            }else if (nextMax < arr[i] && arr[i]!= max) {
                nextMax = arr[i];
            }
        }
        // 이후 최댓값 제거? 라고 생각하긴 하는데
        // 배열의 특성상 추가나 제거가 맨끝이나 처음이 아니면 힘듦
        // 해서 그냥 위에서 최대값을 찾고 next최대값을 찾음
        System.out.println(max+nextMax);
    }
}
