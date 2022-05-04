package BrandCar;

import Beeper.Beeper;
import CargoCapacity.Cargo;
import Cars.TypeCar;
import Engines.Engine;
import Places.Places;
import Weight.Weight;
import Wheels.Wheels;

public class MAN extends ConstructorCar{


    public MAN(Beeper beeper, Engine engine, Cargo cargo, TypeCar car, Places places, Weight weight, Wheels wheels) {
        super(beeper, engine, cargo, car, places, weight, wheels);
    }
}
