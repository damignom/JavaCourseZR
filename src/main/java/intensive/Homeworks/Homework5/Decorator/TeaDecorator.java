package intensive.Homeworks.Homework5.Decorator;

abstract class TeaDecorator implements Tea{
    protected Tea decoratedTea;

    public TeaDecorator(Tea decoratedTea) {
        this.decoratedTea = decoratedTea;
    }

    public TeaDecorator() {
    }

    @Override
    public String getDescription() {
        return decoratedTea.getDescription();
    }

    @Override
    public int getCost() {
        return decoratedTea.getCost();
    }
}
