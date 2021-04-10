package ChapterFour;

import java.util.Scanner;

public class SeparationOfNumbersAndReversed {

    public static void main(String[] args) {
           Scanner inputNumber = new Scanner(System.in);
           System.out.println("pls enter five digits Number");
           int userInput = inputNumber.nextInt();

        while (userInput > 0) {

            System.out.print(userInput % 10 + "  ");
            userInput /=10;

        }

    }

}
