package intensive.Homeworks.Homework5.Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        User user = new User.Builder().setName("Roma").setAge(26).build();
        System.out.println(user);
    }
}
