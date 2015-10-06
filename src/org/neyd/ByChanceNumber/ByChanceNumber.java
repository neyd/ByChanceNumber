package org.neyd.ByChanceNumber;

import java.util.Scanner;

import static java.lang.Math.*;


public class ByChanceNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resp;
        double randomNumberDown;
        double randomNumberTop;
        double randomNumber;
        System.out.println("Загадайте число від 1 до 100 і натисніть будь-яку клавішу");
        resp = Integer.parseInt(scanner.nextLine());
        randomNumberDown = 1;
        randomNumberTop = 101;
        while (resp != 2) {
            randomNumber = Math.floor((randomNumberDown + randomNumberTop) / 2);
            //число randomNumber мусить бути типу double тому, що воно інакше видає помилку
            //math.floor мусить бути, бо якщо (34+37)/2= 35,5
            System.out.println("Ваше число" + " " + randomNumber + "?");
            resp = Integer.parseInt(scanner.nextLine());
            if (resp == 2) {
                System.out.println("Вітаємо");
            } else if (resp == 1) {
                randomNumberDown = randomNumber;
                //число randomNumberDown теж має бути типу double бо інакше ми не зможемо присвоїти йому число типу double
            } else if (resp == 0) {
                randomNumberTop = randomNumber;
                //тоже саме
            }

        }

    }
}

