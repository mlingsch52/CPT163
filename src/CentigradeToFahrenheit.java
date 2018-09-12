import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Micahel Lingsch
 This program will convert Centigrade
 to Fahrenheit and visa-versa.
 Created On: 09/09/2018
 Last Modified: 09/09/2018
 *********************************/

public class CentigradeToFahrenheit {

    public static void main(String[] args) {

        //Define variables for Centigrade and Fahrenheit
        String temperature;
        double centigrade, fahrenheit;

        //Present a message box alerting the user what's going to happen
        JOptionPane.showMessageDialog(null, "We are going to convert a Centigrade \n" +
                "temperature you provide into Fahrenheit!");

        //Enter the starting temperature and convert it from a string to a double
        temperature = JOptionPane.showInputDialog("Please input the temperature in Centigrade.");
        centigrade = Double.parseDouble(temperature);

        //Convert the Centigrade Temperature to Fahrenheit
        JOptionPane.showMessageDialog(null, "To get our temperature into Fahrenheit we \n" +
                "will multiply" + centigrade + " degrees Centigrade by 1.8 \n" +
                "then add 32. The result will be our temperature in Fahrenheit.");
        fahrenheit = (centigrade * 1.8) + 32;

        //Display the converted temperature
        JOptionPane.showMessageDialog(null, centigrade + " degrees Centigrade is equal to \n" +
                Math.round((fahrenheit * 100)) / 100d + " degrees Fahrenheit!");

        System.exit(0);


    }
}
