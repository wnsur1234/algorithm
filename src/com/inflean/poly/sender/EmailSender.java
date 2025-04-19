package com.inflean.poly.sender;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String a) {
        System.out.println("메일을 발송 합니다. : " + a);
    }
}
