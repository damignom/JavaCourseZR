package intensive.Homework5.Decorator;

class MilkDecorator extends TeaDecorator {
    public MilkDecorator(Tea tea) {
        super(tea);
    }
    public String getDescription() {
        return decoratedTea.getDescription() + ", c молоком";
    }
    public int getCost() {
        return decoratedTea.getCost() + 5;
    }
}
