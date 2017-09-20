package ClassesAndObjects.Cars;

import ClassesAndObjects.Cars.Car;

/**
 * Created by fazer on 05.04.2016.
 */
public class CarOwner{

    public static void main(String[] args){

        int distance;

        Car myCar = new Car();
        Car jamesBondCar = new JamesBondCar();

        myCar.start();
        System.out.println("go!");

        distance = myCar.drive(100);
        distance = jamesBondCar.drive(100);
        System.out.println("We drove through " + distance + " km");

        myCar.stop();
        System.out.println("arrived");
    }
}
