package intensive.module2;


//@FunctionalInterface - если только один абстрактный метод
public interface AnotherInt {

    String name = "name";

    void int2Method();

    void m1();

    //default - метод с реализацией
    default void defMethod(){
        System.out.println("Def method");
    }


    private void privateMethod(){

    }

    //
}
