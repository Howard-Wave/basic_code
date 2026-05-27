package com.lhb;

import java.util.Scanner;

public class ifDemo07 {
    public static void main(String[] args) {

        //键盘录入一个数作为储值卡充值金额
        System.out.print("请输入充值金额：");
        double money = new Scanner(System.in).nextDouble();

        //充值不同的金额可以获得的赠送金额
        double coupon = 0;
        if (money > 0) {
            if (money < 1000) coupon = 0;//充值不足1000元，无法获得赠送金额
            else if (money < 2000) coupon = 200;//充值1000-1999元，赠送200元
            else if (money < 3000) coupon = 500;//充值2000-2999元，赠送500元
            else if (money < 5000) coupon = 700;//充值3000-4999元，赠送700元
            else if (money < 10000) coupon = 1300;//充值5000-9999元，赠送1300元
            else if (money < 20000) coupon = 2500;//充值10000-19999元，赠送2500元
            else if (money < 50000) coupon = 6000;//充值20000-49999元，赠送6000元
            else coupon = 15000;//充值50000以上，赠送15000元
        } else {
            System.out.println("充值金额有误");
        }
        System.out.println("卡里余额为：" + (money + coupon));
    }
}
