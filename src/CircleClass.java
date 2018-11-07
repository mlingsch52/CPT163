
/*********************************
 CPT163
 Michael Lingsch
 This program will create the Ciccle
 Class
 Created On: 10/312018
 Last Modified: 10/31/2018
 *********************************/

public class CircleClass {

    private double radius;
    private final double pi = 3.14159;

    CircleClass(double radius){

        setRadius(radius);
    }

    CircleClass(){

        setRadius(0.0);
    }

    public void setRadius(double r){
        radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return pi * radius * radius;
    }

    public double getDiameter(){
        return radius * 2;
    }

    public double getCircumference(){
        return 2 * pi * radius;
    }



}
