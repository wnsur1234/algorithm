package com.inflean.list.ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class ShoppingCart  {
    ArrayList<Item> list =  new ArrayList<>();

    public void addItem(Item items){
        list.add(items);
    }
    public void displayItems(){
        System.out.println("장바구니 상품 출력");

        for (Item item : list) {
            System.out.println("상품명 : "+item.getName()+", 합계 : "+item.getTotalPrice());

        }
        int totalPrice = 0;
        for (Item item : list) {
            totalPrice += item.getTotalPrice();
        }
        System.out.println("전체 가격 합 : "+totalPrice);
//        name = item.getName();
//        addtotal = item.getTotalPrice();
//        System.out.println("상품명 : "+name+", 합계 : "+addtotal)
//        System.out.println("장바구니 상품 출력");
//        System.out.println("상품명 : "+item.getName()+item.getTotalPrice());
//        for (int i = 0; i < list.size(); i++) {
//            int sum = 0;
//            num += list.get(i);
//            System.out.println(sum);
//        }
    }
}
