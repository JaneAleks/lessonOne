package lesson2;

public class DataTypes {

    public static void main(String[] args) {
        //точка ввода в приложение
        System.out.println("Консольный метод");

        int year0Birth;
        int lenght, height;

        year0Birth = 1990;
        lenght = 20;
        height = 12;

        year0Birth = 2000;

        int numberOfPears = 10;
        int numberOfApples = 30, numberOfBananas = 40;

        numberOfBananas = 100;

        System.out.println("numberOfApples");
        System.out.println("numberOfBananas");

        // примитивные типы данных
        // сылочные типы данных

        byte readByte = 56;
        short userAge = 35;
        long temp = 12, planetAge = 400_000_000_000L;
        // l и L явно указывают на тип  long
        System.out.println(planetAge);

        float outsideTemp = -12.5F, catAge = 4.5F;
        // f и F явно указывают на тип  float
        double weight = 200.5;

        System.out.println(outsideTemp);

        boolean isActive = true;
        boolean isConnected = false;
        System.out.println(isActive);

        char aLetter = 'a';
        System.out.println(aLetter);

        int numberOfStones01 = 12_000;
        long numberOfStones02 = numberOfStones01;
        System.out.println(numberOfStones01);
        System.out.println(numberOfStones02);

        int distance = 1000;
        byte smallDistance = (byte) distance;
        //явное проведение если уменьшение контейнера.. на увел пройдет и так
        System.out.println(smallDistance);

       // обьявление переменных через var
        // начиная с Java

        var version = 10;   // int
        var bigNumber = 10L;  // long
        var connected = true; // boolean
        var balance = 4000.8; //double
        var numberOfHours = 50.5F; // float
        var price = (short) 290; // short
        // только через приведение скобки (short) (bait)

    }
}
