/*
 * Daniel Bigler    biglerd7304
 * CSC-251-0001
 * Option to view three different types of loops and be able to exit
 */
package hw_02_biglerdaniel;
import javax.swing.JOptionPane;
public class HW_02_BiglerDaniel {
    public static void main(String[] args) {
        String cont = "y";
        String input;
        int loops;
        String error = "y";
        
        // keep running until the user no longer wants to continue
        while (cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("yes")) {
            
            // if there is an error then it will loop back around
            while (error.equals("y")) {
                
                // try this code, catch if invalid input other than a number
                try {
                    input = JOptionPane.showInputDialog("Enter a number for a loop. "
                            + '\n' + "1=while, 2=do while, 3=for, 4=Exit: ");
                    loops = Integer.parseInt(input);
                    
                    // 4 different options, and default for if none are selected
                    switch (loops)
                    {
                        case 1:
                            while_loop();
                            break;
                            
                        case 2:
                            dowhile_loop();
                            break;
                            
                        case 3:
                            for_loop();
                            break;
                            
                        case 4:
                            JOptionPane.showMessageDialog(null, "Exit. \n Bye.");
                            
                            // prevents the outermost while loop from continuing
                            cont = "n";
                            
                            // prevents the WHILE ERROR loop from continuing
                            error = "n";
                            break;
                            
                        default:
                            // if number is given, but incorrect.
                            // you don't arrive here if you had entered nonnumber
                            JOptionPane.showMessageDialog(null, "Invalid input, try one of "
                                    + "the numbers given. ");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Please enter a number.");
                    error = "y";
                }
            }
        }
    }
    
    public static void while_loop(){
        String cont = "y";
        while (cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("yes")) {
            JOptionPane.showMessageDialog(null, "while loop, while 'cont' = "
                    + "'yes'");
            cont = JOptionPane.showInputDialog("Do you want to run 'while_loop'"
                    + " again? Yes or no: ");
            
            // input validation
            while (!cont.equalsIgnoreCase("n") && !cont.equalsIgnoreCase("no") && 
                    !cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("yes")) {
                cont = JOptionPane.showInputDialog("Do you want to run 'while_loop'"
                    + " again? YES or NO: ");
            }
        }
    }
    
    public static void dowhile_loop() {
        String cont = "y";
        cont = JOptionPane.showInputDialog("Do you want to run 'dowhile_loop'? "
                    + "It will run at least once regardless. Yes or no: ");
        do {
            JOptionPane.showMessageDialog(null, "do while loop, while 'cont' = "
                    + "'yes'." +'\n'+ "But will always run at least once.");
            cont = JOptionPane.showInputDialog("Do you want to continue "
                    + "'dowhile_loop'? "
                    + "Yes or no: ");
            
            // input validation
            while (!cont.equalsIgnoreCase("n") && !cont.equalsIgnoreCase("no") && 
                    !cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("yes")) {
                cont = JOptionPane.showInputDialog("Do you want to continue "
                    + "'dowhile_loop'? "
                    + "YES or NO: ");
            }
        } while (cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("yes"));
    }
    
    public static void for_loop(){
        String input;
        int num;
        int count;
        String error = "y";
        
        // incase of incorrect input, try again
        while (error.equals("y")) {
            try {
                // get number from user
                input = JOptionPane.showInputDialog("For Loop, how many times "
                        + "should the For Loop run");
                num = Integer.parseInt(input);
                
                // loop the entered number of times
                for (count = 1; count <= num; count++) {
                    JOptionPane.showMessageDialog(null, "for #"+count);
                }
                
                // don't repeat the while loop
                error = "n";
                
            } catch (Exception e) {
                // if a number isn't entered
                JOptionPane.showMessageDialog(null, "Please enter a number.");
                
                // repeat the wile loop
                error = "y";
            }
        }        
    }
}
