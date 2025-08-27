package intensive.Homework5.Strategy;

class VisaPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Оплата " + amount + " через VISA.");
    }
}
