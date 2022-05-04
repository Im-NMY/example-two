package BrandCar;

import Beeper.Beeper;
import CargoCapacity.Cargo;
import Cars.TypeCar;
import Engines.Engine;
import Places.Places;
import Weight.Weight;
import Wheels.Wheels;

public abstract class ConstructorCar {
    public static Beeper beeper;
    public static Engine engine;
    public static Cargo cargo;
    public static TypeCar car;
    public static Places places;
    public static Weight weight;
    public static Wheels wheels;

    public ConstructorCar(Beeper beeper, Engine engine, Cargo cargo, TypeCar car, Places places, Weight weight, Wheels wheels){
        ConstructorCar.beeper = beeper;
        ConstructorCar.engine = engine;
        ConstructorCar.cargo = cargo;
        ConstructorCar.car = car;
        ConstructorCar.places = places;
        ConstructorCar.weight = weight;
        ConstructorCar.wheels = wheels;

    }
}
