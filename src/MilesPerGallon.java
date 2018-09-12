import java.util.Scanner;

/*********************************
 CPT163
 Michael Lingsch
 My First Java Program
 This program will calculate Miles Per Gallon
 Created On: 08/29/2018
 Last Modified: 08/29/2018
 *********************************/


public class MilesPerGallon {

    public static void main(String [] args){

        //declare the variables that we will be using
        double MPG, milesDriven, gallonsUsed;

        //prompt the user to enter the miles they've driven
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter how many miles you've driven as xx.xx");
        milesDriven = keyboard.nextDouble();

        //prompt the user to enter the gallons they've used
        System.out.println("Enter how many gallons you used as xx.xx");
        gallonsUsed = keyboard.nextDouble();

        //provide the formula for calculating MPG
        MPG = milesDriven / gallonsUsed;
        //display the final MPG
        System.out.println("Your Miles Per Gallon is "+ MPG);

    }
}
