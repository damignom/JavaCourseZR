package intensive.Homework5.Strategy;

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Оплата " + amount + " с помощью кредитной карты.");
    }
}
