package com.inflean.poly.sender;

public class FaceBookSender implements Sender{
    Sender sender;
    @Override
    public void sendMessage(String a){
        System.out.println("페이스북에 발송 합니다. : "+ a);
    }
}
