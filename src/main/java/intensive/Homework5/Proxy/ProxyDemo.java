package intensive.Homework5.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("1.png");
        image.display(); // загрузка и просмотр
        image.display(); // только просмотр
    }
}
