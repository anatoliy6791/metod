package ru.skypro;

public class Main {
    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }
    }
    public static void OC(int clientDeviceYear, int clientOC) {
        if (clientOC == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOC == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOC == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOC == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void delivery(int deliveryDistance) {
        int deliveryDays = 1;
        if(deliveryDistance > 20) deliveryDays +=1;
        if(deliveryDistance > 60) deliveryDays +=1;
        if(deliveryDistance > 100) deliveryDays +=1;

        if (deliveryDays < 4) {
            System.out.println("Ваша карта будет доставлена в течении " + deliveryDays + " дня(ей)");
        } else {
            System.out.println("Мы не можем доставить карту на ваш адрес");
        }
    }
    public static void main(String[] args) {
task1();
task2();
task3();
    }
    public static void task1() {
        int years = 2000;
        leapYear(years);
    }
    public static void task2() {
        int currentYear = 2014;
        int clientOC = 0;
        OC(currentYear, clientOC);
    }
    public static void task3() {
        int deliveryDistance = 9;
        delivery(deliveryDistance);
    }
}





