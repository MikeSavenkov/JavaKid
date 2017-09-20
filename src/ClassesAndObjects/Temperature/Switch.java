package ClassesAndObjects.Temperature;

/**
 * Created by fazer on 08.04.2016.
 */
public class Switch {
    public  String convertTemp(int temperature, char convertTo){

        switch (convertTo){
            case 'F':
                temperature = (temperature * 9/5) + 32;
                return temperature + " По фаренгейту";

            case 'C':
                temperature = (temperature - 32) * 5/9;
                return temperature + " По цельсию";

        }
        return temperature + "";
    }


    public static void main(String [] args){

        Switch sw = new Switch();
        System.out.println(sw.convertTemp(100, 'C'));
    }


}