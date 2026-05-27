package com.lhb;

import java.util.Scanner;

public class ifDemo08 {
    public static void main(String[] args) {

        //键盘录入身高和体重
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的身高（单位为m）：");
        double height = sc.nextDouble();
        System.out.print("请输入您的体重（单位为kg）：");
        double weight = sc.nextDouble();

        //计算BMI
        double bmi = weight / (height * height);
        System.out.printf("您的BMI为：%.1f%n", bmi);

        //根据判断身体状态和健康风险
        if (bmi < 18.5) System.out.println("您的身体状态为消瘦，健康风险为部分增加。");
        else if (bmi <= 23.9) System.out.println("您的身体状态为正常，健康风险为正常。");
        else if (bmi <= 26.9) System.out.println("您的身体状态为偏胖，健康风险为增加。");
        else if (bmi <= 29.9) System.out.println("您的身体状态为肥胖，健康风险为中度增加。");
        else System.out.println("您的身体状态为严重肥胖，健康风险为严重增加。");
    }
}
