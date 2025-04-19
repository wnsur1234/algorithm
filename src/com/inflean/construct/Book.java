package com.inflean.construct;

import javax.xml.namespace.QName;

public class Book {

    String title;
    String author;
    int page;

    //TODO 코드를 완성하시오.
    Book(){
//        this.title ="";
//        this.author="";
        this("","",0);
    }
    Book(String title,String author){
        this(title,author,0);
    }
    Book(String title,String author,int page){
        this.title = title;
        this.author = title;
        this.page = page;
    }

    void displayInfo(){
       System.out.println("제목 : "+title +"저자 :"+author+"페이지 : "+page);
   }
}
