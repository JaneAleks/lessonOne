package Dz6;

import java.util.Scanner;

public class Dz0601 {
    public static void main(String[] args) {
        String string1 = "level";
        String string2 = "hvsdjvh";

        String revers1 = new StringBuilder(string1).reverse().toString();
        String revers2 = new StringBuilder(string2).reverse().toString();

        System.out.println(string1.equalsIgnoreCase(revers1));
        System.out.println(string2.equalsIgnoreCase(revers2));
    }
}
