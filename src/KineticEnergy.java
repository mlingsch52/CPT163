import java.security.PublicKey;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will calculate Kinetic
 Energy
 Created On: 10/242018
 Last Modified: 10/24/2018
 *********************************/

public class KineticEnergy {

    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Today we are studying physics! We will be calculating kinetic energy! \n" +
                "Please enter the mass of the object in motion in kilograms: ");
        double mass = keyboard.nextDouble();
        System.out.println("Please enter the velocity of the object in motion, in meters per second!");
        double velocity = keyboard.nextDouble();

        double energy = kineticEnergy(mass,velocity);

        System.out.println("The kinetic energy of the object is " + energy + ".");

        System.exit(0);

    }

    public static double kineticEnergy(double mass, double velocity){

        return (.5 * Math.pow((mass * velocity),2));

    }

}
