import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will run the Circle
 Application
 Created On: 10/312018
 Last Modified: 10/31/2018
 *********************************/

public class CircleApplication {

    public static void main(String[] args){


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hey there! Please tell me the radius of your circle: ");
        double radius = keyboard.nextDouble();

        CircleClass circle = new CircleClass(radius);

        System.out.println("Your circle has a radius of " + radius + " and PI is equal to 3.14159\n" +
                "Your circle's area is " + circle.getArea() + "!\n" +
                "Your circle's diameter is " + circle.getDiameter() + "!\n" +
                "Your circle's circumference is " + circle.getCircumference() + "!\n");

    }

}
