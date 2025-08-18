package com.proCode.dataStructure.solution;

import java.util.*;

public class dataStructure {
    /*
    1. Array
    문제: 정수 배열이 주어질 때, 가장 큰 두 수의 합을 반환하시오.
    예: [1, 9, 3, 7, 5] → 9 + 7 = 16
    * */
    public static void main(String[] args) {
        //array();
        //list();
        addString();
    }

    private static void addString() {
        Scanner sc = new Scanner(System.in);
        // 문자열을 계속 입력 받아야함 -> 무한 loop
        // 문자열을 계속 추가한다? = 리스트의 특징 중 1개 길이의 제한이 없고 중복을 허용한다.
        // 그랬을 때 내 생각 1. 단순 리스트 추가 2. map을 생각했는데 생각해 보니 Map은 중복 허용 X
        // 1 번 채택
        List<String> list = new ArrayList<>();
        while (true) {

            String s = sc.nextLine();
            if(s.equals("exit")){
                break;
            }
            // 번외 : 여기서 인텔리제이가 sc. 만해도 hashnextLine 을 자동완성하려는데 이게 뭔지
            list.add(s);
        }
        System.out.println(list);
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
