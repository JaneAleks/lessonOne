package Dz6;

import java.util.Scanner;

public class Dz0601 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();

            String revers = new StringBuilder(string).reverse().toString();

            System.out.println(string.equalsIgnoreCase(revers));
    }
}
