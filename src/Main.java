public class Main {

    public static void compare(int tempYear) {
        int forYears = 4;
        int onehandredYears = 100;
        int fourHundredYaers = 400;
        if ((tempYear % forYears == 0 && tempYear % onehandredYears != 0) || tempYear % fourHundredYaers == 0) {
            System.out.println(tempYear + " являеться високостным");
        } else {
            System.out.println(tempYear + " не являеться високостным");
        }
        System.out.println();
    }

    public static void mobileFhones(int tempCliedDeviceYear, int tempClientDeviceOs) {
        int clientOS = 0;
        int osAndroid = 1;
        int osIos = 0;
        int clientDeviceYear = 2015;
        int newVersionOS = 2010;
        if (tempClientDeviceOs == osAndroid) {
            if (tempCliedDeviceYear >= clientDeviceYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылкее");
            }
        }
        if (tempClientDeviceOs == osIos) {
            if (tempCliedDeviceYear >= clientDeviceYear) {
                System.out.println("Установите  версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            }
        }
        System.out.println();
    }
    public static int delivery(int tempDaliverydays) {
        int deliveryDays = 1;
        int distanceOne = 20;
        int distanceTwo = 60;
            if (tempDaliverydays > distanceOne) {
                deliveryDays++;
            }
            if (tempDaliverydays> distanceTwo) {
                deliveryDays++;
            }
        return deliveryDays;
    }


    public static void main(String[] args) {
        System.out.println("===============Задача 1================");
        int year = 2023;
        compare(year);
        System.out.println("===============Задача 2================");
        int clientDeviceYear = 2000;
        int clientDeviceOs = 0;
        mobileFhones(clientDeviceYear, clientDeviceOs);
        System.out.println("===============Задача 3================");
        int deliveryDistance=101;
        if (deliveryDistance<=100) {
            System.out.println("Потребуется " + delivery(deliveryDistance)+" дня(ей)");
        }else{
            System.out.println("Свыше 100 км доставки нет");
        }


    }

}