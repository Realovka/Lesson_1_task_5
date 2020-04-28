package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();

        System.out.println("Введите второе число");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        System.out.println("Введите третье число");
        Scanner scan3 = new Scanner(System.in);
        int c = scan3.nextInt();

        if ((a > 0 & b > 0 & c > 0) & (a != 0 & b != 0 & c != 0)) {
            System.out.println("Количество положительных чисел  3, количество отрицательных 0");
        } else if ((a > 0 & b > 0 & c < 0) || (a > 0 & b < 0 & c > 0) || (a < 0 & b > 0 & c > 0)) {
            System.out.println("Количество положительных чисел  2, количество отрицательных 1");
        } else if ((a > 0 & b < 0 & c < 0) || (a < 0 & b < 0 & c > 0) || (a < 0 & b > 0 & c < 0)) {
            System.out.println("Количество положительных чисел  1, количество отрицательных 2");
        } else if ((a < 0 & b < 0 & c < 0)) {
            System.out.println("Количество положительных чисел 0, количество отрицательных 3");
        } else if ((a > 0 & b < 0 & c == 0) || (a == 0 & b > 0 & c < 0) || (a < 0 & b == 0 & c > 0)) {
            System.out.println("Количество положительных чисел  1, количество отрицательных 1, одно число равно нулю");
        } else if ((a > 0 & b > 0 & c == 0) || (a == 0 & b > 0 & c > 0) || (a > 0 & b == 0 & c > 0)) {
            System.out.println("Количество положительных чисел  2, количество отрицательных 0, одно число равно нулю");
        } else if ((a < 0 & b < 0 & c == 0) || (a < 0 & b == 0 & c < 0) || (a == 0 & b < 0 & c < 0)) {
            System.out.println("Количество положительных чисел  0, количество отрицательных 2, одно число равно нулю");
        } else if ((a == 0 & b == 0 & c > 0) || (a == 0 & b > 0 & c == 0) || (a > 0 & b == 0 & c == 0)) {
            System.out.println("Количество положительных чисел  1, количество отрицательных 0, два число равны нулю");
        } else if ((a == 0 & b == 0 & c < 0) || (a == 0 & b < 0 & c == 0) || (a < 0 & b == 0 & c == 0)) {

            System.out.println("Количество положительных чисел  0, количество отрицательных 1, два число равны нулю");
        } else {

            System.out.println("Положительных и отрицательных чисел нет, все три числа равны нулю");
        }
    }
}
