package com.proCode;

import javax.swing.plaf.BorderUIResource;
import java.util.Scanner;

public class test3 {
    /*
     * 양의 정수 x가 햐사드 수이려면 x의 자릿수으로 x가 나누어져야함
     * ex) 18햐사드수 = 1+8=9,18/9로 나누어 떨어짐
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean result = solution(x);
    }

    private static boolean solution(int x) {
        int answer=  x/10+x%10;
        boolean num = true;
        if(x%answer==0){
            return num;
        }else{
            return !num;
        }
    }
}
