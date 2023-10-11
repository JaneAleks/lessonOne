package dz5_1;

import java.util.Scanner;

public class dz5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[5];
        int [] b = new int[5];
        System.out.println("Введите число");
        int num = scanner.nextInt();
        if (num < 0){
            System.out.println("Массив отрицательный");
    } else if (num > 0) {
            System.out.println("Массив положительный");
        } else (num == 0){
            System.out.println("Выход");
    }

}