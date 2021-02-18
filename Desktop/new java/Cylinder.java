 import java.util.Scanner;
  
     public class Cylinder{
     
	  public static void main(String args[]){

	      Scanner input = new Scanner(System.in);

              System.out.print("Enter The Radius of a cylinder : ");
   		double userRadius = input.nextDouble();
              System.out.print("Enter The Length of a cylinder : ");
                double userLength = input.nextDouble();
	      
	      double area = userRadius * userRadius * 3.141512653;
              double volume = area * userLength; 
            
	      System.out.printf("The Area is %.2f%n", area);
              System.out.printf("The Volume is %.2f", volume);

    }




}