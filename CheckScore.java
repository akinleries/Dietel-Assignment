package roughLectures;

public class CheckScore {
    public static void main(String[] args) {
        boolean gameOver  = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;


    if (gameOver == true){
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score is  :  " + finalScore + "\n");

    }
        nextCandidateScore(true, 1000, 8, 200);

    }
    //public static int finalScore;
    public static int nextCandidateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score is  :  " + finalScore);
            return finalScore;

        }
        return -1;
    }
}
