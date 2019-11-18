package com.itea.basic.java.l7.hw;

import java.util.Scanner;

/**
 * Задание: реализовать консольное приложение для работы с банковским счетом.
 * Необходимый функционал см в методе printMenu().
 */
public class Application {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int optionNumber = -1;
        while (optionNumber != 0) {
            printMenu();
            optionNumber = getCommandLineInput();
            switch (optionNumber) {
                case 1: {

                }
                case 2: {

                }
                case 3: {

                }
                case 4: {

                }
                case 5: {

                }
                case 6: {

                }
                case 7: {

                }
                default: {
                    System.out.println("Unresolved command!");
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println("1 - зарегистрировать счет");
        System.out.println("2 - распечатать информацию по счету");
        System.out.println("3 - распечатать баланс");
        System.out.println("4 - пополнить счет");
        System.out.println("5 - вывести средства");
        System.out.println("6 - заблокировать счет");
        System.out.println("7 - разблокировать счет");
        System.out.println("0 - завершить работу");
    }

    private static int getCommandLineInput() {
        System.out.print("Пожалуйста, введите номер опции >> ");
        return SCANNER.nextInt();
    }
}
