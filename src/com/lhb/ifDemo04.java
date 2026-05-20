package com.lhb;
import java.util.Scanner;
public class ifDemo04 {
    public static void main(String[] args) {
        /*
        需求:小明在每次订外卖都会在多家平台对比，看谁的优惠力度更大
        已知:
            饱了么App:全场9折优惠
            美单App:满30减10元
        请问1:小明买了一顿烧烤50元，在哪家下单更划算?
        请问2:如果价格不确定，数据由键盘录入而来呢?
        */

        //问题一:小明买了一顿烧烤50元，在哪家下单更划算?
        double price1 = 50;
        double baoLeMePrice1 = price1 * 0.9;
        double meiDanPrice1 = price1 >= 30 ? price1 - 10 : price1;
        if(price1 > 0) {
            if(baoLeMePrice1 < meiDanPrice1) {
                System.out.println("在饱了么App下单更划算");
            } else {
                System.out.println("在美单App下单更划算");
            }
        } else {
            System.out.println("价格有误");
        }

        System.out.println("------------------------------------------------");

        //问题二:如果价格不确定，数据由键盘录入而来呢?
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入价格：");
        double price2 = sc.nextDouble();
        double baoLeMePrice2 = price2 * 0.9;
        double meiDanPrice2 = price2 >= 30 ? price2 - 10 : price2;
        if(price2 > 0) {
            if (baoLeMePrice2 < meiDanPrice2) {
                System.out.println("在饱了么App下单更划算");
            } else {
                System.out.println("在美单App下单更划算");
            }
        } else {
            System.out.println("定义的价格有误");
        }
    }
}
