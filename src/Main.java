import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        printYear(2022);

        System.out.println("Задание 2");
        printPhone(0, 2022);

        System.out.println("Задание 3");
        deliversCard(200);


    }

    public static void printYear(int years) {

        if (isYears(years)) {
            System.out.println(years + " год является високосным");
        } else {
            System.out.println(years + " год не является високосным");
        }
    }

    public static boolean isYears(int years) {
        return years % 4 == 0 && years % 100 != 0 || years % 400 == 0;
        //alt + shift + enter когда помогает?? missing return statement
    }

    public static void printPhone(int phone, int version) {
        int currentYear = LocalDate.now().getYear(); //LocalDate.now() был тоже красным вроде опять alt + shift + enter
        if (version < currentYear) {
            System.out.println("Установите облегченную версию приложения для ");
        } else {
            System.out.println("Установите обычную версию приложения для ");
        }
        if (phone == 0) {
            System.out.println("iOS по ссылке");
        } else {
            System.out.println("Android по ссылке");
        }

    }

    public static void deliversCard(int deliveryDistance) {
        int days = calculateDistance(deliveryDistance);
        if (days ==-1){
            System.out.println("Доставки нет");
        }else {
            System.out.println(days + " дней потребуется на доставку");

        }

    }

    public static int calculateDistance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else { return -1;
        }

    }
}
