package intensive.Homework3;

public class Main {
    public static void main(String[] args) {
        FileWorker fileHandler = new FileWorker();
        String fileName = "data.txt";
        String data = "Много разных данных";

        try {
            fileHandler.writeToFile(fileName, data);
            System.out.println("Данные успешно записаны в файл.");

            String readData = fileHandler.readFromFile(fileName);
            System.out.println("Читаем данные из файла:");
            System.out.println(readData);
        } catch (FileException e) {
            System.err.println("Произошла ошибка при работе с файлом: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
