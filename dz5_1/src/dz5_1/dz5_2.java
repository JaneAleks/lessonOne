package dz5_1;

import java.util.Scanner;
/*Создать два массива целых чисел на 5 элементов каждый.
Массивы необходимо заполнять значениями в цикле. Значения вводит пользователь с клавиатуры.
.1 Если число отрицательное, добавить его в первый массив.
.2 Если число положительное, добавить его во второй массив.
.3 Программа завершает работу, когда оба массива заполнены или, если пользователь ввёл 0
*/

public class dz5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5]; // положительный
        int[] b = new int[5]; // отриц
        int c = 0; // положительный
        int d = 0; // отриц
        while (true){
        System.out.println("Введите число");
        int num = scanner.nextInt();
        if (num < 0) {
            a[c] = num;
            if (c < 5) c++;
            System.out.println("Массив отрицательный");
        } else if (num > 0) {
            b[c] = num;
            if (d  < 5) d++;
            System.out.println("Массив положительный");
        } else if (num == 0) {
            System.out.println("Выход");
            break;
        }

    } }}