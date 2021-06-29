package chapterSeven;

public class findPrimeIndices {



//        public boolean[] findPrimeIndices ( boolean[] numbers){
//                for (int i = 2; i < numbers.length; i++) {
//                        if (numbers[i]) {
//                            elminateMultiples(numbers);
//                        }
//                        }
//
//                        return numbers;
//                }
//
//
//       private  void elminateMultiples(boolean[] numbers, int i){
//               int  multiple;
//               for (int j = 2; j < numbers.length ; j++) {
//                       multiple = i * j;
//                       if (multiple < numbers.length){
//                               numbers[multiple] = false;
//                       }else break;
//
//               }
//
//       }


    public static void main(String[] args) {
        boolean[] array = new boolean[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = true;
        }
        int multiple = 4;
        for (int i = 2; i < array.length; i++) {
                multiple *= i;
                if (multiple > array.length) {
                    array[i] = false;
                } else break;
            System.out.println(i);
        }
    }
}


