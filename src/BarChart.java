import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will convert Centigrade
 to Fahrenheit and Inches to Centimeters.
 Created On: 10/01/2018
 Last Modified: 10/01/2018
 *********************************/

public class BarChart {

    public static void main(String[] args){

        //declare the variables that we will be using here
        String storeOneSales, storeTwoSales, storeThreeSales, storeFourSales, storeFiveSales;
        int storeOne, storeTwo, storeThree, storeFour, storeFive;

        //describe to the end user what will be taking place
        JOptionPane.showMessageDialog(null , "We will be creating a graphical representation comparing the sales\n" +
                "of Five retail stores. Please supply the sales figure as a whole number rounded to the nearest 100. ");


        //input all the variables needed for the program
        storeOneSales= JOptionPane.showInputDialog("Please enter today's sales figure for Store 1. Remember to supply the sales figure as\n" +
                "a whole number rounded to the nearest 100.");
        storeOne = Integer.parseInt(storeOneSales) / 100;

        storeTwoSales = JOptionPane.showInputDialog("Please enter today's sales figure for Store 2. Remember to supply the sales figure as\n" +
                "a whole number rounded to the nearest 100.");
        storeTwo = Integer.parseInt(storeTwoSales) / 100;

        storeThreeSales= JOptionPane.showInputDialog("Please enter today's sales figure for Store 3. Remember to supply the sales figure as\n" +
                "a whole number rounded to the nearest 100.");
        storeThree = Integer.parseInt(storeThreeSales) / 100;

        storeFourSales = JOptionPane.showInputDialog("Please enter today's sales figure for Store 4. Remember to supply the sales figure as\n" +
                "a whole number rounded to the nearest 100.");
        storeFour = Integer.parseInt(storeFourSales) / 100;

        storeFiveSales = JOptionPane.showInputDialog("Please enter today's sales figure for Store 5. Remember to supply the sales figure as\n" +
                "a whole number rounded to the nearest 100.");
        storeFive = Integer.parseInt(storeFiveSales) / 100;

        //run the loops to figure out how many marks on the chart each store will receive and print the output
        int x = 1;

        System.out.println("Sales Bar Chart");
        System.out.print("Store 1: ");
        while (x <= storeOne) {

            System.out.print("*");
            x++;
        }

        x = 1;
        System.out.println();
        System.out.print("Store 2: ");
        while (x <= storeTwo) {

            System.out.print("*");
            x++;
        }

        x = 1;
        System.out.println();
        System.out.print("Store 3: ");
        while (x <= storeThree) {

            System.out.print("*");
            x++;
        }

        x = 1;
        System.out.println();
        System.out.print("Store 4: ");
        while (x <= storeFour) {

            System.out.print("*");
            x++;
        }

        x = 1;
        System.out.println();
        System.out.print("Store 5: ");
        while (x <= storeFive) {

            System.out.print("*");
            x++;
        }

        System.exit(0);
    }

}
