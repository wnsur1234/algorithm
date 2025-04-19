package com.inflean.list;

import com.sun.security.jgss.GSSUtil;

public class BatchProcessor {
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }
    public void logic(int size){
        long stratTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : "+size+", 계산시간 : "+(endTime - stratTime)+"ms");
    }
}
