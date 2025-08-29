package intensive.Homeworks.Homework5.Builder;

class User {
    private String name;
    private int age;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    static class Builder {
        private String name;
        private int age;
        public Builder setName(String name) { this.name = name; return this; }
        public Builder setAge(int age) { this.age = age; return this; }
        public User build() { return new User(this); }
    }
}