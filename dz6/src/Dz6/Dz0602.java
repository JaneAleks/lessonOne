package Dz6;

import java.util.Arrays;
import java.util.Scanner;

public class Dz0602 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = "Dog";
        String string2 = "God";

        boolean areAnagrams = Arrays.equals(
                string2 .toLowerCase().chars().sorted().toArray(),
                string1 .toLowerCase().chars().sorted().toArray());

        System.out.println(areAnagrams);;
    }
}
