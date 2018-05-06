package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        float i;
        float o;
        float p;
        System.out.println("Введите первое число");
        i = sc.nextFloat();
        System.out.println("Вы ввели число" + i);
        System.out.println("Введите второе число");
        o = sc.nextFloat();
        System.out.println("Вы ввели число" + o);
        p=i+o;
        System.out.println("Сумма равна" +p);

    }
}
