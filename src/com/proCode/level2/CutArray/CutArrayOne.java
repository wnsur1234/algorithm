package com.proCode.level2.CutArray;

import java.util.Arrays;
import java.util.Scanner;

/*
지금 풀어봤는데 결국 시간복잡도에서 탈락.....
* */
public class CutArrayOne {
    public static void main(String[] args) {
        /*
        (n,r,L)이 주어졌을 때 n의 이차원 배열 [n][n]이 주어지고
        해당 배열 안의 값은 i = {1,2,...,}의 수로 각 `행과 열`에 맞게 채운다.
        ex) n = 3 -> int [n][n] -> int [3][3] => [1][2][3] [2][2][3] [3][3][3]

        생각해보기
        1. 접근 -> 2차원으로 해야하나?
        2. 자료구조 or 알고리즘? -> 알고리즘인거같음
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n,r,l : ");
        // 여기서 옛날에 뭐 빈 엔터? 그게 들어있어서 nextLine인지 nextInt인지 할때 빈 sc.nextLine() 하라고 했는데
        // 그 경우는 언제인지 왜 하는건지
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();

        int[] result = cutArray(n,r,l);
        System.out.println(Arrays.toString(result));
    }

    // 결과 값 반환
    public static int[] cutArray(int n, int r, int l) {
        // 여기서 이렇게 배열의 크기 선언 따로 안하고
        // 값을 넣어도 되나? 안되지 않나? 그러면 r과 l사이의 배열값 넣을꺼니까 그냥 그 차이를 지정해야하나?
        int[] result = new int[(r-l)+1];
        int[][] arr = new int[n][n];
        int[] changeArr = new int[n*n];
        // 초기화 되지 않게 바깥에 선언
        int k =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((i+1)>(j+1)){
                    arr[i][j] = i+1;
                }else{
                    arr[i][j] = j+1;
                }
                changeArr[k] = arr[i][j];
                k++;
            }
        }
        System.out.println(k);
        for(int i= 0; i<(r-l)+1; i++){
            result[i] = changeArr[l+i];
        }
        return result;
    }

}
