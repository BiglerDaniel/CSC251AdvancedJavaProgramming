/* Reginald Jones
 * 8/21/2019
 * This program is to ask for a Name, Classes, How many Days Missed.
 */

package inclass_02_jonesreginald;
import javax.swing.JOptionPane;

public class InClass_02_JonesReginald 
{
    public static void main(String[] args) 
    {
        String firstName;          //First Name of the Person.
        String lastName;           //Last Name of the Person.
        String className;          //Names of Classes Attending.
        char repeat;               //To hold Yes or No
        int weekNumber;            //Number of Weeks taken Courses.
        int classNumber;           //Number of Classes.
        int attendanceDays;        //Number of Days Attended.
        String input;              //Hold for User Input
        
        JOptionPane.showMessageDialog(null, "Hello this is a program to "
                                            + "determine your Classes, How "
                                            + "many weeks your taking and "
                                            + "The Number of Attendances.");
        //Asks user for their name
        firstName = JOptionPane.showInputDialog("Please Enter Your First "
                                                + "Name:");
        
        lastName = JOptionPane.showInputDialog("Please Enter Your Last Name:");
        
        //If Statement to Display how many courses the user is taking
        JOptionPane.showMessageDialog(null, "How many weeks will you be taking"
                                            + " these courses? ");
        input = JOptionPane.showInputDialog("Please enter either 16, 8, " 
                                            + "7 or 4");
        weekNumber = Integer.parseInt(input);
        
        if (weekNumber >= 16)
            JOptionPane.showMessageDialog(null, "You can only miss 7 days of " 
                                          + "courses.");
        else if (weekNumber >= 8)
            JOptionPane.showMessageDialog(null, "You can only miss 4 days of"
                                          + " courses.");
        else if (weekNumber >= 7)
            JOptionPane.showMessageDialog(null, "You can only miss 4 days of"
                                          + " courses.");
        else if (weekNumber >= 4)
            JOptionPane.showMessageDialog(null, "You can only miss up to 2 days"
                                          + " of courses.");
        else
            JOptionPane.showMessageDialog(null, "Are you sure you "
                                          + " taking a course?");
        
        /*input = JOptionPane.showInputDialog("How many classes are you taking?");
        classNumber = Integer.parseInt(input);*/
        
        do
        {
            //Input for the Class Names
            JOptionPane.showMessageDialog(null, "What are the names of the "
                                                + "classes?");
            className = JOptionPane.showInputDialog("Enter class name here: ");
            
            JOptionPane.showInputDialog("Would you like to add another "
                                                + "class? Enter Y for Yes, "
                                                + "N for No");
            repeat = input.charAt(0);
        } while (repeat == 'Y' || repeat == 'y');
        
        //Need to add additional information such as, Class Number, Class Name
        //What Days.
        
        input = JOptionPane.showInputDialog("Have you missed any days? If so, "
                                            + "how many?");
        attendanceDays = Integer.parseInt(input);
        
        //Results
        JOptionPane.showMessageDialog(null,
        String.format("\n Hello " + firstName + " " + lastName)+
        String.format("\n ==========================================")+
        String.format("\n Your Taking A " + weekNumber + " Week Course")+
        //String.format("\n You are taking " + classNumber + " classes")+
        String.format("\n The Class Names Are " + className)+
        String.format("\n You Currently Missed " + attendanceDays + " Days")+
        String.format("\n =========================================="));
        
    System.exit(0);
    
    }
}
