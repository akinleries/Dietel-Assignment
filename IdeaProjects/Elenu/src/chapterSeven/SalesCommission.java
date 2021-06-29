package chapterSeven;

import java.util.Scanner;

public class SalesCommission {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++){
            System.out.println(myIntegers[i]);
        }
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
      int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = userInput.nextInt();
            int temp;
            for (int j = 0; j < i; j++) {
                if (values[i] < values[j]){
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }

            }
        }
        return values;
    }
}
