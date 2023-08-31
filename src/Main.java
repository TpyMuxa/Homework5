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
    }
}