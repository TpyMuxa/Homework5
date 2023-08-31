public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадание 1");

        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Приложение банка работает только на iOS или Android");
        }

        System.out.println("\nЗадание 2");

        int clientDeviceYear = 2015;

        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Приложение банка работает только на iOS или Android");
        }

        System.out.println("\nЗадание 3");

        int year = 2021;
        boolean leapYear = (year > 1584 && (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));

        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }
}