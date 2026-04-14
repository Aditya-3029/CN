package observer;

public class Main {
    public static void main(String[] args) {

       Channel channel = new Channel();

        Subscriber s1 = new Subscriber("Aditya");
        Subscriber s2 = new Subscriber("Rahul");

        channel.addObserver(s1);
        channel.addObserver(s2);

        channel.uploadVideo("Observer Pattern Explained");
    }
}
