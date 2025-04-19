package com.inflean.poly.pay0;

public class WhatPay {

    HowtoPay result;
    public WhatPay() {
    }
    public void WhatPayMethod(String option, int amount){
        if (option.equals("kakao")) {
            result = new KakaoPay();
            result.pay(option, amount);
        } else if (option.equals("naver")) {
            result = new NaverPay();
            result.pay(option, amount);
        } else if (option.equals("bad")) {
            System.out.println("결제 수단이 없습니다.");
            System.out.println("결제가 실패했습니다.");
        } else if (option.equals("new")){
            result = new NewPay();
            result.pay(option, amount);
        }
    }
}
