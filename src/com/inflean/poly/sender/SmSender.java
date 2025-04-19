package com.inflean.poly.sender;

public class SmSender implements Sender {

    @Override
    public void sendMessage(String a) {
        System.out.println("SMS를 발송 합니다. : "+ a);
    }
}
