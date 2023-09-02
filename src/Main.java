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
        boolean oldVersion = clientDeviceYear < 2015;

        switch (clientOS) {
            case 0:
                if (oldVersion) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (oldVersion) {
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

        System.out.println("\nЗадание 4");

        int deliveryDistance = 95;
        int deliveryDays = 1;
        char result = 0;

        if (deliveryDistance < 20) {
            result = 'a';
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            result = 'b';
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            result = 'c';
        }
        switch (result) {
            case 'a':
                System.out.println("Потребуется дней: " + deliveryDays);
                break;
            case 'b':
                deliveryDays++;
                System.out.println("Потребуется дней: " + deliveryDays);
                break;
            case 'c':
                deliveryDays++;
                deliveryDays++;
                System.out.println("Потребуется дней: " + deliveryDays);
                break;
            default:
                System.out.println("Свыше 100 км доставки нет");
        }

        System.out.println("\nЗадание 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1, 2, 12 :
                System.out.println("Зима");
                break;
            case 3, 4, 5 :
                System.out.println("Весна");
                break;
            case 6, 7, 8 :
                System.out.println("Лето");
                break;
            case 9, 10, 11 :
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
            }
        }