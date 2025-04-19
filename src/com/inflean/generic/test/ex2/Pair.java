package com.inflean.generic.test.ex2;

public class Pair<I,T> {
    private I i;
    private T data;

    @Override
    public String toString() {
        return "Pair{" +
            "i=" + i +
            ", data=" + data +
            '}';
    }

    public void setFirst(I i) {
        this.i=     i;
    }

    public void setSecond(T data) {
        this.data = data;
    }

    public I getFirst() {
        return i;
    }

    public T getSecond() {
        return data;
    }
}
