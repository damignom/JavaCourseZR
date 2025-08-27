package intensive.module2;

import intensive.module1.Human;

public class Animal extends Human{
    /*static - говорит о том что переменная или метод принадлежит классу целиком,
    не принадлежит его экземпляру*/
    public static String name = "Animal";

    public Animal(String name, String surname, int age) {
        super(name, surname, age);
    }

    public static void main(String[] args){
       //Human hum = new Human();
        //Animal animal = new Animal();
    }

    public void init(){
        //score - доступна из класса human
    }
}
