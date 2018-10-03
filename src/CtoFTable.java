import java.io.IOException;

/*********************************
 CPT163
 Michael Lingsch
 This program will convert Centigrade
 to Fahrenheit and print out a display
 Created On: 09/26/2018
 Last Modified: 10/1/2018
 *********************************/

public class CtoFTable {

    public static void main(String[] args) {

        //Declare your variables
        double  fahrenheit;
        int temp;

        //Let the user know what we are going to be doing here
        System.out.println("We will be showing you a table of Celsius to Fahrenheit conversions!");

        for ( temp = 0; temp <= 40; temp++)
        {
            fahrenheit = (temp * (9 / 5f)) + 32;
            System.out.println( temp + " degrees, Celsius equals " +   Math.round((fahrenheit * 100)) / 100d  + " degrees Fahrenheit");

        }

    }
}
