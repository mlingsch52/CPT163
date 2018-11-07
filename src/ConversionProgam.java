import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will perform various
 conversion relating to meters
 Created On: 10/242018
 Last Modified: 10/24/2018
 *********************************/

public class ConversionProgam {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Today we are going to play with conversions! Please enter a distance in meters ");
        double enteredMeters = keyboard.nextDouble();
        while (true) {
            menu();
            System.out.println("\n" +
                    "Please enter your choice: ");
            int menuSelection = keyboard.nextInt();

            if (menuSelection == 1) {
                showKilometers(enteredMeters);
            }

            if (menuSelection == 2) {
                showInches(enteredMeters);
            }

            if (menuSelection == 3) {
                showFeet(enteredMeters);
            }

            if (menuSelection == 4) {
                break;
            }
        }

        System.exit(0);
    }

    public static void menu() {

        System.out.println("1. Convert to kilometers\n" +
                "2. Convert to inches\n" +
                "3. Convert to feet\n" +
                "4. Quit the program");

    }

    public static void showKilometers(double enteredMeters) {

        System.out.println(enteredMeters + " meters is " + (enteredMeters * 0.001) + " kilometers.");
    }

    public static void showInches(double enteredMeters){

        System.out.println(enteredMeters + " meters converts to " + (enteredMeters * 39.37) + " inches.");
    }

    public static void showFeet(double enteredMeters){

        System.out.println(enteredMeters + " meters converts to " + (enteredMeters * 3.281) + " feet.");
    }

}
