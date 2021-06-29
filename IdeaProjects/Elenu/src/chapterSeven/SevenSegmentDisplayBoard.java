package chapterSeven;

public class SevenSegmentDisplayBoard {

    public void display() throws InterruptedException {
        int[][] sevenSegment  = {
                {1,1,1,1},
                {1,0,0,1},
                {1,1,1,1},
                {1,0,0,1},
                {1,1,1,1}
        };

            for (int[] ints : sevenSegment) {
                for (int anInt : ints) {
                    if (anInt == 1) {
                        System.out.print("# ");
                    } else
                        System.out.print("  ");
                   Thread.sleep(1000);
                }
                System.out.println();
                System.out.println();
            }
        }

}
