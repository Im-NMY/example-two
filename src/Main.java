import Beeper.Beeper;
import Beeper.Bell;
import Beeper.Guitar;
import Beeper.Horn;
import BrandCar.ConstructorCar;
import BrandCar.MAN;
import BrandCar.Mazda6;
import BrandCar.PAZ;
import CargoCapacity.Cargo;
import CargoCapacity.MiddleCargo;
import CargoCapacity.maxCargo;
import CargoCapacity.minCargo;
import Cars.Bus;
import Cars.PassengerCar;
import Cars.Truck;
import Cars.TypeCar;
import Engines.Engine;
import Engines.V12;
import Engines.V6;
import Engines.V8;
import Places.Four;
import Places.Places;
import Places.Seventeen;
import Places.Three;
import Weight.MaxWeight;
import Weight.MinWeight;
import Weight.Middle;
import Weight.Weight;
import Wheels.FourWheels;
import Wheels.SixWheels;
import Wheels.Wheels;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("BrandCar.Mazda6: ");

        Beeper guitar = new Guitar();
        Cargo cargo = new minCargo();
        TypeCar type = new PassengerCar();
        Engine engine = new V6();
        Places places = new Four();
        Weight weight = new MinWeight();
        Wheels wheels = new FourWheels();

        ConstructorCar Mazda6 = new Mazda6(guitar, engine, cargo, type, places, weight, wheels);

        System.out.println(Mazda6.beeper.makeSound());
        System.out.println(Mazda6.engine.getHorsePower());
        System.out.println(Mazda6.car.getTypeCar());
        System.out.println(Mazda6.cargo.getCargoWeight());
        System.out.println(Mazda6.places.getNumberOfSeats());
        System.out.println(Mazda6.weight.getTotalWeight());
        System.out.println(Mazda6.wheels.getWheels());

        System.out.println("-----------------------------------------------");
        System.out.println("Man: ");

        Beeper bell = new Bell();
        Cargo cargo1 = new maxCargo();
        TypeCar type1 = new Truck();
        Engine engine1 = new V12();
        Places places1 = new Three();
        Weight weight1 = new MaxWeight();
        Wheels wheels1 = new SixWheels();

        ConstructorCar man = new MAN(bell, engine1, cargo1, type1, places1, weight1, wheels1);

        System.out.println(man.beeper.makeSound());
        System.out.println(man.engine.getHorsePower());
        System.out.println(man.car.getTypeCar());
        System.out.println(man.cargo.getCargoWeight());
        System.out.println(man.places.getNumberOfSeats());
        System.out.println(man.weight.getTotalWeight());
        System.out.println(man.wheels.getWheels());

        System.out.println("-----------------------------------------------");
        System.out.println("BrandCar.PAZ");

        Beeper beeper = new Horn();
        Cargo cargo2 = new MiddleCargo();
        TypeCar type2 = new Bus();
        Engine engine2 = new V8();
        Places places2 = new Seventeen();
        Weight weight2 = new Middle();
        Wheels wheels2 = new SixWheels();


        ConstructorCar PAZ = new PAZ(beeper, engine2, cargo2, type2, places2, weight2, wheels2);

        System.out.println(PAZ.beeper.makeSound());
        System.out.println(PAZ.engine.getHorsePower());
        System.out.println(PAZ.car.getTypeCar());
        System.out.println(PAZ.cargo.getCargoWeight());
        System.out.println(PAZ.places.getNumberOfSeats());
        System.out.println(PAZ.weight.getTotalWeight());
        System.out.println(PAZ.wheels.getWheels());

        System.out.println("-----------------------------------------------");
        System.out.println("End");
    }
}