package chapterSeven;

import java.util.stream.IntStream;

public class FlightMovies {

    private static boolean isTrue;
//    boolean isTrue = false;

    public static boolean isEqual(int flightLength, int[] movies){
        for (int i = 0; i < movies.length; i++) {
            for (int j = i + 1; j < movies.length; j++) {
                if (movies[i] + movies[j] == flightLength){
                    isTrue = true;
                    System.out.println("you can watch movie  :  " + i + "   and movie   :  " + j);
                }
                if (isTrue){
                    break;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] movies = {80, 60, 100, 50, 70, 40, 90};
        int flightLength = 180;

        isEqual(flightLength, movies);

        System.out.println(IntStream.rangeClosed(1, 10).summaryStatistics());

    }
}
