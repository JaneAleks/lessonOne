public class dz2 {

    public static void main(String[] args) {

        int lettersAll = 120, lettersSent = 34;
        int lettersRemaining = lettersAll - lettersSent;
        System.out.println("Осталось отправить " + lettersRemaining);


        int firstCount = 1, secondCount = 2;
        firstCount = firstCount + secondCount;
        secondCount = firstCount - secondCount;
        firstCount = firstCount - secondCount;
        System.out.println("ранее было 1, стало " + firstCount);
        System.out.println("ранее было 2, стало " + secondCount);

        int number = 32;
        int part1 = number %10;
        int part2 = number /10;
        int sum= part1 + part2;
        System.out.println(sum);

        //Чтобы перевести скорость движения из км/ч в м/с нужно:
        // значение скорости умножить на 1000 и разделить на 3600.

        int km_h = 120;
        int m_s = (km_h * 1000) / 3600;
        System.out.println(m_s);

    }
}
