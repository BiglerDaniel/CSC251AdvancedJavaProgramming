/*
 * Kevin Coleman
 * 10-02-19
 * This program uses a switch statement to call methods to perform loops.
 */
package hw_02_colemankevin;

import javax.swing.JOptionPane;

public class HW_02_ColemanKevin 
{
    public static void main(String[] args) 
    {
        // Local variables
        String inputString;
        boolean run = true;
        
        do
        {
            // Get the user to choose a loop to enter
            inputString = JOptionPane.showInputDialog("Enter a number to select"
                    + " a loop. \n1. for loop \n2.while loop "
                    + "\n3. do while loop \n4. exit");
        
            // Execute the program with a switch statement
            switch (inputString)
            {
                case "1":
                    displayForLoop();
                    break;
                case "2":
                    displayWhileLoop();
                    break;
                case "3":
                    displayDoWhileLoop();
                    break;
                case "4":
                    run = false;
                    break;
                default:
                    displayError();
            }
        } while (run == true);    
    }
    
    public static void displayForLoop()
    {
        // Local variables
        String inputString;
        int runCount;
        
        // Get the run count from the user
        inputString = JOptionPane.showInputDialog("Enter the number of times "
                + "for the loop to run.");
        runCount = Integer.parseInt(inputString);
        
        // Run the loop
        for (int runs = 1; runs <= runCount; runs++)
        {
            JOptionPane.showMessageDialog(null, "This is run #" + runs 
                    + " from the for loop.");
        }
    }
    
    public static void displayWhileLoop()
    {
        // Local variables
        String inputString;
        int runCount;
        int runs = 1;
        
        // Get the run count from the user
        inputString = JOptionPane.showInputDialog("Enter the number of times "
                + "for the loop to run.");
        runCount = Integer.parseInt(inputString);
        
        // Run the loop
        while (runs <= runCount)
        {
            JOptionPane.showMessageDialog(null, "This is run #" + runs 
                    + " from the while loop.");
            runs++;
        }
    }
    
    public static void displayDoWhileLoop()
    {
       // Local variables
        String answer = "";
        
        do
        {
            // Display the message
            JOptionPane.showMessageDialog(null, "This is a message from the "
                    + "do-while loop.");
            
            // Prompt the user to run the loop again
            answer = JOptionPane.showInputDialog("Enter yes to run again or no "
                    + "to exit.");
            
            // Validate the user's input
            while (!((answer.equalsIgnoreCase("yes")) || 
                    (answer.equalsIgnoreCase("no"))))
            {
            JOptionPane.showMessageDialog(null, "You must enter yes or no.");
            answer = JOptionPane.showInputDialog("Enter yes to run again or no "
                    + "to exit.");
            }
        } while (answer.equalsIgnoreCase("yes"));
        
        
    }
    
    public static void displayError()
    {
        // Display the error message
        JOptionPane.showMessageDialog(null, "Please enter either 1, 2, 3, or 4 "
                + "to make your selection.");
    }
    
}
