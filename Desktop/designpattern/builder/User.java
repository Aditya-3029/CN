package builder;

public class User {
    private String name;
    private int age;
    private String email;
    private String phone;
    private User(Builder builder){
        name=builder.name;
        age=builder.age;
        email=builder.email;
        phone=builder.phone;
    }
    
    public static class Builder{
        
        private String name;
        private int age;
        private String email;
        private String phone;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public void show() {
        System.out.println(name + " " + age + " " + email + " " + phone);
    }

}
