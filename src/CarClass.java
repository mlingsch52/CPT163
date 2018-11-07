/*********************************
 CPT163
 Michael Lingsch
 This program will create the Car
 Class
 Created On: 10/312018
 Last Modified: 10/31/2018
 *********************************/

public class CarClass {

    private int yearModel, speed;
    private String make;

    CarClass(int yearModel, String make){

        setYearModel(yearModel);
        setMake(make);
        setSpeed(0);

    }


    public void setYearModel(int y) {
        yearModel = y;
    }

    public void setMake(String m) {
        make = m;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public String getMake(){
        return make;
    }
    public int getYearModel(){
        return yearModel;
    }
    public int getSpeed(){
        return speed;
    }

    public void accelerate(){
        speed += 5;
    }

    public void brake(){
        speed -= 5;
    }

}
