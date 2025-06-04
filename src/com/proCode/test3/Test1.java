// package com.proCode.test3;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Scanner;
//
//public class Test1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] board = sc.nextLine().split(",");
//        int result = solution(board);
//        System.out.println(result);
//    }
//
//    private static int solution(String[] board) {
//        String[] answer = new String[board.length];
//        for (int i = 0; i < board.length; i++) {
//            answer[i] = Arrays.toString(board[i].split(" "));
//        }
//        int res = 0;
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = i + 1; j < answer.length; j++) {
//                if (answer[i].equals(answer[j])) {
//
//                }
//            }
//        }
//
//    }
//}
