package com.inflean.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        // ex1();
        ex2();
    }
    private static void ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요.(종료 0)");
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            list.add(n);
        }
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i)+", ");
        }
        System.out.println(list.getLast());
    }

    private static void ex2() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int num = 0;
        System.out.println("n개의 정수를 입력하세요.(종료 0)");
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            list.add(n);
        }
        for (int i = 0; i < list.size(); i++) {
             num += list.get(i);
        }
        System.out.println("입력한 정수의 합계 : "+num);
        System.out.println("입력한 정수의 평균 : "+(double)num/list.size());
    }
}
