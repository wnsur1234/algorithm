package com.proCode.level2;

import java.util.Scanner;

public class MakeMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        String A = sc.nextLine();
        String B = sc.nextLine();

        //solution(nA, nB);
    }

    private static void solution(int[] nA, int[] nB) {
        min(nA);
    }

    private static void min(int[] nA) {
        int min = nA[0];
        for (int i = 0; i < nA.length; i++) {
            if(nA[i] < min){

            }
        }
    }
}
