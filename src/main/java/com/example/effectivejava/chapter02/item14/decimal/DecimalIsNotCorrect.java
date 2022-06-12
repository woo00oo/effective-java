package com.example.effectivejava.chapter02.item14.decimal;

import java.math.BigDecimal;

public class DecimalIsNotCorrect {

    public static void main(String[] args) {
        int i = 1;
        double d = 0.1;
        System.out.println(i - d * 9);

        /**
         * BigDecimal을 통해 보다 정확히 계산.
         */
        BigDecimal bd = BigDecimal.valueOf(0.1);
        System.out.println(BigDecimal.valueOf(1).min(bd.multiply(BigDecimal.valueOf(9))));
    }
}
