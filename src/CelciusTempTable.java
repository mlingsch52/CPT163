import java.util.Scanner;

/*********************************
 CPT163
 Michael Lingsch
 This program will displau a Celcius
 conversion table
 Created On: 10/242018
 Last Modified: 10/24/2018
 *********************************/

public class CelciusTempTable {

    public static void main(String[] args) {

        //Define variables for Centigrade and Fahrenheit
        double centigrade, fahrenheit;

        //Present a messagebox alerting the user what's going to happen
        System.out.println("We are going to convert a Fahrenheit temperature you provide into Celcius!");

        //Enter the starting temperature and convert it from a string to a double
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the temperature in Fahrenheit.");
        fahrenheit = keyboard.nextDouble();

        centigrade = celsius(fahrenheit);

        System.out.println("You started with a temperature of " + fahrenheit + " degrees fahrenheit and we converted it to " +
                Math.round((centigrade * 100) / 100d) + " degrees celsius!");


        int i;
        for (i = 0; i <= 32; i++) {

            System.out.println(celsius(i) + " degrees celsius equals " + i + " degrees fahrenheit.");

        }


        System.exit(0);

    }

    public static double celsius(double fahrenheit) {

        return ((5f / 9f) * (fahrenheit - 32));

    }


}
