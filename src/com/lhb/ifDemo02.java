package com.lhb;

import java.util.Scanner;

public class ifDemo02 {
    public static void main(String[] args) {
        /*
        需求：初始最大生命值200，受到X点伤害，技能恢复Y点血，X和Y由键盘录入
        假设：人物不会死亡，最少1点血
        提问：最终人物血量是多少？
         */

        Scanner sc = new Scanner(System.in);
        //定义人物的初始血量为200
        int Hp = 200;

        //键盘录入一个X表示受到的伤害
        System.out.print("请输入伤害值：");
        int X = sc.nextInt();

        //计算当前人物生命值
        Hp = Hp - X;
        if(Hp <= 0) {
            Hp = 1;
        }
        System.out.println("当前生命值为：" + Hp);

        //键盘录入一个Y表示技能恢复的血量
        System.out.print("请输入恢复值：");
        int Y = sc.nextInt();

        //计算当前人物生命值
        Hp = Hp + Y;
        if(Hp >= 200) {
            Hp = 200;
        }
        System.out.println("当前生命值为：" + Hp);
    }
}
