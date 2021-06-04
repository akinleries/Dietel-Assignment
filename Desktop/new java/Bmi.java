package chapterTwo;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("enter weight");
        double weightInPound = userInput.nextDouble();
        System.out.println("enter height");
        double heightInInches= userInput.nextDouble();

        double bmi = weightInPound/(heightInInches*heightInInches);
        System.out.println("Your Body Max index  :  "+bmi);
        System.out.println();

        System.out.println("""
                BMI VALUES
                Underweight: less than 18.5
                Normal     : between 18.5 and 24.9
                Overweight : between 25 and 29.9
                Obese      : 30 or greater
                """);
    }
}
