package lesson2;

public class Arithmetic {
    public static void main(String[] args) {

        int x = 20, y = -1;
        int result = x + y; //19

        byte var01 = 89, var02 = 11;
        int byteResult = var01 + var02;
        byte byteResult02 = (byte)  (var01 + var02);

        double bill = 500;
        double halfBill = bill / 2;
        System.out.println(halfBill);

        int number = 101, divisor = 10;
        int withoutLastDigit = number / divisor;
        System.out.println(withoutLastDigit);

        int n = 40;
        long m = 100L;
        long nmResult = n * m;
        System.out.println(nmResult);

        number = 9;
        divisor = 2;
        int evenOddResult = number % divisor; //1
        System.out.println(evenOddResult);

        var var1 = 60L;
        var var2 = -20;
        var var3 = 10.0;
        var varResult = var1 + var2 + var3;
        System.out.println(varResult); // double

        int num = 10;
        num = num + 10;
        System.out.println(num);



        int lettersAll = 120, lettersSent = 34;
        int lettersRemaining = lettersAll - lettersSent;
        System.out.println(lettersRemaining);


        int firstCount = 1, secondCount = 2;
        firstCount = firstCount + secondCount;
        secondCount = firstCount - secondCount;
        firstCount = firstCount - secondCount;
        System.out.println(firstCount);
        System.out.println(secondCount);


        int Math.random() *51 +50;







    }
}
