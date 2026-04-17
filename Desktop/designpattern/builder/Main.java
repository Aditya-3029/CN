package builder;

public class Main {
    public static void main(String []args){
        User user1=new User.Builder().setName("Aditya")
                .setAge(20)
                .setEmail("aditya@gmail.com")
                .build();     
        user1.show();
    }
}
