/*
 * Daniel Bigler
 * 190821
 * input a number of days, output the number of days that can be missed
 */
package inclass_02_0821_biglerdaniel;
import javax.swing.JOptionPane;
public class InClass_02_0821_BiglerDaniel {
    public static void main(String[] args) {
        math();
    }
    
    public static void math() {
        
        String input;           // input for dialog box
        final int minimum = 1;  // days within class has to be this or more
        int days;               // Number of days
        double missDays;        // Number of days that can be missed
        
        // Get number of days
        input = JOptionPane.showInputDialog("How many days are there "
                + "in the class?");
        days = Integer.parseInt(input);
        
        // Input validation
        while (days < minimum) {
        input = JOptionPane.showInputDialog("Please enter a number greater "
                + "than zero.");
        days = Integer.parseInt(input);
        }
        
        missDays = twentyPercent(days);
        
        // Dialog box to display the number of days and the number that
        // can be missed. Format so that there aren't decimals
        JOptionPane.showMessageDialog(null, "If you have " + days + " days then "
                + "you can miss " + String.format("%,.0f",missDays) + " days.");
    }
    
    public static double twentyPercent(int days){
        double result;
        
        result = days * 0.2;
        
        return result;
    }
    
}
