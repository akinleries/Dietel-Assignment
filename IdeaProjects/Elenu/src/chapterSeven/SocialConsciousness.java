package chapterSeven;

import java.security.SecureRandom;
import java.util.Scanner;

public class SocialConsciousness {
    private String[] topics = {"Bullying", "Depression", "Drug Abuse", "Peer Pressure", "Obesity"};
    private int[][] ratings = new int[5][10];


    public  void rateBullying(int userRating){
        int indexToIncrement = userRating - 1;
        ++ratings[0][indexToIncrement];
    }


    public  void rateDepression(int userRating){
        int indexToIncrement = userRating - 1;
        ++ratings[1][indexToIncrement];
    }
    public  void rateDrugAbuse(int userRating){
        int indexToIncrement = userRating - 1;
        ++ratings[2][indexToIncrement];
    }

    public  void ratePeerPressure(int userRating){
        int indexToIncrement = userRating - 1;
        ++ratings[3][indexToIncrement];
    }
    public  void rateObesity(int userRating){
        int indexToIncrement = userRating - 1;
        ++ratings[4][indexToIncrement];
    }

    public void displayRatingsFrequency(){
        for (int i = 0; i<topics.length; i++){
            System.out.print(topics[i] + "   " + "\t");
            for (int j = 0; j < ratings[i].length; j++){
                System.out.print(ratings[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void getDepressionMaxRating(){
        int maxFrequency = ratings[0][0];
        int maxRating = 1;

        for (int i = 1; i < ratings[0].length; i++) {
            if (maxFrequency < ratings[0][i]){
                maxFrequency = ratings[0][i];
                maxRating = i + 1;
            }
        }
        System.out.println("The highest rating " + maxRating);
    }

    public int getAverage(){
        int numerator = 0;
        int denominator = 0;
        for (int i = 0; i < ratings.length; i++) {
            numerator = ratings[0][i] * 1 + 1;
            denominator = ratings[0][i];
        }
        return numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        SocialConsciousness social = new SocialConsciousness();
       // SecureRandom randomizer = new SecureRandom();
        int userNum = userInput.nextInt();
        social.rateBullying(userNum);
        int userNum1 = userInput.nextInt();
        social.rateDepression(userNum1);
        int userNum2 = userInput.nextInt();
        social.ratePeerPressure(userNum2);
        int userNum3 = userInput.nextInt();
        social.rateObesity(userNum3);
        int userNum4 = userInput.nextInt();
        social.rateDrugAbuse(userNum4);
        social.displayRatingsFrequency();
        System.out.println();
        social.getDepressionMaxRating();
        //System.out.println();
        //System.out.println("Average is :  " + social.getAverage());
    }
}
