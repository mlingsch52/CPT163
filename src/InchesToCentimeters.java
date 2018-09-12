import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Micahel Lingsch
 This program will convert Inches
 to Centimeters
 Created On: 09/10/2018
 Last Modified: 09/10/2018
 *********************************/

public class InchesToCentimeters {

    public static void main(String[] args) {

        //Define the variables for inches and centimeters
        String length;
        double centimeter, inch;

        //Alert the user as to what the program will accomplish
        JOptionPane.showMessageDialog(null, "In this program, we will be converting \n" +
                "inches to centimeters. It's super exciting!");

        //Ask the user to input the number of inches they would like converted
        length = JOptionPane.showInputDialog("Please enter a length, in inches, and we will convert \n" +
                "it to Centimeters. Please use no more than 2 decimals.");
        inch = Double.parseDouble(length);

        //Convert the inches to centimeters
        JOptionPane.showMessageDialog(null, "In order to convert the Inches to Centimeters \n" +
                "we will multiply the " + inch + " inches by 2.54.");
        centimeter = inch * 2.54;

        //Display the converted value
        JOptionPane.showMessageDialog(null, inch + " inches is equal to " +
                Math.round((centimeter * 100)) / 100d + "\n" +
                "centimeters! How cool is that?");

        System.exit(0);
    }

}
