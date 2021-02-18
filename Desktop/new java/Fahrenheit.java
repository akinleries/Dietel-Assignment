 import java.util.Scanner;

    public class Fahrenheit{


        public static void main(String args[]){

        Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a celsius degree :");
   	
	double userCelsius = input.nextDouble();
	double userFahrenheit = ((userCelsius * 1.8) + 32);

	System.out.printf("%.2f Celsius is %.2f", userCelsius, userFahrenheit);




    }







}