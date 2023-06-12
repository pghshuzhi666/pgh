package com.xing.method.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);
        boolean falg=true;
         while (falg) {
            System.out.println("请输入需要计算的第一个数字");
            double a = scanner.nextDouble();
            System.out.println("请输入需要计算的第二个数字");
            double b = scanner.nextDouble();
            int pd = 1;
            while (pd == 1) {
                System.out.println("请输入运算符：+,-,*,/");
                String operator = scanner.next();
                switch (operator) {
                    case "+":
                        System.out.println("a" + "+" + "b的" + "和为:" + (a + b));
                        pd = 0;
                        break;
                    case "-":
                        System.out.println("a" + "-" + "b的" + "差为:" + (a - b));
                        pd = 0;
                        break;
                    case "*":
                        System.out.println("a" + "*" + "b的" + "积为:" + (a * b));
                        pd = 0;
                        break;
                    case "/":
                        System.out.println("a" + "/" + "b的" + "商为:" + (a / b));
                        pd = 0;
                        break;
                    default:
                        System.out.println("符号输入错误,请重新输入");
                }
            }
            boolean falg2 = true;
            while (falg2) {
                System.out.println("是否继续使用? " + "YES/NO");
                String choose = scanner.next();
                if (choose.equals("YES")) {
                    System.out.println("继续使用");
                    break;
                } else if (choose.equals("NO")) {
                    System.out.println("欢迎下次使用，再见");
            return;

                } else {
                    System.out.println("输入不正确，请重新输入");
                }
            }
         }
    }
}

