public class Main {
    public static void main(String[] args) {
        isLeapYear(1994);
        isLeapYear(2003);
        isLeapYear(2004);

        printAppVersion(1, 1999);
        printAppVersion(0, 2022);

        var days = calculateDeliveryTime(115);
        if (days == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + days);
        }

    }

    public static void isLeapYear(int year) {
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        } // задача1
        System.out.println();
    }

    public static void printAppVersion(int clientOS, int yearProd) {
        if (clientOS == 0 && yearProd < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && yearProd >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearProd < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && yearProd >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Введены некорректные данные");   //задача2
        }
        System.out.println();
    }

    public static int calculateDeliveryTime(int deliveryDistance) {
        if (deliveryDistance > 100) {
            return -1;
        } else {
            int days = 1;
            if (deliveryDistance > 20) {
                days++;
            }
            if (deliveryDistance > 60) {
                days++;
            }
            return days; //задача3
        }

    }
}