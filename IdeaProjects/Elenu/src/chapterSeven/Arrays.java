package chapterSeven;

//import javax.swing.*;
//
public class Arrays {
        public static void main(String[] args) {
//            double sumArray[] = new double[10];
//            for (int i = 0; i < sumArray.length; i++) {
//                sumArray[i] = Math.random() * 100;
//                System.out.println(sumArray[i]);
//            }

            int x = 1;
            int y = 2;
            int z = x++;
            int a = --y;
            int b = z--;
            b += ++z;

            int answ = x>a?y>b?y:b:x>z?x:z;
            System.out.println(answ);

        }
}
//
//    }
//
//}
//   public static void main(String[] args) {
//        String input = "semicolon";
//
//        // getBytes() method to convert string
//        // into bytes[].
//        byte[] reverseArray = input.getBytes();
//
//        byte[] result = new byte[reverseArray.length];
//
//        // Store result in reverse order into the
//        // result byte[]
//        for (int i = 0; i < reverseArray.length; i++)
//            result[i] = reverseArray[reverseArray.length - i- 1];
//
//        System.out.println(new String(result) + "  ");
//
//        }
     //  public static void main(String[] args) {
//           char [][] characters = {
//                   {'x','o','x'},
//                   {'o','o','x'},
//                   {'o','x','o'}
//           };
//           for (int row = 0; row < characters.length; row++) {
//               for (int column = 0; column < characters[row].length; column++) {
//                   System.out.print(characters[row][column] + " ");
//
//               }
//
//           }
//       }

//    public static void main(String[] args) throws InterruptedException {
//        int [][] sevenSegment = {
//                {1,1,1,1},
//                {1,0,0,1},
//                {1,1,1,1},
//                {1,0,0,1},
//                {1,1,1,1}
//        };
//        for (int[] ints : sevenSegment) {
//            for (int anInt : ints) {
//                if (anInt == 1) {
//                    System.out.print("# ");
//                } else
//                    System.out.print("  ");
//                Thread.sleep(1000);
//
//            }
//            System.out.println();
//            System.out.println();
      //  }
  //  }


//    public static int[] reverse(int[] list){
//        int[] array = new int[list.length];
//
//        for (int i = 0, j = list.length - 1; i< array.length; i++ , j--){
//             array[i] = list[j];
//        }
//
//        return array;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(java.util.Arrays.toString(Arrays.reverse(new int[]{21, 3, 24, 54})));
//    }
//}
