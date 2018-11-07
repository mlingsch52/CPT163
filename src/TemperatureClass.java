/*********************************
 CPT163
 Michael Lingsch
 This program will run the
 Temperature Class
 Created On: 10/312018
 Last Modified: 10/31/2018
 *********************************/

public class TemperatureClass {

    private double tempF;

    TemperatureClass(double tempF){
        setFahrenheit(tempF);
    }

    public void setFahrenheit(double f){
        tempF = f;
    }

    public double getFahrenheit(){
        return tempF;
    }

    public double getCelsius(){
        return ((5f / 9f) * (tempF - 32));
    }

    public double getKelvin(){
        return ((5f / 9f) * (tempF - 32)) + 273;
    }

}
