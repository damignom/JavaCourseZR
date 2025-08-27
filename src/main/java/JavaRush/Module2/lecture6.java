package JavaRush.Module2;

public class lecture6 {
    public static void main(String[] args) {
        /*
        В переменную tagline нужно записать строку "JustDoIt".
        Используй s1, s2, s3 и конкатенацию строк.
        */
        String s1 = "Just",
                s2 = "Do",
                s3 = "It";
        String tagline = s1 + s2 + s3;

        System.out.println(tagline);

        /*Заполни пробелы пустотой... или наоборот.
        Используй переменную emptiness, строки с одним пробелом и конкатенацию строк,
        чтобы записать в переменную fullness строку "пустота пустота пустота".*/

        String emptiness = " ";
        String empty = "пустота";
        String fullness = empty + emptiness + empty + emptiness + empty;

        System.out.println(fullness);

        /*В переменную digits нужно записать строку "60".
        Используй переменные x, y, z, пустую строку и конкатенацию строк.*/
        int x = 6;
        int y = 0;
        String z = "";
        String digits = z + x + y;

        System.out.println(digits);

        /*В переменную hugeAmount нужно записать число 100500.
        Используй переменные bigAmount, greatAmount и преобразование строки в число.
        Для объявления и инициализации hugeAmount используй одну команду.*/

        String bigAmount = "100", greatAmount = "500";

        int hugeAmount = Integer.parseInt(bigAmount + greatAmount);

        System.out.println(hugeAmount);

        /*
        В методе main на экран выводятся значения трех строк. Внеси изменения в код,
         чтобы вместо значений строк, вывелись их длины.
         */
        String firstStr = "first string ";
        String secStr = "second string ";
        String thirdStr = "third string ";


        System.out.println(firstStr.length());
        System.out.println(secStr.length());
        System.out.println(thirdStr.length());

        /*
        Метод main выводит на экран четыре строки.
        Все они - яркий пример злоупотребления заглавными буквами.
        Внеси изменения в код, чтобы все буквы в этих строках стали строчными
        */
        System.out.println("ADASDASBBV".toLowerCase());
        System.out.println("AQWEQWE".toLowerCase());
        System.out.println("BVASDASD".toLowerCase());
        System.out.println("ОВАОВьтфыльFDDFDАВФ".toLowerCase());


    }
}
