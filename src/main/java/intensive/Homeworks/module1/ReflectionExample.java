package intensive.Homeworks.module1;

import java.lang.reflect.Field;

public class ReflectionExample {

    public static void main(String[ ] args) throws NoSuchFieldException, IllegalAccessException {

        Human human = new Human();


        System.out.println(human.getName());
        //REFLECTION API
        // 1. Получаем класс объекта human
        Class<? extends Human> aClass = human.getClass(); // возвращают метадату класса Human
        // 2. Получаем ClassLoader (загрузчик классов)
        System.out.println(aClass.getClassLoader());
        // 3. Получаем приватное поле "name"
        Field name = aClass.getDeclaredField("name");
        // 4. Разрешаем доступ к приватному полю
        name.setAccessible(true);
        // 5. Меняем значение поля на "Roma"
        name.set(human, "Roma");

        System.out.println(human.getName());

    }

}
