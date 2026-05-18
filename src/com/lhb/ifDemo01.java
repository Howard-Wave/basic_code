package com.lhb;

public class ifDemo01 {
    public static void main(String[] args) {
        /*
        定义一个变量表示人的体温，当体温超过38°时，提示人已经发烧
         */

        // 定义变量
        double temp = 37.5;

        // 判断
        if(temp > 38) {
            System.out.println("已经发烧");
        } else {
            System.out.println("没有发烧");
        }
    }
}
