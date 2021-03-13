package com.company;

import java.lang.Math;

import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("введите диапазон рандомных чисел");
        int coef = in.nextInt();
        int repeat = 0;
        float sum = 0;
        int num = 0;
        int num2 = coef + 1;
        int arf;
        int temp = 0;
        int temp2 = 0;
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * coef);
            System.out.print(array[i] + ", ");
        }

        for (int j : array) {
            if (num2 > j) {
                num2 = j;
            }
            sum += j;
            num++;
        }
        arf = Math.round(sum/num);
        for (int j : array) {
            if (num2 == j) {
                repeat++;
            }
        }
        for (int numm : array) {
            if (num2 == numm) {
                temp ++;
            }
            if (temp == repeat) {
                array[temp2] = arf;
                break;
            }
            temp2 ++;
        }
        System.out.println("----");
        System.out.println(arf);

            for (int numm2 : array) {
                System.out.print(numm2 + ", ");
            }

    }
}
