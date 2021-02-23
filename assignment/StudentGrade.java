import java.util.Scanner;
 
  public class StudentGrade{

     public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Pls input your Result : ");

        double userResult = input.nextDouble(); 

        double score = 40.0;

 	if (userResult >= score){

          System.out.println("good performance you passed");    
       }
 
       if(userResult < score){


        System.out.println("poor performance you failed");
         }




     }

}