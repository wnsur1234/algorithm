package com.proCode.level2;

import java.util.Scanner;

public class MoveMinLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
    private static void solution(int n) {
        int result = 0;

        while(true) {
            if(n==1){
                result = 1;
                break;
            }else if(n==2){
                result += 1;
                break;
            }else if(n == 3){
                result += 2;
                break;
            }
            if(n%2 != 0) {
                result += n%2;
            }
            n=n/2;
        }
        System.out.println(result);
    }
}
