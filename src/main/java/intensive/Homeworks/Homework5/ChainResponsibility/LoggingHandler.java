package intensive.Homeworks.Homework5.ChainResponsibility;

class LoggingHandler extends Handler {
    public void handle(String request) {
        if (request.equals("log")) System.out.println("Обработка логирования");
        else if (next != null) next.handle(request);
    }
}
