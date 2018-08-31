import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Micahel Lingsch
 My First Java Program
 This program will calculate the amount of
 ingredients needed to make a predetermined number
 of cookies.
 Created On: 08/29/2018
 Last Modified: 08/29/2018
 *********************************/

public class IngredientAdjuster {

    //This program will tell the user what ingredients they need to make the number of cookies they are looking to make
    public static void main(String[] args){

        //define the ingredient variables
        double cupsOfSugar, cupOfButter, cupsOfFlour, requiredSugar, requiredButter, requiredFlour;
        int numberOfCookies;

        cupsOfSugar = 1.5;
        cupOfButter = 1;
        cupsOfFlour = 2.75;

        //ask the user how many cookies they are trying to make
        Scanner keyboard=new Scanner(System.in);
        System.out.println("How many cookies would you like to make? \nPlease enter a whole number.");
        numberOfCookies = keyboard.nextInt();

        //calculate the required ingredients
        requiredSugar = (numberOfCookies / 48F) * cupsOfSugar;
        requiredButter = (numberOfCookies / 48F) * cupOfButter;
        requiredFlour = (numberOfCookies / 48F) * cupsOfFlour;

        //display the total amount of ingredients needed
        System.out.println("In order to make " + numberOfCookies + " you will need the following: \n" +
                requiredSugar + " cups of Sugar \n" +
                requiredButter + " cups of Butter \n" +
                requiredFlour + " cups of Flour.");

        //including the JFrame into this just for fun
        JFrame frame = new JFrame();

        JOptionPane.showMessageDialog(frame, "In order to make " + numberOfCookies + " you will need the following: \n" +
                requiredSugar + " cups of Sugar \n" +
                requiredButter + " cups of Butter \n" +
                requiredFlour + " cups of Flour." , "Cookie Ingredient List", JOptionPane.INFORMATION_MESSAGE);

    }

}
