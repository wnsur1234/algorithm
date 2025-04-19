package com.proCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println(solution(r1, r2));
    }
    public static int solution(int r1,int r2){
        int answer = 8;
        List<int[]> list = new ArrayList<>();
        // 경우의 수 1사분면만
        //r1 = 2, r2 = 3 일때, (1,2) (2,1) (2,2) 단 (r1,0)의 경우의 수 는 제외 =3*4 = 12
        //r1 = 2, r2 = 4 일때, (1,2) (1,3) (2,1)(2,2)(2,3) (3,1)(3,2)(3,3)
        // 즉 r1이 x라고 할때 x값 0 < x < y=r2 이고 x값이 r1보다 작을 때는 y값또한 r1보다 커야함
        for (int i = 0; i <= r2; i++) {
            for (int j = 0; j <= r2; j++) {
                //list.add(new int[][]{});
            }
        }
        System.out.println(list);

        return answer;
    }
}
