import javax.swing.*;
import java.util.Calendar;


/*********************************
 CPT163
 Michael Lingsch
 This program will calculate the
 total points earned for the Serendipity
 Booksellers Club
 Created On: 09/20/2018
 Last Modified: 09/26/2018
 *********************************/

public class BookClubPoints {

    public static void main(String[] args) {

        //Define our variables
        String[] currentMonthName = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        String booksPurchasedPerMonth;
        int booksPurchased, pointsEarned;

        //Establish the Current Month
        Calendar cal = Calendar.getInstance();
        String currentMonth = currentMonthName[cal.get(Calendar.MONTH)];

        //Establish how many books were purchased in the Current Month
        booksPurchasedPerMonth = JOptionPane.showInputDialog("How many books have you purchased so far for the month of " + currentMonth + "?");
        booksPurchased = Integer.parseInt(booksPurchasedPerMonth);

        //Calculate how many points they've earned this month
        if (booksPurchased == 0) {
            JOptionPane.showMessageDialog(null, "You've purchased 0 books in the month of " + currentMonth + ".\n" +
                    "You have earned 0 points. I'm disappointed in you.");
        } else if (booksPurchased == 1) {
            pointsEarned = 5;
            JOptionPane.showMessageDialog(null, "You've purchased 1 book in the month of " + currentMonth + ".\n" +
                    "You have earned " + pointsEarned + " points in " + currentMonth + ".");
        } else if (booksPurchased == 2) {
            pointsEarned = 15;
            JOptionPane.showMessageDialog(null, "You've purchased 2 books in the month of " + currentMonth + ".\n" +
                    "You have earned " + pointsEarned + " points in " + currentMonth + ".");

        } else if (booksPurchased == 3) {
            pointsEarned = 30;
            JOptionPane.showMessageDialog(null, "You've purchased 3 books in the month of " + currentMonth + ".\n" +
                    "You have earned " + pointsEarned + " points in " + currentMonth + ".");

        } else if (booksPurchased == 4) {
            pointsEarned = 60;
            JOptionPane.showMessageDialog(null, "You've purchased 4 books in the month of " + currentMonth + ".\n" +
                    "You have earned " + pointsEarned + " points in " + currentMonth + ".");

        } else if (booksPurchased > 4) {
            pointsEarned = 60;
            JOptionPane.showMessageDialog(null, "You've purchased " + booksPurchased + " books in the month of " + currentMonth + ".\n" +
                    "You have earned " + pointsEarned + " points in " + currentMonth + ".");

        } else if (booksPurchased < 0) {
            JOptionPane.showMessageDialog(null, "You haven't purchased any books! Get your act together. Zero points!");

        }

        System.exit(0);

    }
}
