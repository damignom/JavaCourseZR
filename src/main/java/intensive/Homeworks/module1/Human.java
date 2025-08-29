package intensive.Homeworks.module1;

//public явно узакан
//package private по дефолту, если нет модификатора доступа ( class Human {} ), будет доступен только в своем пакете,
//будет возможность создать его в другом пакете


public class Human {

    {

    }

    static {

    }

    public static class InnnerHuman {

    }

    //public static final переменные являются константами ! Они не изменяемые
    private static final String gender = "Male";
    //private - модификатор который доступен только в рамках класса
    //private static String gender = "Male";


    private String name;

    private String surname;

    private int age;

    //protected - модификатор доступна в классе наследнике и в любом классе этого пакета
    protected Integer score;

//    public Human() {
//    }

    public Human() {

    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    //this - означает что бы обращаемся в своему же классу целиком

    //инкапсуляция ознаначает, сокрытие реализации от пользователя, и даете интерфейс для работы с этим классом,
    // при помощи специальных методов get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    public static void main(String[] args){
//        Human human = new Human();
//        //В статическом контексте запрещено использовать нестатические переменные
//        //Статические переменные можно использовать где угодно
//        String str1 = Human.gender;


}

