package com.lhb;

import java.util.Scanner;

public class ifDemo06 {
    public static void main(String[] args) {
        /*
        需求:很多App都有不同的优惠券
        假设，现在有以下优惠券
            全场商品满10减8
            全场商品满50减30
            全场商品满100减50
            全场商品满200减90
            会员卡:全场8折
        请问:会员卡和优惠券不能同时使用，最优惠的价格是多少?
         */

        //定义商品价格
        System.out.print("请输入商品价格：");
        double price = new Scanner(System.in).nextDouble();

        double coupon1 = 0;
        double coupon2 = 0;
        if (price > 0) {
            //计算在使用优惠券的情况下，可以减免多少钱
            if (price < 10) coupon1 = 0;
            else if (price < 50) coupon1 = 8;
            else if (price < 100) coupon1 = 30;
            else if (price < 200) coupon1 = 50;
            else coupon1 = 90;
            System.out.println("优惠券可以减免：" + coupon1);
            System.out.println("使用优惠券后的实际价格为：" + (price - coupon1));
            System.out.println("------------------------------------------------");

            //计算在使用会员卡的情况下，可以减免多少钱
            if (price > 0) coupon2 = price * 0.2;
            System.out.println("会员卡可以减免：" + coupon2);
            System.out.println("使用会员卡后的实际价格为：" + (price - coupon2));
            System.out.println("------------------------------------------------");
        } else System.out.println("价格有误");

        //计算实际价格
        double realPrice = (price - coupon1) > (price - coupon2) ? (price - coupon2) : (price - coupon1);
        System.out.println("最优惠的价格为：" + realPrice);
    }
}
