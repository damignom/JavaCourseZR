package intensive.Homeworks.Homework1;

//Интерфейс для позвоночных
interface Vertebrate {
    void hasSpine();
}

//Интерфейс для объектов, имеющих шерсть
interface HasFur {
    void hasFur();
}

//Абстрактный базовый класс для всех животных
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void liveIn();

    public String getName() {
        return name;
    }
}

//Абстрактный класс для млекопитающих
abstract class Mammal extends Animal implements Vertebrate, HasFur {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public void hasSpine() {
        System.out.println(getName() + " имеет позвоночник");
    }

    @Override
    public abstract void hasFur();

    @Override
    public void liveIn() {
        System.out.println(getName() + " живет на суше");
    }
}

//Класс для кошек
class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void hasFur() {
        System.out.println(getName() + " имеет шерсть");
    }
}

//Класс для медведя
class Bear extends Mammal {
    public Bear(String name){
        super(name);
    }

    @Override
    public void hasFur() {
        System.out.println(getName() + " имеет шерсть");
    }
}

class Whale extends Mammal{

    public Whale(String name) {
        super(name);
    }

    @Override
    public void hasFur() {
        System.out.println(getName() + " не имеет шерсть");
    }

    @Override
    public void liveIn(){
        System.out.println(getName() + " живет в воде");
    }
}

//Абстрактный класс для рыб
abstract class Fish extends Animal implements Vertebrate {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void hasSpine() {
        System.out.println(getName() + " имеет позвоночник");
    }

    @Override
    public void liveIn() {
        System.out.println(getName() + " живет в воде");
    }
}

class Dolphin extends Fish {

    public Dolphin(String name) {
        super(name);
    }
}

public class AnimalHierarchy {

    public static void main(String[] args){

        Cat cat = new Cat("Мурка");
        cat.hasFur();
        cat.hasSpine();
        cat.liveIn();

        Bear bear = new Bear("Косолапыч");
        bear.hasFur();
        bear.hasSpine();
        bear.liveIn();

        Whale whale  = new Whale("Кит");
        whale.hasFur();
        whale.hasSpine();
        whale.liveIn();

        Fish fish1 = new Dolphin("Арнольд");
        fish1.hasSpine();
        fish1.liveIn();

        }
    }
