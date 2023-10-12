package dz5_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*Заполните массив на `len` элементов (размер массива вводит пользователь) случайным целыми числами и выведете
максимальное, минимальное и среднее арифметическое значение элементов массива.
*/
public class dz5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int numMas= scanner.nextInt();
        int [] len = new int [numMas];
        int i = 0;

        while (len .length > i) {
            int num = random.nextInt(90) ;
            if  (num>0 && num%2==0){

            len[i] = num;
            i++;}
        }
        System.out.println("Числа в массиве " + Arrays.toString(len));
        Arrays.sort(len);
        System.out.println("Числа в массиве по порядку" + Arrays.toString(len));
        System.out.println("Минимальное " + len [0]);
        System.out.println("Максимальное " + len[len.length-1]);

        int middle = 0;
        for(int mid = 0; mid  < len .length; mid ++) {
            middle += len[mid];
        }
        middle /= len.length;
        System.out.println("Среднее " + middle);
        }
    }







