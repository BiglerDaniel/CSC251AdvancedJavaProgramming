/*
 * daniel bigler    biglerd7304
 * 100719
 * tmeperasture from fahrenheit to celsius and kelvin
 */
package inclass_14_1007_biglerdaniel;
import java.util.Scanner;
public class InClass_14_1007_BiglerDaniel {
    public static void main(String[] args) {
        double testFah;     // to hold fahrenheit temperature
        
        // create a scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        // get the fahrenheit temperature
        System.out.print("Enter the Fahrenheit temperature: ");
        testFah = keyboard.nextDouble();
        
        // create an instance of the temperature class
        // passing the data that was entered as arguments
        // to the constructor
        Temperature temp = new Temperature(testFah);
        
        // Get the data to display it
        System.out.println();
        System.out.println("Fahrenheit: " + temp.getFahrenheit());
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Kelvin: " + temp.getKelvin());
    }
    
}
// double fahrenheit;
//