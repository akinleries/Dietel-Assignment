package chapterSeven;

import java.io.IOException;

public class SevenSegment {
  private final int[][] sevenSegment = new int[5][4];

    public void display() throws InterruptedException {


        for (int[] ints : sevenSegment) {
            for (int anInt : ints) {
                if (anInt == 1) {
                    System.out.print("# ");
                } else
                    System.out.print("  ");
                 Thread.sleep(100);
            }
            System.out.println();
        }
    }



    public void writeOnA() {
        for (int i = 0; i < 4; i++) {
            sevenSegment[0][i] = 1;
           }
        }
        public void writeOnB() {
            for (int i = 0; i < 3; i++) {
              sevenSegment[i][3] = 1;
            }
        }
        public void writeOnC() {
            for (int i = 2; i < 5; i++) {
                sevenSegment[i][3] = 1;
            }
        }
        public void writeOnD() {
            for (int i = 0; i < 4; i++) {
            sevenSegment[4][i] = 1;
            }
        }
        public void writeOnE() {
            for (int i = 4; i >= 2 ; i--) {
                sevenSegment[i][0] = 1;
            }
        }
        public void writeOnF() {
            for (int i = 0; i < 3 ; i++) {
                sevenSegment[i][0] = 1;
            }
        }
        public void writeOnG() {
            for (int i = 0; i < 3; i++) {
                sevenSegment[2][i] = 1;
            }
        }

        public void setValue(String numbers) throws IOException {
            if (numbers.length() > 8) {
               // throw new IllegalArgumentException("characters cannot exceed 8");
                throw new IndexOutOfBoundsException("characters cannot exceed 8");
            }
            StringBuilder numbersBuilder = new StringBuilder(numbers);
            while (numbersBuilder.length() < 8){
             numbersBuilder.insert(0, '0');
            }
            numbers = numbersBuilder.toString();

            for (int i = 0; i < numbers.length(); i++) {
                if (numbers.charAt(i) != '1' && numbers.charAt(i) != '0'){
                    throw new IllegalArgumentException("Numbers Can Either Be 1 Or 0");
                }
                 if (numbers.charAt(i) == '1'){
                     switch (i){
                         case 0 -> writeOnA();
                         case 1 -> writeOnB();
                         case 2 -> writeOnC();
                         case 3 -> writeOnD();
                         case 4 -> writeOnE();
                         case 5 -> writeOnF();
                         case 6 -> writeOnG();
                     }
                 }
            }
        }
    }
