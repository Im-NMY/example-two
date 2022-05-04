package BrandCar;

import Beeper.Beeper;
import CargoCapacity.Cargo;
import Cars.TypeCar;
import Engines.Engine;
import Places.Places;
import Weight.Weight;
import Wheels.Wheels;

public class PAZ extends ConstructorCar {
    public PAZ(Beeper beeper, Engine engine, Cargo cargo, TypeCar car, Places places, Weight weight, Wheels wheels) {
        super(beeper, engine, cargo, car, places, weight, wheels);
    }
}
