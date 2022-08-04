import java.time.LocalDate;

public class Main {
    static int thisYear = LocalDate.now().getYear();
    static int clientOS = 1;
    static int deliveryDistance = 95;

    public static void main (String[] agrs){
        boolean leap = leapYear(thisYear);                     // Задание 1
        printResult(leap, thisYear);
        clientDeviceYear(thisYear);                             // Задание 2
        int totalDay = delivery(deliveryDistance);             // Задание 3
        deliveryDayResult(totalDay);

    }
    // Задание 1
    public static boolean leapYear(int thisYear) {
        boolean leapYear = thisYear % 4 == 0 && thisYear % 100 != 0 || thisYear % 400 == 0;
        return leapYear;
    }

    public static void printResult (boolean leapYear, int thisYear){
        if (leapYear) {
            System.out.println(thisYear + " год високосный");
        } else {
            System.out.println(thisYear + " год не является високосным");
        }
    }


    // Задание 2
    public static void clientDeviceYear(int thisYear) {
        if (thisYear <= 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (thisYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        if (thisYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        } else if (thisYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
    }

    // Задание 3
    public static int delivery(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance <= 20) {
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            day++;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            day += 2;

        }
        return day;
    }

    public static void deliveryDayResult(int day) {
        System.out.println("Потребуется дней " + day);
    }
}
