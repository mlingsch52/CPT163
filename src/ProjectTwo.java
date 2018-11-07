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

public class ProjectTwo {

    public static void main(String[] args) {

        //Define variables for Centigrade and Fahrenheit
        String temperature;
        double centigrade, fahrenheit, takeout;
        int choice;

        //Present a message box alerting the user what's going to happen
        System.out.println("This program will provide the following capabilities:\n" +
                "1. It will convert celsius temperatures to its corresponding Fahrenheit temperature.\n" +
                "2. It will convert a distance of inches to its corresponding value in centimeters.\n" +
                "3. It will convert an angle measurement from degrees to radians.\n" +
                "Enter 1 for C to F\n" +
                "Enter 2 for in to cm\n" +
                "Enter 3 for degrees to radians.");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n Please make your selection (1 - 3)");
        choice = keyboard.nextInt();

        while (choice < 1 || choice > 3) {
            System.out.println("Incorrect entry, please enter 1, 2, or 3.");
            choice = keyboard.nextInt();
        }

        if (choice == 1) {
            //Enter the starting temperature and convert it from a string to a double
            System.out.println("Please input the temperature in Centigrade.");
            centigrade = keyboard.nextDouble();

            //Convert the Centigrade Temperature to Fahrenheit
            System.out.println("To get our temperature into Fahrenheit we \n" +
                    "will multiply" + centigrade + " degrees Centigrade by 1.8 \n" +
                    "then add 32. The result will be our temperature in Fahrenheit.");
            fahrenheit = (centigrade * (9 / 5f)) + 32;

            //Display the converted temperature
            System.out.println( centigrade + " degrees Centigrade is equal to \n" +
                    Math.round((fahrenheit * 100)) / 100d + " degrees Fahrenheit!");

        }

        //Define the variables for inches and centimeters
        else if (choice == 2) {

            String length;
            double centimeter, inch;

            //Ask the user to input the number of inches they would like converted
            System.out.println("Please enter a length, in inches, and we will convert \n" +
                    "it to Centimeters. Please use no more than 2 decimals.");
            inch = keyboard.nextDouble();

            //Convert the inches to centimeters
            System.out.println("In order to convert the Inches to Centimeters \n" +
                    "we will multiply the " + inch + " inches by 2.54.");
            centimeter = inch * 2.54;

            //Display the converted value
            System.out.println(inch + " inches is equal to " +
                    Math.round((centimeter * 100)) / 100d + "\n" +
                    "centimeters! How cool is that?");


        }

        else if (choice == 3){

            //Define the variables for degrees. PI and radians
            double degrees, radians, pi = 3.14159;

            //Ask the user to input the number of degrees they would like converted
            System.out.println("Please enter an angle measurement in Degrees and we will convert it to Radians!");
            degrees = keyboard.nextDouble();

            //Convert the degrees to radians
            System.out.println("In order to convert Degrees to Radians \n" +
                    "we will multiply the degrees times PI and divide by 180.");

            radians = (degrees * pi) / 180;

            //Display the converted value
            System.out.println(degrees + " degrees is equal to " + radians + " radians! Not bad.");


        }

        System.exit(0);


    }
}