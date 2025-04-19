package com.inflean.list.ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        {
            List<Integer> students = new ArrayList<>();
            students.add(90);
            students.add(80);
            students.add(70);
            students.add(60);
            students.add(50);
            int total = 0;
            for (Integer student : students) {
                total += student;
            }

            double average = (double) total / students.size();
            System.out.println("점수 총합: " + total);
            System.out.println("점수 평균: " + average);
        }
    }
}
