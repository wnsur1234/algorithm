package com.inflean.generic.test.ex1;

import org.w3c.dom.ls.LSOutput;

public class Container<T> {
    T a;
    public boolean isEmpty() {
        // T타입이 아닌 불린 형으로 변환하고
        // return null; 이건 안되고
        return a == null; // 이렇게 해야 null값일 때 true  반환
    }

    public void setItem(T data1) {
        this.a = data1;
    }
    public T getItem() {
        return a;
    }

}
