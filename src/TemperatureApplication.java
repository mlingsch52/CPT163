import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will run the
 Temperature Application
 Created On: 10/312018
 Last Modified: 10/31/2018
 *********************************/

public class TemperatureApplication {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hey there! Please tell me the current temperature in degrees Fahrenheit!");
        double tempF = keyboard.nextDouble();

        TemperatureClass temp = new TemperatureClass(tempF);

        System.out.println("The temperature you entered was " + tempF + " degrees Fahrenheit!\n" +
                "This converts to " + temp.getCelsius() + " degrees Celsius \n" +
                "and " + temp.getKelvin() + " degrees Kelvin!");

    }

}
