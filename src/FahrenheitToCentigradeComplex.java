import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Micahel Lingsch
 My First Java Program
 This program will convert Centigrade
 to Fahrenheit and visa-versa.
 Created On: 09/09/2018
 Last Modified: 09/09/2018
 *********************************/

public class FahrenheitToCentigradeComplex {

    public static void main(String[] args) {

        Object[] options = {"Centigrade", "Fahrenheit"};
        int n = JOptionPane.showOptionDialog(null,
                "Would you like to start your conversion with Centigrade or Fahrenheit?",
                "Temperature Conversion",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.DEFAULT_OPTION,
                null,
                options,
                options[1]);

        System.out.println(n);

        JFrame metric = new JFrame("Centigrade");
        metric.setBounds(0, 0, 320, 240);

        JFrame imperial = new JFrame("Fahrenheit");
        imperial.setBounds(0, 0, 320, 240);

        if (n == 0) {
            metric.setVisible(true);
        } else if (n == 1) {
            imperial.setVisible(true);
        } else {
            System.out.println("no option choosen");
        }

    }
}
