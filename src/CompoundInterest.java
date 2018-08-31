import java.util.Scanner;
import javax.swing.JOptionPane;

/*********************************
 CPT163
 Micahel Lingsch
 My First Java Program
 This program will calculate compound interest
 Created On: 08/29/2018
 Last Modified: 08/29/2018
 *********************************/

public class CompoundInterest {

    public static void main(String[] args) {

        //declare variables that we will be using
        double amountAfterInterestOverTime, principleInvested, numberOfYears, annualInterestRate, roundedInterestOverTime;
        int numberOfTimesCompounded;


        //prompt the user to input the needed values
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the amount of principal initially invested as xx.xx");
        principleInvested = keyboard.nextDouble();

        System.out.println("Enter the annual interest rate as xx.xx");
        annualInterestRate = keyboard.nextDouble();

        System.out.println("Enter the number of times the interest has been compounded as a whole number");
        numberOfTimesCompounded = keyboard.nextInt();

        System.out.println("Enter the number of years the account will be left to earn interest as a whole number or x.x");
        numberOfYears = keyboard.nextDouble();

        //provide the formula for calculating the compound interest
        amountAfterInterestOverTime = principleInvested * Math.pow((1 + annualInterestRate / numberOfTimesCompounded), numberOfTimesCompounded * numberOfYears);

        //print out the final amount after interest
        System.out.println("Your investment is now worth "+ amountAfterInterestOverTime + " dollars!");

    }

}
