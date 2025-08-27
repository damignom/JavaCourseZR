package intensive.Homework5.ChainResponsibility;

public class ChainDemo {
    public static void main(String[] args) {
        Handler authHandler = new AuthHandler();
        Handler loggingHandler = new LoggingHandler();

        authHandler.setNext(loggingHandler);

        // Пробуем разные запросы
        System.out.println("Запрос: auth");
        authHandler.handle("auth");

        System.out.println("\nЗапрос: log");
        authHandler.handle("log");

        System.out.println("\nЗапрос: logout");
        authHandler.handle("logout");
    }
}
