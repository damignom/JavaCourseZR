package intensive.Homeworks.Homework2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyHashSet<String> set = new MyHashSet<>();
        set.insert("apple");
        set.insert("banana");
        set.insert("orange");
        System.out.println("Set contains 'apple': " + set.contains("apple"));
        set.remove("banana");
        System.out.println("Set contains 'banana':" + set.contains("banana"));

        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Element at index 1: " + list.get(1));
        list.remove(1);
        System.out.println("Element at index 1 after removal: " + list.get(1));

        List<Student> students = List.of(
                new Student("Roma", List.of(
                        new Book("Book R1", "Author A", 150, 1999),
                        new Book("Book R2", "Author B", 200, 2005),
                        new Book("Book R3", "Author C", 300, 2010),
                        new Book("Book R4", "Author D", 120, 2018),
                        new Book("Book R5", "Author E", 180, 1995)
                )),
                new Student("Ruslan", List.of(
                        new Book("Book RR1", "Author F", 220, 2001),
                        new Book("Book RR2", "Author G", 330, 1998),
                        new Book("Book RR3", "Author H", 150, 2003),
                        new Book("Book RR4", "Author I", 400, 2015),
                        new Book("Book RR5", "Author J", 250, 2020)
                )),
                new Student("Cane", List.of(
                        new Book("Book C1", "Author K", 100, 2002),
                        new Book("Book C2", "Author L", 180, 2011),
                        new Book("Book C3", "Author M", 220, 1997),
                        new Book("Book C4", "Author N", 300, 2009),
                        new Book("Book C5", "Author O", 150, 2017)
                ))
        );


        students.stream()
                // Вывод каждого студента
                .peek(System.out::println)
                // Книги каждого студента
                .flatMap(student -> student.getBooks().stream())
                // Сортировка по страницам
                .sorted(Comparator.comparingInt(Book::getPages))
                // Уникальные книги (по equals/hashCode)
                .distinct()
                // Книги > 2000
                .filter(book -> book.getYear() > 2000)
                // Ограничить стрим тремя элементами
                .limit(3)
                // Годы выпуска книг
                .map(Book::getYear)
                // Преобразовать обратно в Optional с коротким замыканием: найти первый год выпуска
                .findFirst()
                // Вывести год выпуска найденной книги или сообщение об отсутствии
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Книга не найдена")
                );
    }
}