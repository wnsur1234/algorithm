package com.inflean.arrayList;

import java.util.Arrays;

public class myArrayList {
    private static  final int DEAFAULT_CAPACITY = 5;

    private Object[] elementData;
    private  int size = 0;

    public myArrayList(){
        elementData = new Object[DEAFAULT_CAPACITY];
    }
    public myArrayList(int initialCapacity){
        elementData = new Object[initialCapacity];
    }
    public int size(){
        return size;
    }
    public void add(Object e){
        elementData[size] = e;
        size++;
    }
    public Object get(int index){
        return elementData[index];
    }
    public Object set(int index, Object element){ // setting
        Object oldValue = get(index); // set메서드는 해당 인덱스에 설정하는 것인데 기존 값은 꺼낸다
        elementData[index] = element;
        return oldValue;
    }
    public  int indexOf(Object o){ //배열의 오브젝트를 찾는거
        for (int i = 0 ; i<size; i++){
            if(o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }
    public String toString(){
        // [1,2,3,null,null] // size = 3
        // [1,2,3] // size =3

        return Arrays.toString(Arrays.copyOf(elementData, size))+
            "size = "+ size +", capacity = "+elementData.length;
    }
}
