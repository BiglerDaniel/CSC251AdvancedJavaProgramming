/*
 * Daniel Bigler    biglerd7304
 * 190918
 * input info. Input hours to get how many days can be missed, rounded up
 */
package hw_01_biglerdaniel;
import javax.swing.JOptionPane;
public class HW_01_BiglerDaniel {
    public static void main(String[] args) {
        String name;
        String courseSection;
        String courseName;
        double hours;
        double missHours;
        double missDays;
        
        name = get_name();
        courseSection = get_courseSection();
        courseName = get_courseName();
        hours = get_hours();
        missHours = twentyPercent(hours);
        missDays = calc_days(missHours);
        
        //(int) Math.ceil(missDays) rounds up to the next integer
        // regardless of if it is low like ".2" or high like ".8"
        
        JOptionPane.showMessageDialog(null, 
                "Hello " + name + '\n' +
                "Course Section: " + courseSection + '\n' +
                "Course Name: " + courseName + '\n' + 
                "Total Class/Lab Hours: " + hours + '\n' +
                "Allowed Absences - Hours: " + missHours + '\n' + 
                "Allowed Absences - Days: " + (int) Math.ceil(missDays) + 
                '\n' + "=====================================");
    }
    public static String get_name() {
        String name;
        
        // get the person's name
        name = JOptionPane.showInputDialog("What is your name? ");
        return name;
    }
    public static String get_courseSection() {
        String courseSection;
        
        // get the course section. ex: WEB-251
        courseSection = JOptionPane.showInputDialog("What is the course "
                + "section? ");
        return courseSection;
    }
    public static String get_courseName() {
        String courseName;
        
        // get the course name. ex: Mobile Application
        courseName = JOptionPane.showInputDialog("What is the course name? ");
        return courseName;
    }
    
    public static double get_hours() {
        String input;           // input for dialog box
        final int minimum = 1;  // hours within class has to be this or more
        double hours;            // Number of hours
        
        // Get number of hours. ex: 64
        input = JOptionPane.showInputDialog("How many hours are there "
                + "in the class throughout the semester? ");
        hours = Double.parseDouble(input);
        
        // Input validation. Make sure it's a positive number
        while (hours < minimum) {
        input = JOptionPane.showInputDialog("Please enter a number greater "
                + "than zero.");
        hours = Double.parseDouble(input);
        }
        return (double) hours;        
    }
    public static double twentyPercent(Double hours){
        double result;
            
        result = hours * 0.2;
        
        return result;
    }
    public static double calc_days(double missHours){
        double missDays;
        missHours = missHours / 2;
        missDays = missHours;
        return missDays;
    }
}
//64 -> 20% -> 12.8 -> 6.4 -> 7
//32 -> 20% -> 6.4 -> 3.2 -> 4
//28 -> 20% -> 5.6 -> 2.8 -> 3
//16 -> 20% -> 3.2 -> 1.6 -> 2

//16 week, 64 hours
//8 week, 32 hours