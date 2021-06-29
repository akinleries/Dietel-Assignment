package chapterSeven;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        SevenSegment displayBoard = new SevenSegment();
//        displayBoard.writeOnA();
//        displayBoard.writeOnB();
//        displayBoard.writeOnC();
//        displayBoard.writeOnD();
//        displayBoard.writeOnE();
//        displayBoard.writeOnF();
//        displayBoard.writeOnG();
        String num = "1111111111";
        displayBoard.setValue(num);
        displayBoard.display();
    }

}
