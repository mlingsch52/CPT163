import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;

/*********************************
 CPT163
 Michael Lingsch
 This program will create the Pet
 Class
 Created On: 10/312018
 Last Modified: 10/31/2018
 *********************************/

public class Pet {

    private String name, animal;
    private int age;

    Pet(String name, int age, String animal){

        setName(name);
        setAge(age);
        setAnimal(animal);

    }

    public void setName(String n){
        name = n;
    }

    public void setAnimal(String a){
        animal = a;
    }

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public String getAnimal(){
        return animal;
    }

    public int getAge(){
        return age;
    }

}
