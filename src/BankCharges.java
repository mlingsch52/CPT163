import javax.swing.*;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

/*********************************
 CPT163
 Michael Lingsch
 This program will calculate the
 total monthly cost for a
 commercial checking account
 Created On: 09/20/2018
 Last Modified: 09/20/2018
 *********************************/

public class BankCharges {

    public static void main(String[] args){

        //Define the variables that we will be using in the program
        String checksUsedPerMonth;
        String[] currentMonthName = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        int checksWritten;
        double checkFees;

        Calendar cal = Calendar.getInstance();
        String currentMonth = currentMonthName[cal.get(Calendar.MONTH)];

        //Ask the user how many checks they have written for this month
        checksUsedPerMonth = JOptionPane.showInputDialog("How many checks have you written so far for the month of " + currentMonth + "?");
        checksWritten = Integer.parseInt(checksUsedPerMonth);

        //Calculate the total fees for the month based on the checks written that month
        if (checksWritten <= 19){
            checkFees = (checksWritten * .1) + 10.0;
            JOptionPane.showMessageDialog(null, "You have used " + checksWritten + " so far in the month of " +
                    currentMonth + ". \n" +
                    "The charge for cashing each check is $.10 on top of the $10 base fee. \n" +
                    "Your total fee is " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(checkFees) );
        }

        else if (checksWritten >= 20 && checksWritten <= 39){
            checkFees = (checksWritten * .08) + 10.0;
            JOptionPane.showMessageDialog(null, "You have used " + checksWritten + " so far in the month of " +
                    currentMonth + ". \n" +
                    "The charge for cashing each check is $.08 on top of the $10 base fee. \n" +
                    "Your total fee is " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(checkFees) );
        }

        else if (checksWritten >= 40 && checksWritten <= 59){
            checkFees = (checksWritten * .06) + 10.0;
            JOptionPane.showMessageDialog(null, "You have used " + checksWritten + " so far in the month of " +
                    currentMonth + ". \n" +
                    "The charge for cashing each check is $.06 on top of the $10 base fee. \n" +
                    "Your total fee is " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(checkFees) );
        }

        else if (checksWritten >= 60){
            checkFees = (checksWritten * .04) + 10.0;
            JOptionPane.showMessageDialog(null, "You have used " + checksWritten + " so far in the month of " +
                    currentMonth + ". \n" +
                    "The charge for cashing each check is $.04 on top of the $10 base fee. \n" +
                    "Your total fee is " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(checkFees) );
        }

    System.exit(0);

    }

}
