
/**
 * Biglerd7304      Daniel Bigler
 * CSC-251-0001     10/23/2019
 * This program creates a temperature table Celsius to Fahrenheit
 * This is a copy
*/
package p_01_biglerdaniel;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;
public class P_01_BiglerDaniel
{
    public static void main(String[] args) throws FileNotFoundException {
        String cont = "y";
        int option;
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        do {
            System.out.print("Enter a number."+'\n');
            System.out.print("1. Celsius to Fahrenheit chart (0 to 100)."+'\n');
            System.out.print("2. Fahrenheit to Celsius chart (32 to 212)."+'\n');
            System.out.print("3. Celsius to Fahrenheit chart (choose start and"
                    + " end)."+'\n');
            System.out.print("4. Fahrenheit to Celsius chart (choose start and"
                    + " end)."+'\n');
            System.out.print("5. C to F and F to C charts."+'\n');
            System.out.print("6. Exit."+'\n');
            
            option = keyboard.nextInt();
            switch (option)
            {
                case 1:
                    C_to_F();
                    cont = "";
                    break;
                case 2:
                    F_to_C();
                    cont = "";
                    break;
                case 3:
                    C_to_F_range();
                    cont = "";
                    break;
                case 4:
                    F_to_C_range();
                    cont = "";
                    break;
                case 5:
                    C_to_F_and_F_to_C();
                    cont = "";
                    break;
                case 6:
                    cont = "n";
                    break;
                default:
                    System.out.print("Invalid input, try one of the "
                            + "numbers given. " + '\n');
            }
            
            // Give the option to run the loop again.
            
            while (!cont.equalsIgnoreCase("n") && !cont.equalsIgnoreCase("no") && 
                !cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("yes")) {
                
                cont = keyboard.nextLine();
                System.out.print("Do you want to run it again?(Yes or No)"+'\n');
                cont = keyboard.nextLine();
            }
            
        } while (cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("y"));
        
    }
   
    public static void C_to_F() throws FileNotFoundException {
        double fahrenheit;  // The Fahrenheit temperature
        double celsius;     // The Celsius temperature
        String filename;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename for a new text file, \nfor "
                + "Celsius to Fahrenheit (Make sure to add '.txt') : ");
        filename = keyboard.nextLine(); 
        
        // Create a DecimalFormat class to format output.
        // Celsius Left, Fahrenheit Right
        DecimalFormat fmt = new DecimalFormat(" 0.0");
        // Display the table headings.
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("------------------------------");
        
        
        PrintWriter outputFile;
        outputFile = new PrintWriter(filename);
        outputFile.println("Celsius\t\tFahrenheit");
        outputFile.println("------------------------------");
        
        
        // Display the table.
        for (celsius = 0; celsius <= 100; celsius++) {
            fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.println(fmt.format(celsius) +
                                "\t\t" + 
                                fmt.format(fahrenheit));
            outputFile.println(fmt.format(celsius) +
                                "\t\t" + 
                                fmt.format(fahrenheit));
        }
        outputFile.close();
    }
    public static void F_to_C() throws FileNotFoundException {
        double fahrenheit;  // The Fahrenheit temperature
        double celsius;     // The Celsius temperature
        String filename;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename for a new text file, \nfor "
                + "Fahrenheit to Celsius (Make sure to add '.txt') : ");
        filename = keyboard.nextLine(); 
        
        // Create a DecimalFormat class to format output.
        // Fahrenheit Left, Celsius Right
        DecimalFormat fmt = new DecimalFormat(" 0.0");
        // Display the table headings.
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("------------------------------");
        
        
        PrintWriter outputFile;
        outputFile = new PrintWriter(filename);
        outputFile.println("Fahrenheit\tCelsius");
        outputFile.println("------------------------------");
        
        
        // Display the table.
        for (fahrenheit = 32; fahrenheit <= 212; fahrenheit++) {
            celsius =  (fahrenheit - 32) * (5.0 / 9.0);
            System.out.println(fmt.format(fahrenheit) +
                                "\t\t" + 
                                fmt.format(celsius));
            outputFile.println(fmt.format(fahrenheit) +
                                "\t\t" + 
                                fmt.format(celsius));
        }
        outputFile.close();
    }
    public static void C_to_F_range() throws FileNotFoundException {
        double fahrenheit;  // The Fahrenheit temperature
        double celsius;     // The Celsius temperature
        double start;       // The start of the range
        double end;         // The end of the range
        String filename;
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename for a new text file, \nfor "
                + "Celsius to Fahrenheit ranged (Make sure to add '.txt') : ");
        filename = keyboard.nextLine(); 
        // Display the table headings.
        
        // Get the user's perferred start.
        System.out.print("Enter a starting point to convert.");
        
        start = keyboard.nextDouble();
        
        // Get the user's perferred end.
        System.out.print("Enter a ending point for converting.");
        
        end = keyboard.nextDouble();
        
        // Create a DecimalFormat class to format output.
        // Celsius Left, Fahrenheit Right
        DecimalFormat fmt = new DecimalFormat(" 0.0");
        
        // Display the table headings.
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("------------------------------");
        
        
        PrintWriter outputFile;
        outputFile = new PrintWriter(filename);
        outputFile.println("Celsius\t\tFahrenheit");
        outputFile.println("------------------------------");
        
        
        // Display the table.
        for (celsius = start; celsius <= end; celsius++) {
            fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.println(fmt.format(celsius) +
                                "\t\t" + 
                                fmt.format(fahrenheit));
            outputFile.println(fmt.format(celsius) +
                                "\t\t" + 
                                fmt.format(fahrenheit));
        }
        outputFile.close();
    }
    public static void F_to_C_range() throws FileNotFoundException {
        double fahrenheit;  // The Fahrenheit temperature
        double celsius;     // The Celsius temperature
        double start;       // The start of the range
        double end;         // The end of the range
        String filename;
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename for a new text file, \nfor "
                + "Fahrenheit to Celsius ranged (Make sure to add '.txt') : ");
        filename = keyboard.nextLine(); 
        // Display the table headings.
        // Get the user's perferred start.
        System.out.print("Enter a starting point to convert.");
        
        start = keyboard.nextDouble();
        
        // Get the user's perferred end.
        System.out.print("Enter a ending point for converting.");
        
        end = keyboard.nextDouble();
        
        // Create a DecimalFormat class to format output.
        // Celsius Left, Fahrenheit Right
        DecimalFormat fmt = new DecimalFormat(" 0.0");
        
        // Display the table headings.
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("------------------------------");
        
        
        PrintWriter outputFile;
        outputFile = new PrintWriter(filename);
        outputFile.println("Fahrenheit\tCelsius");
        outputFile.println("------------------------------");
        
        // Display the table.
        for (fahrenheit = start; fahrenheit <= end; fahrenheit++)
        {
            celsius =  (fahrenheit - 32) * (5.0 / 9.0);
            System.out.println(fmt.format(fahrenheit) +
                                "\t\t" + 
                                fmt.format(celsius));
            outputFile.println(fmt.format(fahrenheit) +
                                "\t\t" + 
                                fmt.format(celsius));
        }
        outputFile.close();
    }
    public static void C_to_F_and_F_to_C() throws FileNotFoundException {
        double fahrenheit;  // The Fahrenheit temperature
        double celsius;     // The Celsius temperature
        String filename;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename for a new text file, \nfor "
                + "C to F and F to C charts (Make sure to add '.txt') : ");
        filename = keyboard.nextLine(); 
        
        // Create a DecimalFormat class to format output.
        // Celsius Left, Fahrenheit Right
        DecimalFormat fmt = new DecimalFormat(" 0.0");
        // Display the table headings.
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("------------------------------");
        
        
        PrintWriter outputFile;
        outputFile = new PrintWriter(filename);
        outputFile.println("Celsius\t\tFahrenheit");
        outputFile.println("------------------------------");
        
        
        // Display the table.
        for (celsius = 0; celsius <= 100; celsius++) {
            fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.println(fmt.format(celsius) +
                                "\t\t" + 
                                fmt.format(fahrenheit));
            outputFile.println(fmt.format(celsius) +
                                "\t\t" + 
                                fmt.format(fahrenheit));
        }
        // Display the table headings.
        System.out.println('\n'+'\n');
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("------------------------------");
        
        outputFile.println('\n'+'\n');
        outputFile.println("Fahrenheit\tCelsius");
        outputFile.println("------------------------------");
        
        // Display the table.
        for (fahrenheit = 32; fahrenheit <= 212; fahrenheit++) {
            celsius =  (fahrenheit - 32) * (5.0 / 9.0);
            System.out.println(fmt.format(fahrenheit) +
                                "\t\t" + 
                                fmt.format(celsius));
            outputFile.println(fmt.format(fahrenheit) +
                                "\t\t" + 
                                fmt.format(celsius));
        }
        outputFile.close();
    }
}
