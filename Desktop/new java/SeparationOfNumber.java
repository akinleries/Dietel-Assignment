package chapterTwo;

import java.util.Scanner;

public class SeparationOfNumber {
    public static void main(String[] args) {

        System.out.println(separateNumbers(12345));

    }
        public static String separateNumbers(int number){

            int number1 = number / 10000 % 10;
            int number2 = number / 1000 % 10;
            int number3 = number / 100 % 10;
            int number4 = number / 10 % 10;
            int number5 = number % 10;

            return number1 + "  " + number2 + "  " + number3 + "  " + number4 + "  " + number5;

        }
}
