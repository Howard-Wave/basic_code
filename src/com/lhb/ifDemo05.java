package com.lhb;

import java.util.Scanner;

public class ifDemo05 {
    public static void main(String[] args) {
        /*
        卡拉兹函数(Collatzfunction)定义如下:
        给定正整数n，
            若n为奇数，则f(n)=3n+1
            若n为偶数，则f(n)=n/2
        示例1:
            输入:1
            说明:奇数，3 * 1 + 1 = 4
            输出:4
        示例2:
            输入:2
            说明:偶数，2 * / 2 = 1
            输出:1
         */

        //键盘录入一个正整数n
        Scanner sc = new Scanner(System.in);
        System.out.print("输入：");
        double n = sc.nextDouble();

        //对n的奇偶性进行判断
        if(n > 0 && n % 1 == 0) {
            if((n + 1) % 2 == 0) {
                int m = (int)(3 * n + 1);
                System.out.printf("说明：奇数，f(n)=3n+1=3*%.0f+1=%d%n", n, m);
                System.out.println("输出：" + m);
            } else {
                int m = (int)n / 2;
                System.out.printf("说明：偶数，f(n)=n/2=%.0f/2=%d%n", n, m);
                System.out.println("输出：" + m);
            }
        } else {
            System.out.println("输入的n不是正整数");
        }
    }
}
