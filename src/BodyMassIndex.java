import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will calculate BMI
 Created On: 09/19/2018
 Last Modified: 09/19/2018
 *********************************/

public class BodyMassIndex {

    public static void main(String[] args){

        //Define variables for height and weight
        String userWeight, userHeight;
        double bodyMassIndex, weight, height;

        //Alert the user as to what will be happening in this program
        JOptionPane.showMessageDialog(null, "In this program, we will be calculating your BMI. \n" +
                "In order to do this, we will need to collect some information.");

        //Have the user put in their Height and Weight
        userWeight = JOptionPane.showInputDialog("Please enter your weight, in pounds, using 2 decimal places.");
        weight = Double.parseDouble(userWeight);
        userHeight = JOptionPane.showInputDialog("Please enter your height, in inches, using 2 decimal places.");
        height = Double.parseDouble(userHeight);

        //Inform them of the calculation we are about to do
        JOptionPane.showMessageDialog(null, "We will now calculate your BMI. \n" +
                "To do this, we will multiply your given weight, " + weight + " lbs, by \n" +
                "703 and divide that by your height, " + height + " inches, squared");

        //Calculate the BMI and inform the user what category they fall into
        bodyMassIndex = weight * 703 / Math.pow(height, 2);

        if (bodyMassIndex < 18.50) {
            JOptionPane.showMessageDialog(null, "Your BMI is " + Math.round((bodyMassIndex * 100) / 100d) + "! \n" +
                    "You are considered underweight!");
        } else if (bodyMassIndex >= 18.50 && bodyMassIndex <=25.00) {
            JOptionPane.showMessageDialog(null, "Your BMI is " + Math.round((bodyMassIndex * 100) / 100d) + "! \n" +
                    "You are considered ideal weight!");
        } else if (bodyMassIndex > 25.00) {
            JOptionPane.showMessageDialog(null, "Your BMI is " + Math.round((bodyMassIndex * 100) / 100d) + "! \n" +
                    "You are considered overweight!");
        }

        System.exit(0);

    }

}
