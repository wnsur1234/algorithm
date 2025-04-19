package com.inflean.poly.pay0;

public class PayService {

    public void processPay(String option, int amount) {
        WhatPay whatPay = new WhatPay();
        whatPay.WhatPayMethod(option, amount);
    }

}
