package intensive.Homework3;
import java.io.*;

public class FileWorker {

    public void writeToFile(String fileName, String data) throws FileException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        } catch (IOException e) {
            throw new FileException("Ошибка записи в файл: " + fileName, e);
        }
    }

    public String readFromFile(String fileName) throws FileException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new FileException("Ошибка чтения из файла: " + fileName, e);
        }
        return sb.toString();
    }
}
