package intensive.Homeworks.Homework5.Decorator;

public class BlackTea implements Tea{
    @Override
    public String getDescription() {
        return "Черный чай";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
