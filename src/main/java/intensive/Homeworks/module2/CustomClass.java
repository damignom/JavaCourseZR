package intensive.Homeworks.module2;

public abstract class CustomClass {

    private String name;

    public CustomClass(String name){
        this.name = name;
    }

    public abstract void print();

    protected String getName(){
        return  name;
    }

    }
