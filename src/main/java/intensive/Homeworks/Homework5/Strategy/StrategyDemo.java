package intensive.Homeworks.Homework5.Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        // Стратегия
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);
        cart.setPaymentStrategy(new VisaPayment());
        cart.checkout(200);
    }
}
