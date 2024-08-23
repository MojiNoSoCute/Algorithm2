package celsiusFile;
import java.util.Scanner;

public class ScannerTest {

    public static void main (String[] args){
        //Crete a Scanner object for input 
        Scanner fahscan = new Scanner(System.in);
        Scanner celscan = new Scanner(System.in);

        // Prompt the user for the temperature in Fahrenheit
        System.out.print("Enter Fagrenheit degree: ");
        float fahrenheit = fahscan.nextFloat();
        System.out.print("Enter Celsius degree: ");
        float inputcelsius = celscan.nextFloat();

        //Convert Ffahrenheit to Celsius
        float celsius = (fahrenheit - 32) * 5/9 ;
        float outputfahrenheit = (inputcelsius * 9/5) + 32;
    

        //Round the result to 2 decimal places
        double roundedCelsius = Math.round(celsius * 100.0) / 100.0;
        double roundedfahrenheit = Math.round(outputfahrenheit * 100.0) / 100.0;

        //Display the result
        System.out.println( fahrenheit + " Fahrenheit is equal to " + roundedCelsius + " Celsius ");
        System.out.println( inputcelsius + " Celsius is equal to " + roundedfahrenheit + " Fahrenheit ");

        //close the scanner
        fahscan.close();
        celscan.close();

       /*  System.out.print("Enter Celsius degree: ");
        float inputcelsius = celscan.nextFloat();

        float outputfahrenheit = (inputcelsius * 9 / 5) + 32;

        double roundedfahrenheit = Math.round(outputfahrenheit * 100.0) / 100.0 ;

        System.out.println( inputcelsius + " Celsius is equal to " + roundedfahrenheit + "Fahrenheit");

        celscan.close();*/


    }
}