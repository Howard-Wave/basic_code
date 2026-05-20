package com.lhb;

public class ifDemo03 {
    public static void main(String[] args) {
        /*
        需求：定义一个小数表示考试成绩
        判断学生的考试成绩，如果大于等于60分输出通过，否则不通过
         */

        //定义一个小数表示考试成绩
        double score = 59.9;

        //判断
        if(score >= 0 && score <= 100) {
            if(score >= 60) {
                System.out.println("通过");
            } else {
                System.out.println("未通过");
            }
        } else {
            System.out.println("输入的分数有误");
        }
    }
}
