import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will convert Centigrade
 to Fahrenheit and Inches to Centimeters.
 Created On: 09/09/2018
 Last Modified: 09/12/2018
 *********************************/

public class ProjectOne {

    public static void main(String[] args) {

        //Define variables for Centigrade and Fahrenheit
        String temperature;
        double centigrade, fahrenheit;

        //Present a message box alerting the user what's going to happen
        JOptionPane.showMessageDialog(null, "Today, we are going explore conversions. First, \n" +
                "we will convert a user provided temperature from Centigrade \n" +
                "into Fahrenheit! Then, later, we will covert Inches into Centimeters! \n" +
                "Let's begin!");

        //Enter the starting temperature and convert it from a string to a double
        temperature = JOptionPane.showInputDialog("Please input the temperature in Centigrade.");
        centigrade = Double.parseDouble(temperature);

        //Convert the Centigrade Temperature to Fahrenheit
        JOptionPane.showMessageDialog(null, "To get our temperature into Fahrenheit we \n" +
                "will multiply" + centigrade + " degrees Centigrade by 1.8 \n" +
                "then add 32. The result will be our temperature in Fahrenheit.");
        fahrenheit = (centigrade * (9/5f)) + 32;

        //Display the converted temperature
        JOptionPane.showMessageDialog(null, centigrade + " degrees Centigrade is equal to \n" +
                Math.round((fahrenheit * 100)) / 100d + " degrees Fahrenheit!");

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

        //Recap what we've gone over
        JOptionPane.showMessageDialog(null, "Let's recap! We converted " + centigrade + " degrees F \n" +
                "to " + Math.round((fahrenheit * 100)) / 100d + " degrees C and we converted " + inch + " inches \n" +
                "to " + Math.round((centimeter * 100)) / 100d + " centimeters!");

        System.exit(0);


    }
}
