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
public class DistanceTraveled {

    public static void main(String[] args) {

        //Define the variables for Speed, Distance, and Time
        int timeTraveled, speedOfTrain, distanceTraveled, x;
        String initialSpeed, initialTimeTraveled;

        //Ask the user for the speed of the vehicle and for how long they are travelling
        initialSpeed = JOptionPane.showInputDialog("How fast is this train going? Please enter a speed in miles per hour.");
        speedOfTrain = Integer.parseInt(initialSpeed);

        initialTimeTraveled = JOptionPane.showInputDialog("How long will you be travelling today? Please enter a time in whole hours.");
        timeTraveled = Integer.parseInt(initialTimeTraveled);

        //Calculate how far you've travelled
        System.out.println("Hours                   Distance Travelled\n" +
                "________________________________________________");
        x = 0;
        while (x <= timeTraveled) {
            distanceTraveled = speedOfTrain * x;
            System.out.println(x + "                            " + distanceTraveled);
            x++;


            //Output how far you've travelled in a loop


        }

        System.exit(0);
    }

}
