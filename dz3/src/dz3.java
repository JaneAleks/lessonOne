public class dz3 {
    public static void main(String[] args) {
        int currentScoreValue = 60;
        if(currentScoreValue >= 90) {
            System.out.println("1 место");
        } else if(currentScoreValue < 80 && currentScoreValue > 90) {
            System.out.println("2 место");
        } else if (currentScoreValue < 70 && currentScoreValue > 99) {
            System.out.println("3 место");
        } else {
            System.out.println("0 место");

        }


        int num = (int)(Math.random()*490+10);
        if(num > 25 && num < 200) {
            System.out.println(num + " число содержиться в интервале (25,200)");
        } else {
            System.out.println(num + " число не содержиться в интервале (25,200)");}

        int x = 5;
        int y = -2;
        if(x > 0 && y > 0) {
            System.out.println("точка принадлежит первой четверти");
        } else if(x < 0 && y > 0) {
            System.out.println("точка принадлежит второй четверти");
        } else if(x < 0 && y < 0) {
            System.out.println("точка принадлежит третьей четверти");
        } else {
            System.out.println("точка принадлежит четвертой четверти");
        }

        int couponNumber = 3333;
        int resultSum = 1000;
        switch (couponNumber){
            case 1111 -> System.out.println(resultSum * 0.9);
            case 3333 -> System.out.println(resultSum * 0.8);
            case 5555 -> System.out.println(resultSum * 0.7);
            default -> System.out.println(resultSum);}

        int monthNumber =2;
        int isLeap = 2;
        if(isLeap == 1 ) {//високостный
            switch (monthNumber){
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 день");
                case 2 -> System.out.println("29 день");
                case 4, 6, 9, 11 -> System.out.println("30 день");
            }
        }else if(isLeap == 2) {// не високостный
           switch (monthNumber){
               case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 день");
               case 2 -> System.out.println("28 день");
               case 4, 6, 9, 11 -> System.out.println("30 день");
           }

        }






    }
}



