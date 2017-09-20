package ClassesAndObjects.Cars;

import ClassesAndObjects.Cars.Car;

/**
 * Created by fazer on 05.04.2016.
 */
public class JamesBondCar extends Car {

    @Override
    public int drive(int howlong) {

        distance = howlong * 180;
        return distance;
    }
}
