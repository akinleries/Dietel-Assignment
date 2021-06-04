package chapterTwo;

import java.util.Scanner;

public class printNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("first number");
        int number1 = userInput.nextInt();

        System.out.println("second number");
        int number2 = userInput.nextInt();

        System.out.println("third number");
        int number3 = userInput.nextInt();

        System.out.println("fourth number");
        int number4 = userInput.nextInt();

        System.out.println("fifth number");
        int number5 = userInput.nextInt();

        int counter1 = 0, counter2 = 0, counter3 = 0;

        if (number1 > 0) { counter1++; }  if (number2 > 0) { counter1++; }  if (number3 > 0) { counter1++; }  if (number4 > 0) { counter1++; }  if (number5 > 0) { counter1++; }

        if (number1 < 0) { counter2++; } if (number2 < 0) { counter2++; } if (number3 < 0) { counter2++; } if (number4 < 0) { counter2++; } if (number5 < 0) { counter2++;}

        if (number1 == 0){ counter3++; }  if (number2 == 0){ counter3++; }  if (number3 == 0){ counter3++; } if (number4 == 0){ counter3++; } if (number5 == 0){ counter3++; }

        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);
    }
}
