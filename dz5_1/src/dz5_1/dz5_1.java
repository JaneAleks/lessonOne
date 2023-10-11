package dz5_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class dz5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] a = new int[15];
        int i = 0;
        while (a.length > i){
            int num = random.nextInt(90)+10;
            if (num > 11 && num <101 && num % 2 == 0){
                a[i] = num;
                i++;

            }
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));



    }

    }


