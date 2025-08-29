package intensive.Homeworks.Homework5.ChainResponsibility;

class AuthHandler extends Handler {
    public void handle(String request) {
        if (request.equals("auth")) System.out.println("Обработка авторизации");
        else if (next != null) next.handle(request);
    }
}
