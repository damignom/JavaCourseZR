package intensive.Homeworks.Homework2;
import java.util.List;

class Student {
    private String name;
    private List<Book> books;

    public Student(String name, List<Book> books) {
        if (books == null || books.size() < 5) {
            throw new IllegalArgumentException("У студента должно быть минимум 5 книг");
        }
        this.name = name;
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', books=" + books + "}";
    }
}
