package com.proCode.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LeastMultiple {
    public static void main(String[] args) {
        /*
        * 두 수의 최소공배수(Least Common Multiple)란
        * 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
        * 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서,
        * n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
        * n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
        * 제한사항 : 1<= arr <= 15
        *           a<= 100
        * ex) arr : [2,6,8,14] result : 168
        *           [1,2,3] result : 6
        * */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(",");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.println(Arrays.toString(arr));
        int result = solution(arr);
        System.out.println(result);
    }

    private static int solution(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int i = 1;
        while(true) {
            for (int j : arr) {
                System.out.println(j);
                // 각요소에 같은 값을 곱하여 set에 추가함
                set.add(j * i);
            }
            // 근데 set의 특성상 중복을 허용하지 않기 때문에
            // 같은 값을 추가할 경우 그 값만 남아 있을 것
            // 따라서 최소공배수인 각 요소에 곱한 값이 똑같다면 size는 1일거라 생각
            if (set.size() == 1) {
                break;
            } else {
                // 그랬는데 1이 아니라면 set자체를 아예 비우고 다음 곱해지는 요소를 +1하여 다시 set에 추가하기 위함
                set.clear();
                i++;
            }
            System.out.println(i);
        }
        // j*i의 값 즉 현재 최소공배수로 add 된 값 예상
        return set.hashCode();
    }
}
