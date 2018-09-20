import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

/*********************************
 CPT163
 Michael Lingsch
 This program will calculate the
 shipping cost on freight
 Created On: 09/19/2018
 Last Modified: 09/19/2018
 *********************************/


public class ShippingCharges {

    public static void main(String[] args) {

        //Define the variables we will be using in this program
        String packageWeight, shippingDistance;
        double weight, distance, shippingCost;

        //Alert the user what we are going to be doing in this program
        JOptionPane.showMessageDialog(null, "In this program, we will be calculating \n" +
                "the shipping cost for the package you will be sending.");

        //Display the shipping costs per 500 miles
        JOptionPane.showMessageDialog(null, "The cost to ship freight per 500 miles is as follows: \n" +
                "2 lbs or less       - $1.10 per 500 miles\n" +
                "2.1 lbs to 5.9 lbs  - $2.20 per 500 miles\n" +
                "6.1 lbs to 9.9 lbs  - $3.70 per 500 miles\n" +
                "Over 10 lbs         - $3.80 per 500 miles");

        //Ask for the weight of the package
        packageWeight = JOptionPane.showInputDialog("How much does the package you are shipping weigh? \n" +
                "Please enter this in pounds and use 2 decimals.");
        weight = Double.parseDouble(packageWeight);

        //Ask for the distance the package is being shipped
        shippingDistance = JOptionPane.showInputDialog("How far are you shipping this package? \n" +
                "Please enter this in miles and use 2 decimals.");
        distance = Double.parseDouble(shippingDistance);

        //Calculate the cost
        if (weight < 2.00) {
            shippingCost = Math.round(((distance / 500) * 100d) / 100d) * 1.10;
            JOptionPane.showMessageDialog(null, "Your package weighs " + weight + " pounds and \n" +
                    "you are shipping it " + distance + " miles. \n" +
                    "The charge will be $1.10 per 500 miles. \n" +
                    "Your total shipping cost would be " +
                    NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(shippingCost));

        } else if (weight >= 2.00 && weight <= 5.99) {
            shippingCost = Math.round(((distance / 500) * 100d) / 100d) * 2.20;
            JOptionPane.showMessageDialog(null, "Your package weighs " + weight + " pounds and \n" +
                    "you are shipping it " + distance + " miles. \n" +
                    "The charge will be $2.20 per 500 miles. \n" +
                    "Your total shipping cost would be " +
                    NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(shippingCost));

        } else if (weight >= 6.00 && weight <= 9.99) {
            shippingCost = Math.round(((distance / 500) * 100d) / 100d) * 3.70;
            JOptionPane.showMessageDialog(null, "Your package weighs " + weight + " pounds and \n" +
                    "you are shipping it " + distance + " miles. \n" +
                    "The charge will be $3.70 per 500 miles. \n" +
                    "Your total shipping cost would be " +
                    NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(shippingCost));

        } else if (weight >= 10.00) {
            //figure out the rounding thing better
            shippingCost = Math.round(((distance / 500) * 100d) / 100d) * 3.80;
            JOptionPane.showMessageDialog(null, "Your package weighs " + weight + " pounds and \n" +
                    "you are shipping it " + distance + " miles. \n" +
                    "The charge will be $3.80 per 500 miles. \n" +
                    "Your total shipping cost would be " +
                    NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(shippingCost));
        }
        System.exit(0);
    }
}
