package com.proCode.test3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Test3 {
    /*
    array의 각 element 중 dvisor 로 나누어 떨어지는 값을 오름 차순으로 정렬 한 배열을 반환하는 함수를 구하시오
    divisor 로 나누어 떨어지는 element 가 하나도 없다면 배열에 -1을 담아 반환 하시오.
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열을 입력하시오 : ");
        String[] array = sc.nextLine().split(",");
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        System.out.println("숫자를 입력하시오 : ");
        int divisor = sc.nextInt();

        int[] result =  solution(arr,divisor);
        System.out.println(Arrays.toString(result));
    }
    private static int[] solution(int[] arr, int divisor) {
        LinkedList<Integer> answer = new LinkedList<>();
        for (int j : arr) {
            if (j % divisor == 0) {
                answer.add(j);
            }
        }
        if(answer.isEmpty()) {
            answer.add(-1);
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}
