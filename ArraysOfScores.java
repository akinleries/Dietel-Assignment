package ChapterFour;

public class ArraysOfScores {
    public static void main(String[] args) {
        int[] arrays = new int[20];
        for (int r = 1; r < arrays.length; r++) {
            arrays[r] = r * 10;
            printArray(arrays);
    }
}
    public static void printArray(int[] arrays){

        for (int e = 1; e < arrays.length; e++) {
            System.out.println("element " + e + "  value " + arrays[e]);
        }
    }
}



