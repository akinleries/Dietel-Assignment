package chapterTwo;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Radius");
        int radius = userInput.nextInt();

//        double diameter = radius * 2;
//        double circumference = diameter * Math.PI;
//        double area = Math.pow(radius * Math.PI, 2);


        System.out.printf("%d%n%n%f%n%n%f%n", radius*2, radius*2*Math.PI, Math.pow(radius*Math.PI, 2));
        System.out.println();
        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
        System.out.printf("The   Characters  Are   : %c%4c%4c%4c%4c%4c%4c%4c%4c%4c%4c%4c%4c%4c%nThe Integer Values  Are : %d%4d%4d%4d%4d%4d%4d%4d%4d%4d%4d%4d%4d%4d%n",'A','B','C','a','b','c','0','1','2','$','*','+','/',' ',(int)'A',(int)'B',(int)'C',(int)'a',(int)'b',(int)'c',(int)'0',(int)'1',(int)'2',(int)'$',(int)'*',(int)'+',(int)'/',(int)' ');


    }
}
