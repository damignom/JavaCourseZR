package JavaRush.Module2;

import java.util.Locale;
import java.util.Scanner;

public class lecture7 {
    public static void main(String[] args)
    {
        /*
        Считай с клавиатуры три строки.А затем:
        1. Выведи на экран третью строку в неизменном виде.
        2. Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
        3. Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
        Пример ввода: Строка Номер РАЗ Втор
        */
        Scanner console = new Scanner(System.in);
        String s1 = console.nextLine();
        String s2 = console.nextLine();
        String s3 = console.nextLine();

        System.out.println(s3);
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
    }
}
