package com.inflean.final1;

import com.inflean.generic.animal.Animal;
import java.io.FileReader;
import java.util.Scanner;

public class ConstructInit {
    // 이것은 쓸때 마다 value 공간을 할당하는데 어차피 10이라 불필요 공간 생성됨
    final int value = 10;

    // 이거 처럼 static영역에 final을 사용하여 상수로 지정 해주는것이 생성 했을 때 지속적으로 가지고 있음
    static final  int CONST_VALUE = 10;
    // 주로 public을 많이 쓴다.

}
