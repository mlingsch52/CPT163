import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will estimate the cost
 of a paint job
 Created On: 10/242018
 Last Modified: 10/24/2018
 *********************************/

public class PaintJobEstimator {

    public static void main(String[] args){

        Scanner keyboard=new Scanner(System.in);
        System.out.println("We are going to calculate the costs with completing your upcoming paint job.");
        System.out.println("Please enter in the Total number of rooms for this job.");
        int numberOfRooms = keyboard.nextInt();


        int x;
        double totalSquareFootage = 0, totalGallons, totalCostOfPaint, hoursOfLabor, totalLaborCost, totalCostOfJob;

        for (x = 1; x <= numberOfRooms; x++){
            System.out.println("Please enter the square footage for room number " + x + ".");
            double roomSquareFootage = keyboard.nextDouble();
            totalSquareFootage += roomSquareFootage;
        }

        System.out.println("Please enter in the cost per gallon of paint.");
        double costPerGallon = keyboard.nextDouble();

        System.out.println("Let's figure out all of the associated costs with this job!\n" +
        "In order to paint " + numberOfRooms + " rooms, you will need the following:");
        System.out.println("The total square footage for all rooms is " + totalSquareFootage + " sq ft.");
        System.out.println("The cost of each gallon of paint is " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(costPerGallon) + ".");

        totalGallons = gallonsNeeded(totalSquareFootage);
        totalCostOfPaint = paintCost(totalGallons, costPerGallon);
        hoursOfLabor = laborHours(totalSquareFootage);
        totalLaborCost = laborCosts(laborHours(totalSquareFootage));
        totalCostOfJob = totalCostOfPaint + totalLaborCost;

        System.out.println("You will need " + totalGallons + " gallons of paint to complete the job at a cost of "
                + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(totalCostOfPaint) + " for paint. \n" +
                        "The total labor hours requried for the job will be " + Math.round((hoursOfLabor * 100) / 100d) + " and the total cost for labor will " +
                "be " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(totalLaborCost) + ". \n" +
                "The total cost of the entire job is " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(totalCostOfJob) + "." );



        System.exit(0);

    }


    public static double gallonsNeeded(double totalSquareFootage){

        return (totalSquareFootage / 115);

    }

    public static double paintCost(double totalGallons, double costPerGallon){

        return (totalGallons * costPerGallon);
    }

    public static double laborHours(double totalSquareFootage){

        return ((totalSquareFootage / 115) * 8);
    }

    public static double laborCosts(double laborHours){

        return (laborHours * 18);
    }

}
