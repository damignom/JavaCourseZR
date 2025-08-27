package intensive.Homework5.Decorator;

public class DemoDecorator {
    public static void main(String[] args) {
        Tea tea = new BlackTea();
        tea = new MilkDecorator(tea);
        System.out.println(tea.getDescription() + " стоит " + tea.getCost());
    }
}
