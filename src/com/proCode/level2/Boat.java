package com.proCode.level2;

import java.util.Arrays;
import java.util.Scanner;

public class Boat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        String arr = sc.nextLine();

        String[] arrArr = arr.split(",");

        int[] arrInt = new int[arrArr.length];
        for (int i = 0; i < arrArr.length; i++) {
            arrInt[i] = Integer.parseInt(arrArr[i]);
        }

        int result = solution(arrInt, limit);

    }

    private static int solution(int[] arrInt, int limit) {
        int result = 0;
        /*
        * 내가 생각 한 풀이
        * 최소 최대값 구해서 각 최대 최소를 더하고 <= limit 라면 없앤다.
        * */
//        int max = arrInt[0];
//        int min = arrInt[0];
//        for (int i = 1; i < arrInt.length; i++) {
//            if( arrInt[i] > max) {
//                max = arrInt[i];
//            }
//            if( arrInt[i] < min) {
//                min = arrInt[i];
//            }
//        }
//        if(max+min <= limit) {
//            result += 1;
//        }
        /*
        위와 같은 방식으로 해보려 했으나 잘안됐음
        -> 최대 최소 접근 방식은 동일 -> 인덱스의 증가 감소로 표현
        * */
        int answer = 0;

        Arrays.sort(arrInt);

        int min = 0;

        for (int max = arrInt.length - 1; min <= max; max--){
            if (arrInt[min] +  arrInt[max] <= limit) min++;
            answer++;
        }

        return answer;

    }
}
