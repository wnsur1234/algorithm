package com.proCode.level2.CutArray;

import java.util.Arrays;
import java.util.Scanner;

public class CutArrayTwo {
    // 시간 복잡도에 의해서 재도전
    // 풀었는데 최종적으로 그냥 Long 타입으로 해야 범위를 안 벗어남
    public static void main(String[] args) {
        // 일차원 배열로 풀어야한다.!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n,r,l : ");
        int n = sc.nextInt();
        long l = sc.nextLong();
        long r = sc.nextLong();

        int[] result = cutArray2(n,l,r);
        System.out.println(Arrays.toString(result));
    }
    public static int[] cutArray2(int n, long l, long r) {
        int between = (int)((r-l)+1); // 4 : 2,3,4,5
        int[] result = new int[between];
        int k = 0;
        for(long i = l;i<=r;i++){ // 2,3,4,5 < 6
            if(i/n > i%n){
                result[k] = (int)(i/n+1);
                k++;
            }else{
                result[k] = (int)(i%n+1);
                k++;
            }
        }
        return result;
    }
}
