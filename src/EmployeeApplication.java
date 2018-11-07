import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will perform the
 employee functions from the Empl;oyeeClass
 Created On: 10/312018
 Last Modified: 10/31/2018
 *********************************/

public class EmployeeApplication {

    public static void main(String[] args){

        EmployeeClass employee = new EmployeeClass("Susan Meyers", 47899, "Accounting", "Vice President");
        EmployeeClass employee1 = new EmployeeClass("Mark Jones", 39119, "IT", "Programmer");
        EmployeeClass employee2 = new EmployeeClass("Joy Rogers", 81774, "Manufacturing", "Engineer");


        System.out.println("Name              ID Number         Department             Position\n" +
                "___________________________________________________________________\n" +
                employee.getName() + "      " + employee.getIdNumber() + "             " + employee.getDepartment() + "             " + employee.getPosition() + "\n" +
                employee1.getName() + "        " + employee1.getIdNumber() + "             " + employee1.getDepartment() + "                     " + employee1.getPosition() + "\n" +
                employee2.getName() + "        " + employee2.getIdNumber() + "             " + employee2.getDepartment() + "          " + employee2.getPosition());

    }

}
