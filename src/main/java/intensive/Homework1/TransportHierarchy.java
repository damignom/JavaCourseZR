package intensive.Homework1;

//Абстрактный класс для всех транспортных средств
abstract class Vehicle {
    private String name;

    public Vehicle(String name){
        this.name = name;
    }

    public abstract void move();

    public String getName() {
        return name;
    }
}

//Интерфейс для летательных средств
interface AircraftVehicle {
    void hasWings();
    void hasPropeller();
}

//Интерфейс для грузовых средств
interface CargoVehicle {
    void carryCargo();
}

//Интерфейс для транспортных средств с винтом
interface RotorVehicle {
    void hasRotor();
}

//Интерфейс для колесных транспортных средств
interface WheelVehicle{
    void hasWheel();
}

//Класс самолета
class Airplane extends Vehicle implements AircraftVehicle, CargoVehicle, WheelVehicle, RotorVehicle {

    public Airplane(String name){
        super(name);
    }

    @Override
    public void hasWings() {
        System.out.println(getName() + " имеет крылья");
    }

    @Override
    public void hasPropeller() {
        System.out.println(getName() + " имеет пропеллер");
    }

    @Override
    public void carryCargo() {
        System.out.println(getName() + " перевозит груз");
    }

    @Override
    public void hasRotor() {
        System.out.println(getName() + " имеет крылья");
    }

    @Override
    public void move() {
        System.out.println(getName() + " летит по воздуху");
    }

    @Override
    public void hasWheel() {
        System.out.println(getName() + " имеет колеса(шасси)");
    }
}

//Класс вертолета
class Helicopter extends Vehicle implements CargoVehicle, WheelVehicle, RotorVehicle{
    public Helicopter(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " летит по воздуху");
    }

    @Override
    public void carryCargo() {
        System.out.println(getName() + " перевозит грузы");
    }

    @Override
    public void hasRotor() {
        System.out.println(getName() + " имеет винт");
    }

    @Override
    public void hasWheel() {
        System.out.println(getName() + " имеет колеса(шасси)");
    }
}

//Класс катера
class Boat extends Vehicle implements RotorVehicle, CargoVehicle{
    public Boat(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " передвигается по воде");
    }

    @Override
    public void carryCargo() {
        System.out.println(getName() + " перевозит грузы");
    }

    @Override
    public void hasRotor() {
        System.out.println(getName() + " имеет винт");
    }
}

//Класс танкера
class Tanker extends Vehicle implements RotorVehicle, CargoVehicle {
    public Tanker(String name) {
        super(name);
    }

    @Override
    public void carryCargo() {
        System.out.println(getName() + " перевозит грузы");
    }

    @Override
    public void hasRotor() {
        System.out.println(getName() + " имеет винт");
    }

    @Override
    public void move() {
        System.out.println(getName() + " передвигается по воде");
    }
}

//Класс грузовика
class Truck extends Vehicle implements WheelVehicle, CargoVehicle{

    public Truck(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " передвигается по дорогам");
    }

    @Override
    public void hasWheel() {
        System.out.println(getName() + " имеет колеса");
    }

    @Override
    public void carryCargo() {
        System.out.println(getName() + " перевозит грузы");
    }
}

//Класс такси
class Taxi extends Vehicle implements WheelVehicle {
    public Taxi(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " передвигается по дороге");
    }

    @Override
    public void hasWheel() {
        System.out.println(getName() + " имеет колеса");
    }
}

public class TransportHierarchy {
    public static void main (String[] args){
        Airplane airplane = new Airplane("СУ-35");
        airplane.hasWings();
        airplane.carryCargo();
        airplane.hasWheel();
        airplane.move();

        Helicopter helicopter = new Helicopter("Sikorsky CH-54 Tarhe");
        helicopter.hasRotor();
        helicopter.carryCargo();
        helicopter.hasWheel();
        helicopter.move();

        Boat boat = new Boat("КС-164");
        boat.hasRotor();
        boat.carryCargo();
        boat.move();

        Tanker tanker = new Tanker("BU Samra");
        tanker.hasRotor();
        tanker.carryCargo();
        tanker.move();

        Truck truck = new Truck("MAN");
        truck.hasWheel();
        truck.move();
        truck.carryCargo();

        Taxi taxi = new Taxi("Mazda CX6");
        taxi.hasWheel();
        taxi.move();


    }
}
