import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will demonstrate the
 Car Class
 Created On: 10/312018
 Last Modified: 10/31/2018
 *********************************/

public class CarApplication {

    public static void main(String[] args){

        CarClass car1 = new CarClass(2018,"Chevrolet");

        System.out.println("Here we go....");
        for (int i = 1; i <=5; i++){
            car1.accelerate();
            System.out.println("Your " + car1.getYearModel() + " " + car1.getMake() + " is currently travelling " +
                    car1.getSpeed() + " miles per hour.");
        }

        System.out.println("\nSlow it down now....");
        for (int i = 1; i <=5; i++){
            car1.brake();
            System.out.println("Your " + car1.getYearModel() + " " + car1.getMake() + " is currently travelling " +
                    car1.getSpeed() + " miles per hour.");
        }

    }

}
