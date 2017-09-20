package ClassesAndObjects.Temperature;

/**
 * Created by fazer on 05.04.2016.
 */
public class TemperatureConverter {
    public  String convertTemp(int temperature, char convertTo){

        if (convertTo == 'F'){
            temperature = (temperature * 9/5) + 32;
            return temperature + " По фаренгейту";

        }

        else if (convertTo == 'C'){
            temperature = (temperature - 32) * 5/9;
            return temperature + " По цельсию";
        }
        return temperature + "";
    }


    public static void main(String [] args){

        TemperatureConverter tc = new TemperatureConverter();
        System.out.println(tc.convertTemp(100, 'F'));
    }


}
