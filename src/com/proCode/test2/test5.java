package com.proCode.test2;

import java.util.Arrays;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
     /*
     * 문제  정수로이루어진 배열 members
     * 각 원소에대하여 자신보다 크면서가까운 수 = 뒷큰수라고함
     * 이때, members가 주어지고 각 원소들에 대하여 뒷큰수들을 차례로 담고
     * 뒷 큰수가 존재 하지 않으면 -1을 담음
     *
     * 제한사항 4 <= numbers.length <= 1,000,000
     *             1 <=numbers[i] <= 1,000,000
     * */
        Scanner sc = new Scanner(System.in);
        String n  = sc.nextLine();
        String[] nums = n.split(",");
        int[] numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        solution(numbers);

    }
    private static void solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    answer[i] = (numbers[j]);
                    break;
                } else{
                    answer[i] = -1;
                }
            }
        }
        answer[numbers.length-1] = -1;
        System.out.println(Arrays.toString(answer));
    }
}


