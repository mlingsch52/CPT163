import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will create an Employee
 Class
 Created On: 10/312018
 Last Modified: 10/31/2018
 *********************************/

public class EmployeeClass {

    private String name, department, position;
    private int idNumber;

    EmployeeClass(String name, int idNumber, String department, String position){

        setName(name);
        setIdNumber(idNumber);
        setDepartment(department);
        setPosition(position);
    }

    EmployeeClass(String name, int idNumber){

        setName(name);
        setIdNumber(idNumber);
        setDepartment("");
        setPosition("");
    }

    EmployeeClass(){

        setName("");
        setIdNumber(0);
        setDepartment("");
        setPosition("");
    }

    public void setName(String n){
        name = n;
    }

    public void setIdNumber(int i){
        idNumber = i;
    }

    public void setDepartment(String d){
        department = d;
    }

    public void setPosition(String p){
        position = p;
    }

    public String getName(){
        return name;
    }

    public int getIdNumber(){
        return idNumber;
    }

    public String getDepartment(){
        return department;
    }

    public String getPosition(){
        return position;
    }
}
