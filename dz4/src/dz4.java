import java.util.Scanner;
import java.util.Random;
public class dz4 {

    public static void main(String[] args) {

        int a = 2, b = 10, c = 0; //шаг, кол.циклов, число отсчета
        for (int i = 1; i <= b; i++){
            c +=a ;
            System.out.println(c);
        }


        int i = 555, sum = 0;
        while(i != 0){
            //Суммирование цифр числа
           sum += (i % 10);
            i /=10;
        }
        System.out.println(sum + " ");



        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num = random.nextInt(9);c
        System.out.println("Введите число");
        int num3;
        while (true) {
            num3 = scanner.nextInt();
            if (num < num3) {
                System.out.println("Меньше");
            } else if (num == num3) {
                System.out.println("Успех");
                break;
            } else if (num == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Больше");

            }


        }    }
}
