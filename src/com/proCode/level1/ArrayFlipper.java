package com.proCode.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayFlipper {

    public static void main(String[] args) {
        arrayFlipper();
        // 이문제는 n의 값을 연속된 숫자로 받고 그걸 배열로 변환해야함으로
        // hash를 써야함
    }

    private static void arrayFlipper() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        System.out.println("Enter n's result");
        String n = sc.nextLine();
        array.add(Arrays.toString(n.toCharArray()));
        System.out.println(array);

        for (int i = array.size()-1; i >=0 ; i--) {
            array2.add(array.get(i));
        }
        System.out.println(array2);
    }
}
