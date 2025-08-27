package intensive.Modules.Module1;

import java.util.Arrays;

public class Module1 {
    public static void main(String[] args) {
        /*
        ClassLoader'ы - иерархическая система загрузки классов
        Три основных ClassLoader'а:
        Bootstrap ClassLoader
        Загружает core Java классы (java.lang, java.util и т.д.)
        Написан на нативном коде
        Родитель всех остальных
        Extension ClassLoader
        Загружает классы из jre/lib/ext
        Наследует от Bootstrap
        System/Application ClassLoader
        Загружает классы из classpath приложения
        То, что вы пишете сами
        Наследует от Extension
        */

        /*
        Class<?> clazz - это как паспорт класса
        */
        // Сам человек (объект)
        String name = "Вася";

        // Его паспорт (Class объект)
        Class<?> clazz = name.getClass();

        System.out.println(clazz);
        System.out.println(clazz.getName());
        System.out.println(clazz.getPackage());
        System.out.println(clazz.getSimpleName());

        //Что умеет делать класс? (методы)
        System.out.println(Arrays.toString(clazz.getMethods()));
        // [length(), substring(), toUpperCase()...]

        //Какие есть поля? (переменные)
        System.out.println(Arrays.toString(clazz.getDeclaredFields()));
        ;
        System.out.println(Arrays.toString(clazz.getConstructors()));
        ;

        //Как получить этот "паспорт"?
        //1. Через класс
        Class<?> clazz1 = String.class;
        //2. Через объект
        String str = "Hello";
        Class<?> clazz2 = str.getClass();     // получили паспорт через объект
        //По имени класса
        //Class<?> clazz3 = Class.forName(java.lang.String); // по полному имени

        /*Что значит <?>?
        Это дженерик - означает "класс любого типа":*/

        //Class<String> - паспорт только для String

        //Class<?> - паспорт для любого класса

        /*Class<?> clazz — это объект-описатель, который содержит всю метаинформацию о классе:

        Имя, методы, поля, конструкторы

        Позволяет работать с классом во время выполнения программы

        Это основа для рефлексии и динамического программирования
        */

        //Class modifiers - final, abstract, sealed, non-sealed, static
        //Method modifiers - static, abstract, final, default, synchronized, native

    }
}
