public class Main {
    public static void main(String[] args) {

        printYear(2023);


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
        }


}