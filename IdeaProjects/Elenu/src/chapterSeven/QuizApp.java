package chapterSeven;

import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
         String question1 = """
                1 .Examples Of A Noun.
                a. Joy
                b. Adverb
                c. Mobilize
                """;

        String question2 = """
                2. Examples Of A Verb.
                a. Joy
                b. Adverb
                c. Mobilize
                """;

        String question3 = """
                3 .Examples Of A Verb.
                a. Joy
                b. Adverb
                c. Mobilize
                """;

        String question4 = """
                4 .Type Of Programming Languages.
                a. Mysql
                b. C#
                c. Mobilize
                """;

    Question[] questions = {
            new Question(question1, "a"),
            new Question(question2, "c"),
            new Question(question3, "c"),
            new Question(question4, "b")
    };
    attemptTest(questions);
    }

    public static void attemptTest(Question[] questions){
        int score = 0;
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].promptQuestion);
            String answers = userInput.next();
            if (answers.equalsIgnoreCase(questions[i].answer)) {
                score+=5;
            }
        }
        if (score == 20) {
            System.out.println("you score  :    " + score + "/" + 20);
            System.out.println("Excellent");
        }else if (score >= 10) {
            System.out.println("you score  :    " + score + "/" + 20);
            System.out.println("Good");
        }else {
            System.out.println("you score  :    " + score + "/" + 20);
            System.out.println("Poor");
        }
    }
}
